/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab26;
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
        System.out.print ("pick a number between 0 and 1000: ");
        int Number = input.nextInt();
        int sum = 0;
        while(Number > 0){
            sum += Number % 10;
            Number /= 10;
        }
        System.out.println("The sum is " + sum);
    }

}
