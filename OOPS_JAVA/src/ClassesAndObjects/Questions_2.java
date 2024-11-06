package ClassesAndObjects;

//Write a class BankAccount with properties like accountNumber, balance, and accountHolder.
// Implement methods to deposit, withdraw, and check the balance
//Also, add validation to ensure the withdrawal amount does not exceed the balance.

public class Questions_2 {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(12345, 10000, "sajan karki");
        bank1.deposit(50000);
        bank1.widthDraw(1000);
        bank1.setAccountHolderName("sajan N karki");
        System.out.println(bank1.getBalance());
        bank1.getAccountHolderDetails();

        BankAccount bank2 = new BankAccount(23456, 100000, "abc");
        bank2.deposit(200000);
        bank2.getAccountHolderDetails();
        bank2.widthDraw(299999);
    }
}

class BankAccount{
    private int accountNumber;
    private int balance;
    private String accountHolderName;

    public BankAccount(int accountNumber, int balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    //method to add money/deposit to your account
    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Your current bank balance is: "+ balance);
        }else {
            System.out.println("The amount should not be negative");
        }
    }

    //method to widthdraw money from bank
    public void widthDraw(int amount){
        if (amount > 0){
            if (amount <= balance){
                balance -= amount;
                System.out.println("Your current bank balance is: "+ balance);
            }else {
                System.out.println("insufficient funds");
            }
        }else {
            System.out.println("The amount should not be negative");
        }
    }

    //getdetails
    public void getAccountHolderDetails(){
        System.out.println("Name: " + accountHolderName + " Account number: "+ accountNumber + " Balance: "+ balance);
    }

    //getter and setter
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}
