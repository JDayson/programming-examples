/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab86;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test = "Java in 2008";
        int StringLength = countLetters(test);
        String output = ("The length of the String is: " + StringLength);
        System.out.println(output);
    }
                
        public static int countLetters (String s){
            int length = s.length();
            return length;
        }
}
