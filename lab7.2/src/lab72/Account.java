/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab72;

/**
 *
 * @author Administrator
 */
public class Account {
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
