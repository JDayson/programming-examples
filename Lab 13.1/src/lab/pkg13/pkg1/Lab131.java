/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg13.pkg1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class Lab131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShowFlowLayout frame2 = new ShowFlowLayout();
        frame2.setTitle("ShowFlowLayout");
        frame2.setSize(600, 70);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        JPanel p1 = new JPanel();
        frame2.add(p1);
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        JPanel p2 = new JPanel();
        frame2.add(p2);
        p2.add(new JButton("Button 1"));
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));

    }
}
