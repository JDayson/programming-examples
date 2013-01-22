/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VandC;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class VowelConsCounter{
    public static void main(String[] args) {
        char select;
        String proName = "Vowels And Consonants";
        String str = JOptionPane.showInputDialog
                (null, "Please enter a string.", proName,
                JOptionPane.QUESTION_MESSAGE);
        VowelCons vc = new VowelCons(str);
        do{
            select = getMenuSelect();
            switch(select){
                case 'a':   JOptionPane.showMessageDialog(null, 
                            "The number of vowels is: " + 
                            vc.getNumVowels(), proName,
                            JOptionPane.PLAIN_MESSAGE);
                            break;
                case 'b':   JOptionPane.showMessageDialog(null, 
                            "The number of consonants is: " + 
                            vc.getNumConsonants(), proName, 
                            JOptionPane.PLAIN_MESSAGE);
                            break;
                case 'c':   JOptionPane.showMessageDialog(null, 
                            "The number of vowels is: " + 
                            vc.getNumVowels() + 
                            "\nThe number of consonants is: " +
                            vc.getNumConsonants(), proName, 
                            JOptionPane.PLAIN_MESSAGE);
                            break;
                case 'd':   str = JOptionPane.showInputDialog(null, 
                            "Please enter a string.",
                            proName, JOptionPane.QUESTION_MESSAGE);
                            vc = new VowelCons(str);
            }
        }while (select != 'e');
    }
    public static char getMenuSelect(){
        String proName = "Vowels And Consonants";
        String proChoice = "Please select from the following:" +
            "\na)  Count the number of vowels in the string." +
            "\nb)  Count the number of consonants in the string." +
            "\nc)  Count both the vowels and consonants in the string." +
            "\nd)  Enter another string." +
            "\ne)  Exit the program.";
        char choice;
        String select;
        select = JOptionPane.showInputDialog(null, proChoice, proName, 
                JOptionPane.QUESTION_MESSAGE);
        select = select.toLowerCase();
        choice = select.charAt(0);
        while (choice < 'a' || choice > 'e'){
            select = JOptionPane.showInputDialog(null, 
                    "Please enter only a, b, c, d, or e.", proName, 
                    JOptionPane.ERROR_MESSAGE);
            select = select.toLowerCase();
            choice = select.charAt(0);
        }
        return choice;
    }
}