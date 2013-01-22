/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.work;
import java.util.Scanner;
import java.util.*; 
/**
 *
 * @author Administrator
 */
public class ClassWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try {
                System.out.print("Enter an Integer: ");
                int number = scanner.nextInt();
                //Display the result
                System.out.println(
                    "The number entered is " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again  (" +
                    "Incorrect input: an integer is required");
                scanner.nextLine();
            }
        } while (continueInput);
    }
}
