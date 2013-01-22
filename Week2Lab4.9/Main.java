/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week249;
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
        //Write a Program that prompts the user to enter the number of students
        //and each students name and score, and finally displays the student
        //with the highest score and the student with the secound highest score
        String StrClassSize = JOptionPane.showInputDialog("Enter Number of Students: ");
        int h = Integer.parseInt(StrClassSize);
        h = h-1;
        String NewName = JOptionPane.showInputDialog("Enter Student Name: ");
        String StrNewGrade = JOptionPane.showInputDialog("Enter Student Grade: ");
        int NewGrade = Integer.parseInt(StrNewGrade);
        String Stu1 = "";
        int Score1 = 0;
        String Stu2 = "";
        int Score2 = 0;
        
        for (int i = 0; i < h; i++){
            if (NewGrade > Score1){
                Stu2 = Stu1;
                Score2 = Score1;
                Stu1 = NewName;
                Score1 = NewGrade;
                NewName = JOptionPane.showInputDialog("Enter Student Name: ");
                StrNewGrade = JOptionPane.showInputDialog("Enter Student Grade: ");
                NewGrade = Integer.parseInt(StrNewGrade);
            }
            else if (NewGrade > Score2){
                Stu2 = NewName;
                Score2 = NewGrade;
                NewName = JOptionPane.showInputDialog("Enter Student Name: ");
                StrNewGrade = JOptionPane.showInputDialog("Enter Student Grade: ");
                NewGrade = Integer.parseInt(StrNewGrade);
            }
        }
        String Output = "Highest Grade belongs to: " + Stu1 + " With a Grade of " + Score1 + ": Second Belongs to: " + Stu2 + " With a Grade of " + Score2;
        JOptionPane.showMessageDialog (null, Output);
    }

}
