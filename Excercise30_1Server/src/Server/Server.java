/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class Server extends JFrame {
    private JTextArea jta = new JTextArea();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Server();
    }
    
    public Server(){
        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);
        
        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        try{
            ServerSocket serverSocket = new ServerSocket(8000);
            jta.append("Server started at " + new Date() + "\n ");
            
            Socket socket = serverSocket.accept();
            
            DataInputStream inputFromClient = 
                    new DataInputStream(socket.getInputStream());
            DataOutputStream outputToClient = 
                    new DataOutputStream(socket.getOutputStream());
            
            while (true){
                double interestRate = inputFromClient.readDouble();
                double timeYears = inputFromClient.readDouble();
                double primeAmount = inputFromClient.readDouble();
                double total = 
                        primeAmount +
                        (primeAmount * 
                        (interestRate / 100) * 
                        timeYears);
                double payment = total / (timeYears * 12);
                outputToClient.writeDouble(payment);
                outputToClient.writeDouble(total);
                jta.append("Loan amount recieved from client: " + 
                        primeAmount + "\n");
                jta.append("Interest rate recieved from client: " + 
                        interestRate + "\n");
                jta.append("Years recieved from client: " + 
                        timeYears + "\n");
                jta.append("Monthly payment: " + payment + "\n");
                jta.append("Total payment: " + total + "\n");
            }
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
    
    public class CalcObject{
    }
}
