/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Lab113 {
  

    
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];  
            objects[0] = new Square(5,4);  
            objects[1] = new Square2(3,5);  
            objects[2] = new Square(1,8);  
            objects[3] = new Square2(4,9);  
            objects[4] = new Square(2,6);  
        GeometricObject object;
        for (int i = 0; i < objects.length; i++) {
            object = objects[i];
            JOptionPane.showMessageDialog(null, "Object [ " + i + " ] ");
            if (object instanceof Colorable) {
                Colorable colorable = (Colorable) object;
                JOptionPane.showMessageDialog(null, colorable.howToColor());
            } 
            else {
                JOptionPane.showMessageDialog(null, " NOT COLORABLE!");
            }
        }
    }
}
