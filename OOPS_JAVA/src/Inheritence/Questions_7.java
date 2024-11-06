package Inheritence;

public class Questions_7 {
    public static void main(String[] args) {
        SavingAccounts savingAccounts = new SavingAccounts(1000, 12345, 100000);
        savingAccounts.deposit(100000);
        savingAccounts.addIntrest();
    }
}

class Account{
    int accountNumber;
    int balance;

    Account(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Balance: "+ balance);
    }
}

class SavingAccounts extends Account{
    int intrestRate;

    public SavingAccounts(int intrestRate, int accountNumber, int balance){
        super(accountNumber, balance);
        this.intrestRate = intrestRate;
    }

    public void addIntrest(){
        balance += intrestRate;

        System.out.println("Intrest added: "+ intrestRate);
        System.out.println("Actual balance: "+ balance);
    }
}
