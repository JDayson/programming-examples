/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg19.pkg3;
import java.io.*;
import java.math.*;
/**
 *
 * @author Administrator
 */
public class Lab193 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws IOException {
        // TODO code application logic here
        try{
            File file = new File("Exercise19_3.dat");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        DataOutputStream output = 
                new DataOutputStream(new FileOutputStream("Exercise19_3.dat"));
        int p = (int)(Math.random() * 100);
        int fileSum = 0;
        for (int i = 1; i <= p; i++){
            output.writeInt((int)(Math.random() * 100));
        }
        output.close();
        DataInputStream input =
                new DataInputStream(new FileInputStream("Exercise19_3.dat"));
        for (int i = 1; i <= p; i++){
            fileSum = fileSum + input.readInt();
        }
        System.out.print(fileSum);
    }
}
