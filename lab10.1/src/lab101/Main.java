/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab101;
//import javax.swing.JOptionPane;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(1, 1.5, 1);
        tri1.setColor("yellow");
        tri1.setFilled(true);
        System.out.println(tri1.toString());
        System.out.println("Area: " + tri1.getArea() + "\nPerimeter: " + tri1.getPerimeter());
    }
}
