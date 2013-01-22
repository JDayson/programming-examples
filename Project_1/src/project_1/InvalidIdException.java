/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author Administrator
 */
public class InvalidIdException extends Exception{
    private int empId;
    
    public InvalidIdException(int empId){
        super("Invalid ID number " + empId);
        this.empId = empId;
    }
    
    public double getId(){
        return empId;
    }
}
