/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab42;
import javax.swing.JOptionPane;
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
        int pos = 0,AvgPos=0;
        int neg = 0,AvgNeg=0;
        int CountPos = 0;
        int CountNeg = 0;       
        String StrNum = JOptionPane.showInputDialog("Enter any whole number: ");
        int Num = Integer.parseInt(StrNum);
        while (Num != 0){
            if (Num > 0){
                pos = pos + Num;
                CountPos++;
                AvgPos = pos / CountPos;
                JOptionPane.showMessageDialog(null, "The average of Positive numbers is " + AvgPos + ", And the Average of Negative numbers is " + AvgNeg);
                StrNum = JOptionPane.showInputDialog("Enter any number: ");
            }
            else if (Num < 0) {
                neg = neg + Num;
                CountNeg++;
                AvgNeg = neg / CountNeg;
                JOptionPane.showMessageDialog(null, "The average of Positive numbers is " + AvgPos + ", And the Average of Negative numbers is " + AvgNeg);
                StrNum = JOptionPane.showInputDialog("Enter any number: ");
            }
                
       Num = Integer.parseInt(StrNum);
        }

    }

}
