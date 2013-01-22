/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class Server extends JFrame{
    private JTextArea jta = new JTextArea();
    private RandomAccessFile raf;
    private int count;
    private JButton jbtStop = new JButton("Stop");
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
        add(jbtStop, BorderLayout.SOUTH);
        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            jta.append("Server started at " + new Date() + "\n ");
            raf = new RandomAccessFile("count.dat", "rw");
            if (raf.length() == 0)
                count = 0;
            else
                count = raf.readInt();
            
            while (true){
                Socket socket = serverSocket.accept();
                DataOutputStream outputToClient = 
                        new DataOutputStream(socket.getOutputStream());
                count++;
                outputToClient.writeInt(count);
                jbtStop.addActionListener(new ButtonListener());
            }
        }
        catch(IOException ex){
            System.err.println(ex);
            }
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try{
                raf.seek(0);
                raf.writeInt(count);
            }
            catch(IOException ex){
                System.err.println(ex);
            }
        }
    }
}