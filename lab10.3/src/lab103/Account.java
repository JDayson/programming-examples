/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab103;

/**
 *
 * @author Administrator
 */
public class Account {
    int id = 0;
    double balance = 0, annInterestRate = 0;
    java.util.Date dateCreated = new java.util.Date();
    double monthInterest = annInterestRate / 12;
    
    Account(){
        
    }
    Account(int newId, double newBalance, double newAnnInterestRate){
        id = newId;
        balance = newBalance;
        annInterestRate = newAnnInterestRate;
    }
    int getId(){
        return id;
    }
    void setId(int newId){
        id = newId;
    }
    double getBalance(){
        return balance;
    }
    void setBalance(double newBalance){
        balance = newBalance;
    }
    double getAnnInterestRate(){
        return annInterestRate;
    }
    void setAnnInterestRate(double newAnnInterestRate){
        annInterestRate = newAnnInterestRate;
    }
    java.util.Date getDateCreated(){
        return dateCreated;
    }
    public double withdraw(double amtWith){
        balance -= amtWith;
        return balance; 
    }
    public double deposit(double amtDep){
        balance += amtDep;
        return balance;
    }
}
class SavingsAccount extends Account{
    SavingsAccount(){
        
    }
    SavingsAccount(int newId, double newBalance, double newAnnInterestRate){
        id = newId;
        balance = newBalance;
        annInterestRate = newAnnInterestRate;
    }
    @Override
    public double withdraw(double amtWith){
        if (balance - amtWith >= 0.0){
            balance -= amtWith;
        }
        else if (balance - amtWith < 0.0){
            System.out.println("This transaction is denied, insufficient funds.");
        }
        return balance;
    }
    @Override
    public double deposit(double amtDep){
        balance += amtDep;
        return balance;
    }
    @Override
    public String toString(){
        return "Savings: " + id + "\nValued Customer Since: " + dateCreated + "\nBalance: " + balance + "\nInterest" + (balance * monthInterest) + "Total: " + ((balance * monthInterest)+ balance);
    }
}
class CheckingAccount extends Account{
    CheckingAccount(){
        
    }
    CheckingAccount(int newId, double newBalance, double newAnnInterestRate){
        id = newId;
        balance = newBalance;
        annInterestRate = newAnnInterestRate;
    }
    private double fee = 35.00;
    public int feeCount = 0;
    @Override
    public double withdraw(double amtWith){
        if (balance - amtWith >= 0.0){
            balance -= amtWith;
        }
        else if (balance - amtWith < 0.0){
            balance -= amtWith;
            balance -= fee;
            feeCount++;
            System.out.println("Your account is overdrawn. A $35.00 peanalty fee has been deducted from your account.");
        }
        
        return balance; 
    }
    @Override
    public double deposit(double amtDep){
        balance += amtDep;
        return balance;
    }
    @Override
    public String toString(){
        return "Checking: " + id + "\nValued Customer Since: " + dateCreated +   "\nOverdraft Fees: " + (fee * feeCount) + "\nBalance: " + balance;
    }
}
