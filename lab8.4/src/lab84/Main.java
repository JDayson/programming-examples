/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab84;
import javax.swing.JOptionPane;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString = "";
        String searchChar = "";
        inputString = JOptionPane.showInputDialog("Enter a string to search: ");
        searchChar = JOptionPane.showInputDialog("Enter the character you would like to search for: ");
        JOptionPane.showMessageDialog(null,"This is the first position of the character you are seeking: " +
                count(inputString, searchChar.charAt(0)));
    }

    public static int count(String str, char a){
        int charPos = 0;
        charPos = str.indexOf(a)+1;
        return charPos;
    }
}
