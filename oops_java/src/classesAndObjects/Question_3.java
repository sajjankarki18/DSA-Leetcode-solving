package classesAndObjects;

import javax.print.attribute.standard.JobName;

public class Question_3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12121, "sajan karki", 100000);
        bankAccount.depositMoney(200000);
        bankAccount.withdrawMoney(10000);
        bankAccount.depositMoney(10000);
    }
}

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to deposit money
    public void depositMoney(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Amount deposited: "+ amount + ". Your current Bank Balance is "+ balance);
        }else {
            System.out.println("The amount cannot be negative...");
        }
    }

    //method to withdraw money from bank
    public void withdrawMoney(int amount){
        if (amount > 0){
            if (amount <= balance){
                balance -= amount;
                System.out.println("Amount withdrawn: "+ amount + ". Your current bank balance "+ balance);
            }else {
                System.out.println("You dont have sufficient bank balance");
            }
        }else {
            System.out.println("The amount cannot be negative...");
        }
    }
}