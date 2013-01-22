
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NumberConverter extends JApplet
{
	private JPanel panel; //The panel contains the elements you add to the window
	private JLabel messageLabel; // the Label contains text that is un-editable.
	private JLabel messageLabel2; // the Label contains text that is un-editable.
	private JLabel messageLabel3; // the Label contains text that is un-editable.
	private JTextField decTextField; //The text Field is usually used as a user Input area
	private JTextField hexTextField; //The text Field is usually used as a user Input area
	private JTextField binTextField; //The text Field is usually used as a user Input area
	private final int WINDOW_WIDTH = 200;
	private final int WINDOW_HEIGHT = 110;
	
	/**
	Constructor
	*/
	
	public NumberConverter()
	{
		//Set title
		setTitle("Number Converter");
		
		//set the size
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//Specify the close thingy...
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		Now we add components to the panel(sort of)
		*/ 
		
		//Build the panel and add it to the frame
		buildPanel();
		
		add(panel); // adds the panel to the frame
		
		//setVisible
		setVisible(true);
		
	}
	
	/**
	Next is the build panel method to which we add a label, text field and a button
	*/
	
	private void buildPanel()
	{
		//Create a label to display instructions
		messageLabel = new JLabel("Decimal      ");
		messageLabel2 = new JLabel("Hexdecimal");
		messageLabel3 = new JLabel("Binary         ");
		
		//creat a textField 10 characters wide.
		decTextField = new JTextField(10);
		hexTextField = new JTextField(10);
		binTextField = new JTextField(10);
                
		//Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//Add the components to the panel
		panel.add(messageLabel);
		panel.add(decTextField);
		panel.add(messageLabel2);
		panel.add(hexTextField);
		panel.add(messageLabel3);
		panel.add(binTextField);
                decTextField.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input; // to hold the users input
                        double inDec; // to hold the nimber in decimal
			String hexOut; // to hold the output for hex
                        String binOut = ""; // to hold the output for binary
                        //Get the text entered in the text Field.
                        input = decTextField.getText();
			
                        //convert the input into miles
                        inDec = Double.parseDouble(input);
                        hexOut = Double.toHexString(inDec);
                        binOut = Integer.toBinaryString(Integer.parseInt(input));
                        hexTextField.setText(hexOut);
                        binTextField.setText(binOut);
                    }                    
                });
                hexTextField.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input; // to hold the users input
                        int inHex; // to hold the nimber in hex
			String decOut; // to hold the output for decimal
                        String binOut = ""; // to hold the output for binary
                        //Get the text entered in the text Field.
                        input = hexTextField.getText();
			
                        //convert the input into miles
                        inHex = Integer.parseInt(input, 16);
                        binOut = Integer.toBinaryString(inHex);
                        decTextField.setText(Integer.toString(inHex));
                        binTextField.setText(binOut);
                  }                    
                });
                binTextField.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input; // to hold the users input
			String hexOut; // to hold the output for hex
                        String decOut = ""; // to hold the output for binary
                        //Get the text entered in the text Field.
                        input = decTextField.getText();
			int intDec;
                        //convert the input into miles
                        intDec = Integer.parseInt(input,2);
                        hexOut = Integer.toHexString(intDec);
                        decOut = Integer.toString(intDec);
                        hexTextField.setText(hexOut);
                        decTextField.setText(decOut);
                    }                    
                });
        }
}
