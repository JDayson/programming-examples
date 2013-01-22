/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author Administrator
 */
public class InvalidHoursException extends Exception {
    private double hours;
    
    public InvalidHoursException(double hours){
        super("Invalid hours worked " + hours);
        this.hours = hours;
    }
    
    public double getHours(){
        return hours;
    }
}
