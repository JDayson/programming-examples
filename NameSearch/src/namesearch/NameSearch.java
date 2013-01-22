/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namesearch;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author Administrator
 */
public class NameSearch {
    /**
     * @param args the command line arguments
     * 
     * This program lets the user search for names among the 65 most popular
     * female names in the 1990 US census.
     */
    public static void main(String[] args) throws IOException {
        String input;   //To hold keyboard input
        //Create the scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        //Create a PopularNames object with the census names.
        PopularNames names = PopularNames("names.txt");
        //Start a do-while loop
        {
            //Get a name to search for.
            //Search for the name.
            //Display the search results.
        }
    }
}
