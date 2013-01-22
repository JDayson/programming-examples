/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg18.pkg3;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Administrator
 */
public class IntArrayFrame extends JFrame {
	private JPanel panel; //The panel contains the elements you add to the window
	private JLabel messageLabel; // the Label contains text that is un-editable.
	private JLabel messageLabel2; // the Label contains text that is un-editable.
	private JTextField indexTextField; //The text Field is usually used as a user Input area
	private JTextField elementTextField; //The text Field is usually used as a user Input area
	private final int WINDOW_WIDTH = 250;
	private final int WINDOW_HEIGHT = 125;
        private JButton jbtMain = new JButton("Show Element");
	int[] exArray = new int[100];
	/**
	Constructor
	*/
	
	public IntArrayFrame()
	{
		//Set title
		setTitle("Lab 18.3: Show Bounds Error");
		
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
		messageLabel = new JLabel("     Array Index");
		messageLabel2 = new JLabel("Array Element");
		
		//creat a textField 10 characters wide.
		indexTextField = new JTextField(10);
		elementTextField = new JTextField(10);
                
		//Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//Add the components to the panel
		panel.add(messageLabel);
		panel.add(indexTextField);
		panel.add(messageLabel2);
		panel.add(elementTextField);
                panel.add(jbtMain);
            
                for(int i = 0; i < 100; i++){
                    exArray[i] = (int)(Math.random() * 100);
                   
                }
                jbtMain.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String input; // to hold the users input
                        int kilo; // to hold the nimber of miles
			
                        //Get the text entered in the text Field.
                        input = indexTextField.getText();
			
                        //convert the input into miles
                        try {
                            kilo = exArray[Integer.parseInt(input)];
                            elementTextField.setText(Integer.toString(kilo));
                        }
                        catch(ArrayIndexOutOfBoundsException ex) {
                            elementTextField.setText("Out of Bounds");
                        }
                    }                    
                });

	}
}
    

