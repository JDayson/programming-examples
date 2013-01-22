/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg33_2;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class GridApplet extends JApplet {
    private JMenuItem jmiReset, jmiClose, jmiAbout;
    private JButton jbtComponent0 = new JButton("Component 0");
    private JButton jbtComponent1 = new JButton("Component 1");
    private JButton jbtComponent2 = new JButton("Component 2");
    private JButton jbtComponent3 = new JButton("Component 3");
    private JButton jbtComponent4 = new JButton("Component 4");
    private JButton jbtComponent5 = new JButton("Component 5");
    private JButton jbtComponent6 = new JButton("Component 6");
    private JButton jbtComponent7 = new JButton("Component 7");
    private JButton jbtComponent8 = new JButton("Component 8");
    private JButton jbtComponent9 = new JButton("Component 9");
    private JButton jbtComponent10 = new JButton("Component 10");
    private JButton jbtComponent11 = new JButton("Component 11");
    private JButton jbtComponent12 = new JButton("Component 12");
    private JButton jbtComponent13 = new JButton("Component 13");
    private JButton jbtComponent14 = new JButton("Component 14");
    private JTextField jtfRows = new JTextField(10);
    private JTextField jtfColumns = new JTextField(10);
    private JTextField jtfHGap = new JTextField(10);
    private JTextField jtfVGap = new JTextField(10);
    private Locale locale = Locale.getDefault();
    public GridApplet(){
        final JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5, 3, 0,0));
        p2.add(jbtComponent0);
        p2.add(jbtComponent1);
        p2.add(jbtComponent2);
        p2.add(jbtComponent3);
        p2.add(jbtComponent4);
        p2.add(jbtComponent5);
        p2.add(jbtComponent6);
        p2.add(jbtComponent7);
        p2.add(jbtComponent8);
        p2.add(jbtComponent9);
        p2.add(jbtComponent10);
        p2.add(jbtComponent11);
        p2.add(jbtComponent12);
        p2.add(jbtComponent13);
        p2.add(jbtComponent14);
        p2.setBorder(new TitledBorder("Container of GridLayout"));

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 4));
        p1.add(new JLabel("Rows: "));
        p1.add(jtfRows);
        p1.add(new JLabel("HGap: "));
        p1.add(jtfHGap);
        p1.add(new JLabel("Columns: "));
        p1.add(jtfColumns);
        p1.add(new JLabel("VGap: "));
        p1.add(jtfVGap);
        p1.setBorder(new TitledBorder("GridLayout Proporties"));
        
        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        
        JMenu operationMenu = new JMenu("Operation");
        operationMenu.setMnemonic('O');
        jmb.add(operationMenu);
        
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('E');
        jmb.add(helpMenu);
        
        operationMenu.add(jmiReset = new JMenuItem("Reset", 'R'));
        operationMenu.add(jmiClose = new JMenuItem("Exit", 'E'));
        helpMenu.add(jmiAbout = new JMenuItem("About", 'A'));
        
        jmiReset.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        jmiAbout.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        
        setLayout(new BorderLayout());
        add(p2, BorderLayout.CENTER);
        add(p1, BorderLayout.SOUTH);
        
        jmiClose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        jmiReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                p2.setLayout(new GridLayout(5, 3, 0, 0));
                p2.validate();
            }
        });

        jtfRows.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int GLVGap = 
                    new Integer(jtfVGap.getText()).intValue();
                int GLHGap = 
                    new Integer(jtfHGap.getText()).intValue();
                int GLColumns =
                    new Integer(jtfColumns.getText()).intValue();
                int GLRows =
                    new Integer(jtfRows.getText()).intValue();
                p2.setLayout(new GridLayout(GLRows, GLColumns, GLHGap, GLVGap));
                p2.validate();
            }
        });

        jtfColumns.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int GLVGap = 
                    new Integer(jtfVGap.getText()).intValue();
                int GLHGap = 
                    new Integer(jtfHGap.getText()).intValue();
                int GLColumns =
                    new Integer(jtfColumns.getText()).intValue();
                int GLRows =
                    new Integer(jtfRows.getText()).intValue();
                p2.setLayout(new GridLayout(GLRows, GLColumns, GLHGap, GLVGap));
                p2.validate();
            }
        });

        jtfHGap.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int GLVGap = 
                    new Integer(jtfVGap.getText()).intValue();
                int GLHGap = 
                    new Integer(jtfHGap.getText()).intValue();
                int GLColumns =
                    new Integer(jtfColumns.getText()).intValue();
                int GLRows =
                    new Integer(jtfRows.getText()).intValue();
                p2.setLayout(new GridLayout(GLRows, GLColumns, GLHGap, GLVGap));
                p2.validate();
            }
        });

        jtfVGap.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int GLVGap = 
                    new Integer(jtfVGap.getText()).intValue();
                int GLHGap = 
                    new Integer(jtfHGap.getText()).intValue();
                int GLColumns =
                    new Integer(jtfColumns.getText()).intValue();
                int GLRows =
                    new Integer(jtfRows.getText()).intValue();
                p2.setLayout(new GridLayout(GLRows, GLColumns, GLHGap, GLVGap));
                p2.validate();
            }
        });

        jmiAbout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(
                    rootPane, "This is the about message", "About", WIDTH);
            }
        });
    }
}
