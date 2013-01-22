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
/**
 *
 * @author Administrator
 */
public class Client extends JApplet{
    private JLabel jlblCount = new JLabel();
    private boolean isStandAlone = false;
    private String host = "localhost";

    public void init(){
        add(jlblCount);
        
        try{
            Socket socket;
            if (isStandAlone)
                socket = new Socket(host, 8000);
            else
                socket = new Socket(getCodeBase().getHost(), 8000);
            DataInputStream inputFromServer =
                    new DataInputStream(socket.getInputStream());
            int count = inputFromServer.readInt();
            jlblCount.setText("You are visitor number " + count);
            inputFromServer.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Applet Client");
        Client applet = new Client();
        applet.isStandAlone = true;
        if (args.length == 1) applet.host = args[0];
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.pack();
        frame.setVisible(true);
    }
 }
