package Inheritence;

public class Question_9 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100, "sajan karki", 50000);
        checkingAccount.withdrawMoney(10000);
        checkingAccount.depositMoney(1000);
    }
}

class BankAccount{
    String accountHolder;
    int accountBalance;

    public BankAccount(String accountHolder, int accountBalance){
        this.accountBalance=accountBalance;
        this.accountHolder=accountHolder;
    }

    public void depositMoney(int amount){
        if (amount > 0){
            accountBalance += amount;
            System.out.println("Amount: "+ amount + " has been deposited, Cuurent bankBalance: "+ accountBalance);
            return;
        }
        System.out.println("Amount should not be negative");
    }

    public void withdrawMoney(int amount){
        if (amount > 0){
            if (amount <= accountBalance){
                accountBalance-=amount;
                System.out.println("Amount: "+ amount + " has been widthdrawn from bank, Current bankBalance: "+ accountBalance);
            }else {
                System.out.println("Insufficeint funds");
            }
        }else {
            System.out.println("Amount should not be negative");
        }
    }
}

class CheckingAccount extends BankAccount{
    int transactionFee;

    public CheckingAccount(int transactionFee, String accountHolder, int accountBalance){
        super(accountHolder, accountBalance);
        this.transactionFee=transactionFee;
    }

    public void withdrawMoney(int amount){
        if (amount > 0){
            if (amount + transactionFee <= accountBalance){
                accountBalance -= amount + transactionFee;
                System.out.println("Amount withdrawn: " + amount + ". Transaction fee: " + transactionFee + ". Current bank balance: " + accountBalance);
            }else {
                System.out.println("Insufficient balance for withdrawal, including transaction fee.");
            }
        }
    }
}
