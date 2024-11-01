package ClassesAndObjects;

//Write a class BankAccount with properties like accountNumber, balance, and accountHolder.
// Implement methods to deposit, withdraw, and check the balance.
// Also, add validation to ensure the withdrawal amount does not exceed the balance.

public class Question_2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("sajan karki", 10000, 12345);
        bankAccount.showBalance();

        bankAccount.depositMoney(10000);
        bankAccount.showBalance();

        bankAccount.widthdrawMoney(2000);
        bankAccount.showBalance();
    }
}

class BankAccount{
    int accountNumber;
    double balance;
    String accountHolder;

    public BankAccount(String accountHolder, double balance, int accountNumber){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //method to deposit to bank account
    public void depositMoney(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited amount: "+ amount);
        }else {
            System.out.println("The amount could not be negative!");
        }
    }

    //method to widthraw money from account
    public void widthdrawMoney(double amount){
        if (amount > 0){
            balance -= amount;
            System.out.println("widthdrawn amount: "+ balance);
        }else {
            System.out.println("The amount could not be negative!");
        }
    }

    public void showBalance(){
        System.out.println("Your current bank balance is: "+ balance);
    }
}
