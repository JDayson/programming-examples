/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class DataAccess implements AddressBookDataAccess {
    static final String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    static final String DATABASE_URL = "jdbc:odbc:AccessBooks";
    static final String USERNAME = "itt";
    static final String PASSWORD = "itt";
    
    private Connection connection;
    private PreparedStatement sqlFind;
    private PreparedStatement sqlPersonID; 
    
    private PreparedStatement sqlInsertName;
    private PreparedStatement sqlInsertAddress;
    private PreparedStatement sqlInsertPhone;
    private PreparedStatement sqlInsertEmail;
    
    private PreparedStatement sqlUpdateName;
    private PreparedStatement sqlUpdateAddress;
    private PreparedStatement sqlUpdatePhone;
    private PreparedStatement sqlUpdateEmail;
    
    private PreparedStatement sqlDeleteName;
    private PreparedStatement sqlDeleteAddress;
    private PreparedStatement sqlDeletePhone;
    private PreparedStatement sqlDeleteEmail;
    
    public DataAccess() throws Exception{
        connect();
        sqlFind = connection.prepareStatement(
                "SELECT names.personID, names.firstName, names.lastName, " +
                "addresses.addressID, addresses.address1, addresses.address2, "
                + "addresses.city, addresses.state, addresses.zipcode, "
                + "phoneNumbers.phoneID, phoneNumbers.phoneNumber, "
                + "emailAddresses.emailID, emailAddresses.emailAddress " +
                "FROM names, addresses, phoneNumbers, emailAddresses " +
                "WHERE names.lastName = ? AND " +
                "names.personID = addresses.personID AND " +
                "names.personID = phoneNumbers.personID AND " +
                "names.personID = emailAddresses.personID");
        sqlPersonID = connection.prepareStatement("Select Max(personID) "
                + "From names");
        sqlInsertName = connection.prepareStatement(
                "INSERT INTO names (firstName, lastName) " +
                "VALUES (?, ?)");
        sqlInsertAddress = connection.prepareStatement(
                "INSERT INTO addresses (address1, address2, city, state, "
                + "zipcode) VALUES(?, ?, ?, ?, ?)");
        sqlInsertPhone = connection.prepareStatement(
                "INSERT INTO phoneNumbers (phoneNumber) VALUES (?)");
        sqlInsertEmail = connection.prepareStatement(
                "INSERT INTO emailAddresses (emailAddress) VALUES (?)");
        sqlUpdateName = connection.prepareStatement(
                "UPDATE names SET firstName = ?, lastName = ? " +
                "WHERE personID = ?");
        sqlUpdateAddress = connection.prepareStatement(
                "UPDATE addresses SET address1 = ?, address2 = ?, " +
                "city = ?, state = ?, zipcode = ?, " +
                "WHERE addressID = ?");
        sqlUpdatePhone = connection.prepareStatement(
                "UPDATE phoneNumbers SET phoneNumber = ? " +
                "WHERE phoneID = ?");
        sqlUpdateEmail = connection.prepareStatement(
                "UPDATE emailAddresses SET emailAddress = ? " +
                "WHERE emailID = ?");
        sqlDeleteName = connection.prepareStatement(
                "DELETE FROM names WHERE personID = ?");
        sqlDeleteAddress = connection.prepareStatement(
                "DELETE FROM addresses WHERE personID = ?");
        sqlDeletePhone = connection.prepareStatement(
                "DELETE FROM phoneNumbers WHERE personID = ?");
        sqlDeleteEmail = connection.prepareStatement(
                "DELETE FROM emailAddresses WHERE personID = ?");
    }
    
    private void connect() throws Exception{
        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DATABASE_URL, USERNAME,
                PASSWORD);
        connection.setAutoCommit(false);
    }
    
    public AddressBookEntry findPerson(String lastName){
        try{
            sqlFind.setString(1, lastName);
            System.out.println("Before executing lastName = " + lastName  
                     + " sqlFind = " + sqlFind.toString());
            ResultSet resultSet = sqlFind.executeQuery();
            System.out.println("After executing lastName = " + lastName 
                    + "resultset = " + resultSet.toString());
            if (!resultSet.next()){
                System.out.println("query by lastName fails");
                System.out.println(sqlFind);
                return null;
            }
            else{
                System.out.println("query lastName okay");
                AddressBookEntry person = new AddressBookEntry(
                        resultSet.getInt(1));
                person.setFirstName(resultSet.getString(2));
                person.setLastName(resultSet.getString(3));
                person.setAddressID(resultSet.getInt(4));
                person.setAddress1(resultSet.getString(5));
                person.setAddress2(resultSet.getString(6));
                person.setCity(resultSet.getString(7));
                person.setState(resultSet.getString(8));
                person.setZipcode(resultSet.getString(9));
                person.setPhoneID(resultSet.getInt(10));
                person.setPhoneNumber(resultSet.getString(11));
                person.setEmailID(resultSet.getInt(12));
                person.setEmailAddress(resultSet.getString(13));
                return person;
            }
        }
        catch(SQLException sqlException){
            return null;
        }
    }
    
    public boolean savePerson(AddressBookEntry person) throws 
            DataAccessException{
        try{
            int result;
            sqlUpdateName.setString(1, person.getFirstName());
            sqlUpdateName.setString(2, person.getLastName());
            sqlUpdateName.setInt(3, person.getPersonID());
            result = sqlUpdateName.executeUpdate();
            System.out.println("firstname = " + person.getFirstName() +
                    "lastname = " + person.getLastName() + "personID = " +
                    person.getPersonID());
            if (result == 0){
                System.out.println("update names table fails");
                System.out.println(sqlUpdateName);
                connection.rollback();
                return false;
            }
            else{
                System.out.println("update names table okay");
                sqlUpdateAddress.setString(1, person.getAddress1());
                sqlUpdateAddress.setString(2, person.getAddress2());
                sqlUpdateAddress.setString(3, person.getCity());
                sqlUpdateAddress.setString(4, person.getState());
                sqlUpdateAddress.setString(5, person.getZipcode());
                sqlUpdateAddress.setInt(6, person.getAddressID());
                result = sqlUpdateAddress.executeUpdate();
                if (result == 0){
                    System.out.println("updateaddress table fails");
                    connection.rollback();
                    return false;
                }
                else{
                    System.out.println("update names table okay");
                    sqlUpdatePhone.setString(1, person.getPhoneNumber());
                    sqlUpdatePhone.setInt(2, person.getPhoneID());
                    result = sqlUpdatePhone.executeUpdate();
                    if (result == 0){
                        System.out.println("update phoneNumbers table fails");
                        connection.rollback();
                        return false;
                    }
                    else{
                        System.out.println("update phoneNumbers okay");
                        sqlUpdateEmail.setString(1, person.getEmailAddress());
                        sqlUpdateEmail.setInt(2, person.getEmailID());
                        result = sqlUpdateEmail.executeUpdate();
                        if (result == 0){
                            System.out.println("update emailAddresses"
                                    + " table fails");
                            connection.rollback();
                            return false;
                        }
                        else{
                            System.out.println("update emailAddress table okay");
                            connection.commit();
                            return true;
                        }
                    }
                }
            }
        }
        catch (SQLException sqlException){
            try{
                connection.rollback();
                return false;
            }
            catch (SQLException exception){
                throw new DataAccessException(exception);
            }
        }
    }
    
    public boolean newPerson(AddressBookEntry person) 
            throws DataAccessException{
        try {
            int result;
            sqlInsertName.setString(1, person.getFirstName());
            sqlInsertName.setString(2, person.getLastName());
            result = sqlInsertName.executeUpdate();
            if (result == 0){
                System.out.println("insert names table fails");
                connection.rollback();
                return false;
            }
            else{
                System.out.println("insert names table okay");
                ResultSet resultPersonID = sqlPersonID.executeQuery();
                if (resultPersonID.next()){
                    int personID = resultPersonID.getInt(1);
                    sqlInsertAddress.setInt(1, personID);
                    sqlInsertAddress.setString(2, person.getAddress1());
                    sqlInsertAddress.setString(3, person.getAddress2());
                    sqlInsertAddress.setString(4, person.getCity());
                    sqlInsertAddress.setString(5, person.getState());
                    sqlInsertAddress.setString(6, person.getZipcode());
                    result = sqlInsertAddress.executeUpdate();
                    if (result == 0){
                        System.out.println("insert address table fails");
                        connection.rollback();
                        return false;
                    }
                    else{
                        System.out.println("insert address table okay");
                        sqlInsertPhone.setInt(1, personID);
                        sqlInsertPhone.setString(2, person.getPhoneNumber());
                        result = sqlInsertPhone.executeUpdate();
                        if (result == 0){
                            System.out.println("insert phoneNumbers"
                                    + " table fails");
                            connection.rollback();
                            return false;
                        }
                        else{
                            System.out.println("insert phoneNumbers "
                                    + "table okay");
                            sqlInsertEmail.setInt(1, personID);
                            sqlInsertEmail.setString(2, person.getEmailAddress());
                            result = sqlInsertEmail.executeUpdate();
                            if (result == 0){
                                System.out.println("insert emailAddress "
                                        + "table fails");
                                connection.rollback();
                                return false;
                            }
                            else{
                                System.out.println("insert emailAddress"
                                        + "table okay");
                                connection.commit();
                                return true;
                            }
                        }
                    }
                }
                else{
                    return false;
                }
            }
        }
        catch (SQLException sqlException){
            try{
                connection.rollback();
                return false;
            }
            catch (SQLException exception){
                throw new DataAccessException(exception);
            }
        }
    }
    
    public boolean deletePerson(AddressBookEntry person) 
            throws DataAccessException{
        try{
            int result;
            sqlDeleteAddress.setInt(1, person.getPersonID());
            result = sqlDeleteAddress.executeUpdate();
            if (result == 0){
                System.out.println("delete from address table fails");
                connection.rollback();
                return false;
            }
            else{
                System.out.println("delete from address table okay");
                sqlDeletePhone.setInt(1, person.getPersonID());
                result = sqlDeletePhone.executeUpdate();
                if (result == 0){
                    System.out.println("delete from phoneNumbers "
                            + "table fails");
                    connection.rollback();
                    return false;
                }
                else{
                    System.out.println("delete form phoneNumber"
                            + "table okay");
                    sqlDeleteEmail.setInt(1, person.getPersonID());
                    result = sqlDeleteEmail.executeUpdate();
                    if (result == 0){
                        System.out.println("delete from emailAddress"
                                + "table fails");
                        connection.rollback();
                        return false;
                    }
                    else{
                        System.out.println("delete from emailAddress"
                                + "table okay");
                        sqlDeleteName.setInt(1, person.getPersonID());
                        result = sqlDeleteName.executeUpdate();
                        if (result == 0){
                            System.out.println("delete from names table fails");
                            connection.rollback();
                            return false;
                        }
                        else{
                            System.out.println("delete from names table okay");
                            connection.commit();
                            return true;
                        }
                    }
                }
            }
        }
        catch (SQLException sqlException){
            try{
                connection.rollback();
                return false;
            }
            catch (SQLException exception){
                throw new DataAccessException(exception);
            }
        }
    }
    
    public void close(){
        try{
            sqlFind.close();
            sqlPersonID.close();
            sqlInsertName.close();
            sqlInsertAddress.close();
            sqlInsertPhone.close();
            sqlInsertEmail.close();
            sqlUpdateName.close();
            sqlUpdateAddress.close();
            sqlUpdatePhone.close();
            sqlUpdateEmail.close();
            sqlDeleteName.close();
            sqlDeleteAddress.close();
            sqlDeletePhone.close();
            sqlDeleteEmail.close();
            connection.close();
        }
        catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
    
    protected void finalize(){
        close();
    }
}
