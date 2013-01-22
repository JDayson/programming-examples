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
                double radius = inputFromClient.readDouble();
                double area = radius * radius * Math.PI;
                outputToClient.writeDouble(area);
                jta.append("Radius recieved from client: " + radius + "\n");
                jta.append("Area found: " + area + "\n");
            }
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
}
