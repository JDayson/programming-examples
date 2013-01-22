/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg16.pkg5;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Administrator
 */
public class KiloConverterWindow extends JFrame
{
	private JPanel panel; //The panel contains the elements you add to the window
	private JLabel messageLabel; // the Label contains text that is un-editable.
	private JLabel messageLabel2; // the Label contains text that is un-editable.
	private JTextField kiloTextField; //The text Field is usually used as a user Input area
	private JTextField mileTextField; //The text Field is usually used as a user Input area
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 100;
	
	/**
	Constructor
	*/
	
	public KiloConverterWindow()
	{
		//Set title
		setTitle("Kilometer Converter");
		
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
		messageLabel = new JLabel("          Enter a distance in miles");
		messageLabel2 = new JLabel("Enter a distance in kilometers");
		
		//creat a textField 10 characters wide.
		kiloTextField = new JTextField(10);
		mileTextField = new JTextField(10);
                
		//Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//Add the components to the panel
		panel.add(messageLabel);
		panel.add(mileTextField);
		panel.add(messageLabel2);
		panel.add(kiloTextField);
                mileTextField.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.print("iii");
                        String input; // to hold the users input
                        double miles; // to hold the nimber of miles
			
                        //Get the text entered in the text Field.
                        input = mileTextField.getText();
			
                        //convert the input into miles
                        miles = Double.parseDouble(input) * 1.6214;
                        kiloTextField.setText(String.valueOf(miles));
                    }                    
                });
                kiloTextField.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input; // to hold the users input
                        double kilo; // to hold the nimber of miles
			
                        //Get the text entered in the text Field.
                        input = kiloTextField.getText();
			
                        //convert the input into miles
                        kilo = Double.parseDouble(input) / 1.6214;
                        mileTextField.setText(String.valueOf(kilo));
                    }                    
                });
	}
}
