/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab71;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */

    class Rectangle{
        private double Width = 1;
        private double Height = 1;
        private String Color = "White";
        
        Rectangle(){
            
        }
        Rectangle(double newWidth, double newHeight){
            Width = newWidth;
            Height = newHeight;
        }
        double getWidth(){
            return Width;
        }
        double getHeight(){
            return Height;
        }
        String getColor(){
            return Color;
        }
        void setWidth(int newWidth){
            Width = newWidth;
        }
        void setHeight(int newHeight){
            Height = newHeight;
        }
        void setColor(String newColor){
            Color = newColor;
        }
        double getArea(){
            double area = Width * Height;
            return area;
        }
        double getParameter(){
            double Parameter = (Width*2)+ (Height*2);
            return Parameter;
        }
        
        
    }
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec1 = new Rectangle(4.0,40.0);
        Rectangle rec2 = new Rectangle(3.5,35.9);
        rec1.setColor("red");
        rec2.setColor("red");
        String output1 = ("Rectangle 1: " + "/n" + "Width: " + rec1.getWidth() + "/n" + "Height: " + rec1.getHeight() + "/n" + "Color: " + rec1.getColor() + "/n" + "Area: " + rec1.getArea() + "/n" + "Parameter: " + rec1.getParameter());
        String output2 = ("Rectangle 2: /n Width: " + rec2.getWidth() + "/n Height: " + rec2.getHeight() + "/n Color: " + rec2.getColor() + "/n Area: " + rec2.getArea() + "/n Parameter: " + rec2.getParameter());
        System.out.println(output1);
        System.out.println(output2);
        
        
    }
    


}
