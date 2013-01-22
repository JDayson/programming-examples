/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Homework819;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("Exercise8_19.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
    // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
    //Write formatted output to the file
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 100; ++idx){
            int randomInt = randomGenerator.nextInt(100);
            output.print(randomInt + " ");
        }
    //close the file
        output.close();
        
    //create scanner for the file
        Scanner input = new Scanner(file);
        int[] intArray = new int[100];
        int i = 0;
        while (input.hasNext()){
            intArray[i] = Integer.parseInt(input.next());
            i++;
        }
        Arrays.sort(intArray);
        for (int b = 0; b <= 99; b++){
            System.out.println(intArray[b]);
        }
    //close the file
        input.close();
    }
}
