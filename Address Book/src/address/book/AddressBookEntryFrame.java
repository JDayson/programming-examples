/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class AddressBookEntryFrame extends JInternalFrame {
    private HashMap fields;    
    private AddressBookEntry person;    
    private JPanel leftPanel, rightPanel;    
    private static int xOffset = 0, yOffset = 0;
    
    private static final String FIRST_NAME = "First Name",
            LAST_NAME = "Last Name", ADDRESS1 = "Address 1",
            ADDRESS2 = "Address 2", CITY = "City", STATE = "State",
            ZIPCODE = "Zipcode", PHONE = "Phone", EMAIL = "Email";
    
    public AddressBookEntryFrame(){
        super("Address Book Entry", true, true);
        fields = new HashMap();
        
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(9, 1, 0, 5));
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(9, 1, 0, 5));
        
        createRow(FIRST_NAME);
        createRow(LAST_NAME);
        createRow(ADDRESS1);
        createRow(ADDRESS2);
        createRow(CITY);
        createRow(STATE);
        createRow(ZIPCODE);
        createRow(PHONE);
        createRow(EMAIL);
        
        Container container = getContentPane();
        container.add(leftPanel, BorderLayout.WEST);
        container.add(rightPanel, BorderLayout.CENTER);
        
        setBounds(xOffset, yOffset, 300, 300);
        xOffset = (xOffset + 30) % 300;
        yOffset = (yOffset + 30) % 300;
    }
    
    public void setAddressBookEntry(AddressBookEntry entry){
        person = entry;
        
        setField(FIRST_NAME, person.getFirstName());
        setField(LAST_NAME, person.getFirstName());
        setField(ADDRESS1, person.getFirstName());
        setField(ADDRESS2, person.getFirstName());
        setField(CITY, person.getFirstName());
        setField(STATE, person.getFirstName());
        setField(ZIPCODE, person.getFirstName());
        setField(PHONE, person.getFirstName());
        setField(EMAIL, person.getFirstName());
    }
    
    public AddressBookEntry getAddressBookEntry(){
        person.setFirstName(getField(FIRST_NAME));
        person.setLastName(getField(LAST_NAME));
        person.setAddress1(getField(ADDRESS1));
        person.setAddress2(getField(ADDRESS2));
        person.setCity(getField(CITY));
        person.setState(getField(STATE));
        person.setZipcode(getField(ZIPCODE));
        person.setPhoneNumber(getField(PHONE));
        person.setEmailAddress(getField(EMAIL));
        
        return person;
    }
    
    private void setField(String fieldName, String value){
        JTextField field = (JTextField) fields.get(fieldName);
        field.setText(value);
    }
    
    private String getField(String fieldName){
        JTextField field = (JTextField) fields.get(fieldName);
        return field.getText();
    }
    
    private void createRow(String name){
        JLabel label = new JLabel(name, SwingConstants.RIGHT);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        leftPanel.add(label);
        
        JTextField field = new JTextField(30);
        rightPanel.add(field);
        
        fields.put(name, field);
    }
}
