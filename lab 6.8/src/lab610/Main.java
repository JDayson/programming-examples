/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab610;
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
        int [] intArray = {1,2,4,5,10,100,2,-22};
        int intSmallestElement = smElement(intArray);
        JOptionPane.showMessageDialog(null,"The index of the smallest element in the Integer Array is: " + intSmallestElement);
         }
    public static int smElement(int[] array){
    int num = 0;
    for (int i = 0; i < array.length; i++){
        if (array[i] < array[num]){
            {
                num = i;
            }
        }
        }
    return num;
    }
}
    
