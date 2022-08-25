package classes;

public class BankAccount {

    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    public  BankAccount(){
        
    }


    public double getBalance() {
        return balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        if (balance < 0) {
            this.balance = 0;
        }
        return balance;
    }

    public double deposite(double amount) {
        balance = balance + amount;
        return balance;
    }
    
    public double transfer(BankAccount to,double amount){
        this.balance = this.balance-amount;
        if(this.balance<0){
            return 0;
        }
        to.balance = to.balance + amount;
        return to.balance;
    }

}
