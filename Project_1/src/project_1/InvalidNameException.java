/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;
import java.lang.Throwable;
/**
 *
 * @author Administrator
 */
public class InvalidNameException extends Exception{
    private String empName;
    
    public InvalidNameException(String empName){
        super("Invalid name " + empName);
        this.empName = empName;
    }
    
    public String getName(){
        return empName;
    }
}
