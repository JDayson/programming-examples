/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab68;
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
        int [] intArray = {4,5,7,8,9,3};
        double [] dblArray = {4.0,5.0,8.0,7.0,9.0,3.0};
        double dblArrayAverage = average(dblArray);
        int intArrayAverage = average(intArray);
        JOptionPane.showMessageDialog(null,"The average of the Integer Array is: " + intArrayAverage);
        JOptionPane.showMessageDialog(null,"The average of the Double Array is: " + dblArrayAverage);
         }
    public static int average(int[] array){
    int result;
    int num, total = 0;
    for (int i = 0; i < array.length; i++){
        num = array[i];
        total += num;
    }
    result = total/array.length;
    return result;
    }

    public static double average(double[] array){
    double result;
    double num, total = 0;
    for (int i = 0; i < array.length; i++){
        num = array[i];
        total += num;
    }
    result = total/array.length;
    return result;
    }
}
    
