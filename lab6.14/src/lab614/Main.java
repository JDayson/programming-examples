/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab614;
/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = gcd(45, 75, 50, 90);
        System.out.println(x);
    }
    public static int gcd(int num1, int num2){
        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static int gcd(int...numbers){
        int result = numbers[0];
        for (int i = 0; i < numbers.length; i ++){
            result = gcd(result, numbers[i]);
        }
        return result;
    }
}
    
