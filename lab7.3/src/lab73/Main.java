/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab73;
//import javax.swing.JOptionPane;
class Account{
    int ID = 0;
    double balance = 0.0;
    double AIR = 0.0;
    int dateCreated = 10071989;
    
    Account (int newID, double newBalance, double newAIR, int newDateCreated){
        ID = newID;
        balance = newBalance;
        AIR = newAIR;
        dateCreated = newDateCreated;
    }
    int getID (){
        return ID;
    }
    double getBalance(){
        return balance;
    }
    double getAIR (){
        return AIR;
    }
    int getDate(){
        return dateCreated;
    }
    double getMonthlyIntrestRate(){
        balance = balance * AIR;
        return balance;
    }
    double withdraw(double Ammount){
        balance = balance - Ammount;
        return balance;
    }
    double deposit(double Ammount){
        balance = balance + Ammount;
        return balance;
    }   

}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account newAccount = new Account(1122, 20000.00, 1.45, 10071989);
        newAccount.withdraw(2500.00);
        newAccount.deposit(3000.00);
        int dateCreated = newAccount.getDate();
        double balance = newAccount.getBalance();
        double AIR = newAccount.getAIR();
        System.out.println("Your Balance is: " + balance + " Your Intrest is: " + AIR + " Account created on " + dateCreated);

    }

}
