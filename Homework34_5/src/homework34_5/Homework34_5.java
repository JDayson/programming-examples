/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework34_5;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Homework34_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JOptionPane Demo");
        PaneApplet applet = new PaneApplet();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
}
