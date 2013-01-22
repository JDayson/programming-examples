/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg34_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author Administrator
 */
public class Lab34_1 extends JApplet {
    String host = "localhost";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Display Figures");
        InvestMenu applet = new InvestMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
}
