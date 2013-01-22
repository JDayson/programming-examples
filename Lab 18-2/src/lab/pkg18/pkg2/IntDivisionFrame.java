/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg18.pkg2;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Administrator
 */
public class IntDivisionFrame extends JFrame {
	private JPanel panel; //The panel contains the elements you add to the window
	private JLabel messageLabel; // the Label contains text that is un-editable.
	private JLabel messageLabel2; // the Label contains text that is un-editable.
	private JLabel messageLabel3; // the Label contains text that is un-editable.
	private JTextField number1TextField; //The text Field is usually used as a user Input area
	private JTextField number2TextField; //The text Field is usually used as a user Input area
	private JTextField resultTextField; //The text Field is usually used as a user Input area
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 100;
        private JButton jbtMain = new JButton("Divide");
	/**
	Constructor
	*/
	
	public IntDivisionFrame()
	{
		//Set title
		setTitle("Lab 18.2: Number Format Exception Errors");
		
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
		messageLabel = new JLabel("Number 1  ");
		messageLabel2 = new JLabel("Number 2  ");
		messageLabel3 = new JLabel("Result  ");
		
		//creat a textField 10 characters wide.
		number1TextField = new JTextField(10);
		number2TextField = new JTextField(10);
		resultTextField = new JTextField(10);
                
		//Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//Add the components to the panel
		panel.add(messageLabel);
		panel.add(number1TextField);
		panel.add(messageLabel2);
		panel.add(number2TextField);
		panel.add(messageLabel3);
		panel.add(resultTextField);
                panel.add(jbtMain);
            
                jbtMain.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input1; // to hold the users input
                        String input2;
                        double kilo; // to hold the nimber of miles
			int number1 = 0;
                        int number2 = 0;
                        //Get the text entered in the text Field.
                        input1 = number1TextField.getText();
                        input2 = number2TextField.getText();
                      
			
                        //convert the input into miles
                        try {
                            number1 = Integer.parseInt(input1);
                            number2 = Integer.parseInt(input2);
                            kilo = number1 / number2;
                            resultTextField.setText(Double.toString(kilo));
                        }
                        catch(NumberFormatException ex) {
                            resultTextField.setText(ex.getMessage());
                        }
                        catch(ArithmeticException ex) {
                            resultTextField.setText(ex.getMessage());
                        }
                    }                    
                });

	}
}
    

