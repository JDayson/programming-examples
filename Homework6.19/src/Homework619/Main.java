/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Homework619;
import javax.swing.JOptionPane;
import java.util.Arrays; 
import java.util.Comparator;
/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strStudNum = JOptionPane.showInputDialog("Please enter the number of students: ");
        int intStuNum = Integer.parseInt(strStudNum);
        String stuArray[][];
        stuArray = new String[intStuNum][2];
        String stuArraySorted[][];
        stuArraySorted = new String[intStuNum][2];
        int curHighGrade = 100;
        for (int i = 0; i < intStuNum; i++){
            stuArray[i][0] = JOptionPane.showInputDialog("Please enter the name of the student: ");
            stuArray[i][1] = JOptionPane.showInputDialog("Please enter the grade of the student: ");
        }
        Arrays.sort(stuArray, new Comparator<String[]>() { 
            @Override 
            public int compare(final String[] entry1, final String[] entry2) { 
                final String time1 = entry1[1]; 
                final String time2 = entry2[1]; 
                return time1.compareTo(time2); 
            } 
        }); 
        int l = intStuNum;
        for (int row = l - 1; row >= 0; row--){
            for (int column = 0; column < stuArray[row].length; column++){
                System.out.print(stuArray[row][column] + "");
            }
            System.out.println();
            }
    }
}
    
