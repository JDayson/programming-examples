/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Administrator
 */
public class AddressBook extends JFrame{
    private JDesktopPane desktop;
    private AddressBookDataAccess database;
    Action newAction, saveAction, deleteAction,
            searchAction, exitAction;
    public AddressBook(){
        super("Address Book");
        try {
            database = new DataAccess();
            System.out.println("Database connected.");
        }
        catch(Exception exception){
            exception.printStackTrace();
            System.exit(1);
        }
        JToolBar toolBar = new JToolBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        
        newAction = new NewAction();
        saveAction = new SaveAction();
        saveAction.setEnabled(false);
        deleteAction = new DeleteAction();
        deleteAction.setEnabled(false);
        searchAction = new SearchAction();
        exitAction = new ExitAction();
        
        toolBar.add(newAction);
        toolBar.add(saveAction);
        toolBar.add(deleteAction);
        toolBar.add(new JToolBar.Separator());
        toolBar.add(searchAction);
        
        fileMenu.add(newAction);
        fileMenu.add(saveAction);
        fileMenu.add(deleteAction);
        fileMenu.addSeparator();
        fileMenu.add(searchAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        desktop = new JDesktopPane();
        Container c = getContentPane();
        c.add(toolBar, BorderLayout.NORTH);
        c.add(desktop, BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent event){
                shutDown();
            }
        });
        
        Toolkit toolkit = getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        setBounds(100, 100, dimension.width - 200,
                dimension.height - 200);
        setVisible(true);
    }
    
    private void shutDown(){
        database.close();
        System.exit(0);
    }
    
    private AddressBookEntryFrame createAddressBookEntryFrame(){
        AddressBookEntryFrame frame = new AddressBookEntryFrame();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameActivated(InternalFrameEvent event){
                saveAction.setEnabled(true);
                deleteAction.setEnabled(true);
            }
            public void internalFrameDeactivated(InternalFrameEvent event){
                saveAction.setEnabled(false);
                deleteAction.setEnabled(false);
            }
        });
        return frame;
    }
    
    public static void main(String srgs[]){
        new AddressBook();
    }
    
    private class NewAction extends AbstractAction{
        public NewAction(){
            putValue(NAME, "New");
            putValue(SMALL_ICON, new ImageIcon(
                    getClass().getResource("icon.png")));
            putValue(SHORT_DESCRIPTION, "New");
            putValue(LONG_DESCRIPTION, "Add a new address book entry");
            putValue(MNEMONIC_KEY, new Integer('N'));
        }
        
        public void actionPerformed(ActionEvent e){
            AddressBookEntryFrame entryFrame = createAddressBookEntryFrame();
            entryFrame.setAddressBookEntry(new AddressBookEntry());
            desktop.add(entryFrame);
            entryFrame.setVisible(true);
        }
    }
    
    private class SaveAction extends AbstractAction{
        public SaveAction(){
            putValue(NAME, "Save");
            putValue(SMALL_ICON, new ImageIcon(
                    getClass().getResource("icon.png")));
            putValue(SHORT_DESCRIPTION, "Save");
            putValue(LONG_DESCRIPTION, "Save an address book entry");
            putValue(MNEMONIC_KEY, new Integer('S'));
        }
        
        public void actionPerformed(ActionEvent e){
            AddressBookEntryFrame currentFrame = 
                    (AddressBookEntryFrame) desktop.getSelectedFrame();
            AddressBookEntry person = currentFrame.getAddressBookEntry();
            
            try{
                int personID = person.getPersonID();
                String operation = (personID == 1) ? "Insertion" : "Update";
                if (personID == 1)
                    database.newPerson(person);
                else
                    database.savePerson(person);
                JOptionPane.showMessageDialog(desktop, 
                        operation + " successful");
                System.out.println("personID = " + personID + " operation = " +
                        operation);
            }
            catch (DataAccessException exception){
                JOptionPane.showMessageDialog(desktop, exception,
                        "DataAccessException", JOptionPane.ERROR_MESSAGE);
                exception.printStackTrace();
            }
            currentFrame.dispose();
        }
    }
    
    private class DeleteAction extends AbstractAction{
        public DeleteAction(){
            putValue(NAME, "Delete");
            putValue(SMALL_ICON, new ImageIcon(
                    getClass().getResource("icon.png")));
            putValue(SHORT_DESCRIPTION, "Delete");
            putValue(LONG_DESCRIPTION, "Delete an address book entry");
            putValue(MNEMONIC_KEY, new Integer('D'));
        }
        
        public void actionPerformed(ActionEvent e){
            AddressBookEntryFrame currentFrame = 
                    (AddressBookEntryFrame) desktop.getSelectedFrame();
            AddressBookEntry person = currentFrame.getAddressBookEntry();
            if (person.getPersonID() == 1){
                JOptionPane.showMessageDialog(desktop, 
                        "New entries must be saved before they can be " +
                        "deleted.  \nTo cancel a new entry, simply " +
                        "close the window containing the entry");
                return;
            }
            try {
                database.deletePerson(person);
                JOptionPane.showMessageDialog(desktop, 
                        "Deletion successful");
            }
            catch (DataAccessException exception){
                JOptionPane.showMessageDialog(desktop, exception,
                        "Deletion failed.", JOptionPane.ERROR_MESSAGE);
                exception.printStackTrace();
            }
            currentFrame.dispose();
        }
    }
    
    private class SearchAction extends AbstractAction{
        public SearchAction(){
            putValue(NAME, "Search");
            putValue(SMALL_ICON, new ImageIcon(
                    getClass().getResource("icon.png")));
            putValue(SHORT_DESCRIPTION, "Search");
            putValue(LONG_DESCRIPTION, "Search for an address book entry");
            putValue(MNEMONIC_KEY, new Integer('r'));
        }
        
        public void actionPerformed(ActionEvent e){
            String lastName = JOptionPane.showInputDialog(desktop, 
                    "Enter last name");
            if (lastName != null){
                AddressBookEntry person = database.findPerson(lastName);
                if (person != null){
                    AddressBookEntryFrame entryFrame = 
                            createAddressBookEntryFrame();
                    entryFrame.setAddressBookEntry(person);
                    desktop.add(entryFrame);
                    entryFrame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(desktop,
                            "Entry with last name \"" + lastName +
                            "\" not found in address book");
                    System.out.println("lastName = " + lastName + 
                            " person (resultset)= " + person);
                }
            }
        }
    }
    
    private class ExitAction extends AbstractAction{
        public ExitAction(){
            putValue(NAME, "Exit");
            putValue(SHORT_DESCRIPTION, "Exit");
            putValue(LONG_DESCRIPTION, "Terminate the program");
            putValue(MNEMONIC_KEY, new Integer('x'));
        }
        
        public void actionPerformed(ActionEvent e){
            shutDown();
        }
    }
}
