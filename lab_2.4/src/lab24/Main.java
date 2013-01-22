/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab24;
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
        
        System.out.print ("Enter Pounds to convert:");
        int pounds = input.nextInt();                
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds are the same as " + kilograms + "Kilograms.");
    }

}
