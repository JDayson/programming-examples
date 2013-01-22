/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg19.pkg8;
import java.io.*;
import java.math.*;
/**
 *
 * @author Administrator
 */
public class Lab198 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws IOException {
        // TODO code application logic here
        try{
            File file = new File("Exercise19_8.dat");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        int fileSum = 0;
        try{
            DataInputStream input =
                new DataInputStream(new FileInputStream("Exercise19_8.dat"));
                fileSum = fileSum + input.readInt() + 1;
                input.close();
        }
        catch(FileNotFoundException ex){
            fileSum = fileSum + 1;
        }
        DataOutputStream output = 
                new DataOutputStream(new FileOutputStream("Exercise19_8.dat"));
        output.writeInt(fileSum);
        output.close();
        System.out.print(fileSum);
    }
}
