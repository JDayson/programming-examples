/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg34_1;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class InvestMenu extends JApplet {
    private JMenuItem jmiCalculate, jmiClose, jmiAbout;
    private JButton jbtCalculate = new JButton("Calculate");
    private JTextField jtfInvestAmount = new JTextField(10);
    private JTextField jtfYears = new JTextField(10);
    private JTextField jtfAnnualPercent = new JTextField(10);
    private JTextField jtfFutureValues = new JTextField(10);
    private Locale locale = Locale.getDefault();
    public InvestMenu(){
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 2));
        p2.add(new JLabel("Investment Amount: "));
        p2.add(jtfInvestAmount);
        p2.add(new JLabel("Years: "));
        p2.add(jtfYears);
        p2.add(new JLabel("Annual Interest Rate: "));
        p2.add(jtfAnnualPercent);
        p2.add(new JLabel("Future Value: "));
        p2.add(jtfFutureValues);
	jtfFutureValues.setEditable(false);
        //p2.add(new JLabel(" "));
        //p2.add(jbtCalculate);

        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        
        JMenu operationMenu = new JMenu("Operation");
        operationMenu.setMnemonic('O');
        jmb.add(operationMenu);
        
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('E');
        jmb.add(helpMenu);
        
        operationMenu.add(jmiCalculate = new JMenuItem("Calculate", 'C'));
        operationMenu.add(jmiClose = new JMenuItem("Exit", 'E'));
        helpMenu.add(jmiAbout = new JMenuItem("About", 'A'));
        
        jmiCalculate.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        jmiAbout.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        
        setLayout(new BorderLayout());
        add(p2, BorderLayout.CENTER);
        add(jbtCalculate, BorderLayout.SOUTH);
        
        jmiClose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        jmiCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculate();
            }
        });

        jbtCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculate();
            }
        });

        jmiAbout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(
                    rootPane, "This is the about message", "About", WIDTH);
            }
        });
    }
    
    private void calculate(){
        double investAmount = 
            new Double(jtfInvestAmount.getText()).doubleValue();
        double annualPercent =
            new Double(jtfAnnualPercent.getText()).doubleValue();
        double timeYears =
            new Double(jtfYears.getText()).doubleValue();
        NumberFormat currencyFormat = 
            NumberFormat.getCurrencyInstance(locale.US);
        jtfFutureValues.setText(currencyFormat.format(
            investAmount * (1 + ((annualPercent / 100) * timeYears))));
    }

}
