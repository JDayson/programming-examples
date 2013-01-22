/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab23;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Enter Feet:");
        int feet = input.nextInt();                
        double meter = feet * 0.305;
        System.out.println(feet + " feet is the same as " + meter + "Meters.");
    }

}
