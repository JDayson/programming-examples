/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg13.pkg3;
    import javax.swing.JFrame;
    import java.awt.GridLayout;
    import javax.swing.JButton;
    import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
        setLayout(new GridLayout(2, 3, 5, 5));
        JPanel p1 = new JPanel();
        this.add(p1);
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        JPanel p2 = new JPanel();
        this.add(p2);
        p2.add(new JButton("Button 1"));
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));
    }
}
