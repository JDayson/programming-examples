/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package address.book;

/**
 *
 * @author Administrator
 */
public class DataAccessException extends Exception {
    private Exception exception;
    
    public DataAccessException (String message){
        super(message);
    }
    
    public DataAccessException (Exception exception){
        exception = this.exception;
    }
    
    public void printStackTrace(){
        exception.printStackTrace();
    }
}
