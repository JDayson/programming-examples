/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author Administrator
 */
public class InvalidRateException extends Exception{
    private double payRate;
    
    public InvalidRateException(double payRate){
        super("Invalid hourly pay rate " + payRate);
        this.payRate = payRate;
    }
    
    public double getRate(){
        return payRate;
    }
}
