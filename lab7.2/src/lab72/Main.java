/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab72;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
    class Fan {
        private static int Slow = 1;
        private static int Medium = 2;
        private static int Fast = 3;
        int Speed = 1;
        boolean On = false;
        double radius = 5;
        String color = "blue";
        
     Fan(){
     }
     
     int getSpeed(){
         return Speed;
     }
     
     boolean isOn(){
        
         return On;
     }
     
     double getRadius(){
         return radius;
     }
     
     String getColor(){
         return color;
     }
     
     void setSpeed(int newSpeed){
         Speed = newSpeed;
     }
     
     void setOn(boolean newPower){
         
         On = newPower;
          
     }
     
     void setRadius(double newRadius){
         radius = newRadius;
     }
     
     void setColor(String newColor){
         color = newColor;
     }
     public String toString(){
         String strSpeed = "";
         String description = "";
         if (Speed == 1){
             strSpeed = "slow";
         }
         else if (Speed == 2){
            strSpeed = "medium";
         }
         else if (Speed == 3){
             strSpeed = "fast";
         }
         if (On == true){
            description = "This Fan is " + color + ", with a radius of " + radius + ", moving at a " + strSpeed + " speed.";
         }
         else{
            description = "This Fan is " + color + ", with a radius of " + radius + ", the fan is off.";
         }
         return description;
     }
    }

public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
            Fan defaultFan = new Fan();
            Fan specialFan = new Fan();
            specialFan.setColor("yellow");
            specialFan.setOn(true);
            specialFan.setSpeed(3);
            specialFan.setRadius(10);
            defaultFan.setSpeed(2);
            defaultFan.setColor("blue");
            defaultFan.setOn(false);
            defaultFan.setRadius(5);
            defaultFan.toString();
            specialFan.toString();
            JOptionPane.showMessageDialog(null,specialFan.toString());
            JOptionPane.showMessageDialog(null,defaultFan.toString());
        }
}
    
