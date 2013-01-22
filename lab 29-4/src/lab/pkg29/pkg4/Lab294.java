/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg29.pkg4;
import java.util.concurrent.*;
/**
 *
 * @author Administrator
 */
public class Lab294 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intSum = 0;
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        executor.execute(new IncNum(intSum));
        executor.shutdown();
    }
}
