/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
/**
 *
 * @author Administrator
 */
public class Client extends JApplet{
    private JTextField jtfInterestRate = new JTextField(10);
    private JTextField jtfYears = new JTextField(10);
    private JTextField jtfPrime = new JTextField(10);
    private JButton jbtRegister = new JButton("Calculate");
    private boolean isStandAlone = false;
    private JTextField jtf = new JTextField();
    private JTextArea jta = new JTextArea();
    String host = "localhost";
    
    public void init(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        p1.add(new JLabel("Annual Interest Rate"));
        p1.add(jtfInterestRate);
        p1.add(new JLabel("Number Of Years"));
        p1.add(jtfYears);
        p1.add(new JLabel("Loan Amount"));
        p1.add(jtfPrime);
 
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        add(p1, BorderLayout.NORTH);
        add(new JScrollPane(jta), BorderLayout.CENTER);
        add(jbtRegister, BorderLayout.SOUTH);
        
        jbtRegister.addActionListener(new ButtonListener());
        
        if (!isStandAlone)
            host = getCodeBase().getHost();
    }
    
    private class ButtonListener implements ActionListener{
        private DataOutputStream toServer;
        private DataInputStream fromServer;
        
        public void actionPerformed(ActionEvent e){
            try{
                Socket socket = new Socket(host, 8000);
                fromServer = new DataInputStream(socket.getInputStream());
                toServer = new DataOutputStream(socket.getOutputStream());
                double rate = Double.parseDouble(jtfInterestRate.getText());
                double years = Double.parseDouble(jtfYears.getText());
                double prime = Double.parseDouble(jtfPrime.getText());
                toServer.writeDouble(rate);
                toServer.flush();
                toServer.writeDouble(years);
                toServer.flush();
                toServer.writeDouble(prime);
                toServer.flush();
                double payment = fromServer.readDouble();
                double total = fromServer.readDouble();
                jta.append("Annual Interest Rate: " + rate + "\n");
                jta.append("Number of Years: " + years + "\n");
                jta.append("Loan Amount: " + prime + "\n");
                jta.append("Monthly Payment: " + payment + "\n");
                jta.append("Total Payment: " + total + "\n");
                
            }
            catch (IOException ex){
                System.err.println(ex);
            }
        }
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculate Monthly Loan Payment");
        Client applet = new Client();
        applet.isStandAlone = true;
        if (args.length == 1) applet.host = args[0];
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
}
