/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab103;
import javax.swing.JOptionPane;

public class Main {
public class Checking extends Account{
    private double overDraftLimit = 100.00;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account sv1 = new SavingsAccount(00001, 200, .0);
        Account ck1 = new CheckingAccount(00003, 2000, .09);
        sv1.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null, "How Much do you wish to withdraw from savings?")));
        ck1.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null, "How Much do you wish to withdraw from checking?")));
        System.out.println(sv1.toString());
        System.out.println(ck1.toString());
    }

}
