/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework47;
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
        double tuition = 10000;
        double totalterm = 0;
        double tenYearTuition = 0;
        int Count = 0;
        while (Count < 13){
            tuition = tuition * 1.05;
            if (Count == 9){
                tenYearTuition = tuition;
            }
            if (Count >= 9){
                totalterm = totalterm + tuition;
            }
            Count++;
        }
        JOptionPane.showMessageDialog(null, "The cost of tuition in tens years will be: $" + tenYearTuition + ", And the total cost of four years of tuition starting in ten years is: $" + totalterm);
        }
    }
