/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg13.pkg2;
    import java.awt.BorderLayout;
    import javax.swing.JFrame;
    import javax.swing.JButton;
    import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class ShowBorderLayout extends JFrame{
    public ShowBorderLayout(){
        setLayout(new BorderLayout(5, 10));
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.CENTER);
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        JPanel p2 = new JPanel();
        this.add(p2, BorderLayout.SOUTH);
        p2.add(new JButton("Button 1"));
        p2.add(new JButton("Button 2"));
        p2.add(new JButton("Button 3"));
        
    }
}
