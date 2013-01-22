/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hurricane;
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.util.*;  
import java.lang.*;  
import java.lang.String; 

/**
 *
 * @author Administrator
 */
public class TestHurricaneBean extends JFrame {  
    Hurricane hurricane = new Hurricane();
    private JPanel panel = new JPanel();  
    private JPanel panel2 = new JPanel();  
    private JLabel label = new JLabel("Enter Hurricane Category: ");  
    private JTextField textbox = new JTextField(5);  
    private JTextArea textarea = new JTextArea("Hurricane category: ");  

    public TestHurricaneBean() {  
        ActionListener listener = new Listener(); 
        hurricane.addActionListener(listener);  
        hurricane.setCategory(5);  
        panel.add(label);  
        panel.add(textbox);  
        add(panel, BorderLayout.CENTER);  
        panel2.add(textarea);  
        add(panel2, BorderLayout.SOUTH); 
        this.setSize(300,100);  
        this.setVisible(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textbox.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
               int category = Integer.valueOf(textbox.getText());  
               if(category >=3)  
                       processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));  
            }  
        });  
    }  
    public static void main(String[] args) {  
        new TestHurricaneBean();  
    }  
    private class Listener implements ActionListener {  
        public void actionPerformed(ActionEvent e) {  
            System.out.println("Listener triggered!");  
            hurricane.setTitle("WARNING!");  
        }  
    }  
} 