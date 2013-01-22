/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg33_2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class Homework33_2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Display Figures");
        GridApplet applet = new GridApplet();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
}
