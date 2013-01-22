/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwlab14_2;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class HWLab14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JButton jbtOK = new OvalButton("OK");
        JButton jbtCANCEL = new OvalButton("CANCEL");
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        panel.add(jbtOK);
        panel.add(jbtCANCEL);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        
    }
}
