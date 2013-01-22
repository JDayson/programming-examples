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
public interface AddressBookDataAccess {
    public AddressBookEntry findPerson(String lastName);
    public boolean savePerson(
            AddressBookEntry person) throws DataAccessException;
    public boolean newPerson(
            AddressBookEntry person) throws DataAccessException;
    public boolean deletePerson(
            AddressBookEntry person) throws DataAccessException;
    
    public void close();
}
