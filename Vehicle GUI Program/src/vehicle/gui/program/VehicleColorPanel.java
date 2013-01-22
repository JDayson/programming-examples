/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui.program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Administrator
 */
public class VehicleColorPanel extends JPanel{
    JButton intColorButton = new JButton("Interior Color?");
    JButton extColorButton = new JButton("Exterior Color?");
    JTextField intColorField = new JTextField();
    JTextField extColorField = new JTextField();
    Color intColorChoice, extColorChoice;
    
    public VehicleColorPanel(){
        setLayout(new GridLayout(2, 2));
        
        add(intColorButton);
        add(intColorField);
        add(extColorButton);
        add(extColorField);
        
        intColorField.setBackground(Color.gray);
        extColorField.setBackground(Color.red);
        intColorChoice = Color.gray;
        extColorChoice = Color.red;
        
        intColorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Color intColor = JColorChooser.showDialog(
                        intColorField, "Choose a color", Color.gray);
            }
        });
        
        extColorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Color extColor = JColorChooser.showDialog(intColorField, 
                        "Choose a color", Color.gray);
            }
        });
    }
    
    public String getIntColorChoice(){
        return intColorChoice.toString();
    }
    
    public String getExtColorChoice(){
        return extColorChoice.toString();
    }
}
