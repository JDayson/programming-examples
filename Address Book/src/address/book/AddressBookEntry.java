/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;

/**
 *
 * @author Administrator
 */
public class AddressBookEntry {
    private String firstName = "";    
    private String lastName = "";    
    private String address1 = "";    
    private String address2 = "";    
    private String city = "";    
    private String state = "";    
    private String zipcode = "";    
    private String phoneNumber = "";    
    private String emailAddress = "";    
    private int personID;
    private int addressID;
    private int phoneID;
    private int emailID;
    
    public AddressBookEntry(){
        
    }
    
    public AddressBookEntry(int id){
        personID = id;
    }
    
    public void setFirstName(String first){
        firstName = first;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String last){
        lastName = last;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setAddress1(String firstLine){
        address1 = firstLine;
    }
    
    public String getAddress1(){
        return address1;
    }
    
    public void setAddress2(String secondLine){
        address2 = secondLine;
    }
    
    public String getAddress2(){
        return address2;
    }
    
    public void setCity(String personCity){
        city = personCity;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setState(String personState){
        state = personState;
    }
    
    public String getState(){
        return state;
    }
    
    public void setZipcode(String zip){
        zipcode = zip;
    }
    
    public String getZipcode(){
        return zipcode;
    }
    
    public void setPhoneNumber(String number){
        phoneNumber = number;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setEmailAddress(String email){
        emailAddress = email;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public int getPersonID(){
        return personID;
    }
    
    public void setAddressID(int id){
        addressID = id;
    }
    
    public int getAddressID(){
        return addressID;
    }
    
    public void setPhoneID(int id){
        phoneID = id;
    }
    
    public int getPhoneID(){
        return phoneID;
    }
    
    public void setEmailID(int id){
        emailID = id;
    }
    
    public int getEmailID(){
        return emailID;
    }
}
