/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasentrybot;

import javax.swing.JFrame;
import serialio.SerialIO;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class HexaSentryBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainAppFrame mainApp = new MainAppFrame();
        mainApp.setTitle("Robotic Sentry Control");
        mainApp.setLocationRelativeTo(null);
        mainApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainApp.setVisible(true);
    }
}
