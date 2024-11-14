package AbstractionAndInterfaces;

//Payment System:
//
//Create an abstract class Payment with an abstract method processPayment(double amount).
//Implement subclasses like CreditCardPayment and PaypalPayment, each with its own implementation of processPayment.
//Write a main method to demonstrate polymorphism by calling processPayment on different payment types.

public class Question2 {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(1000);

        PaypalPayment paypalPayment = new PaypalPayment();
        paypalPayment.processPayment(1000);
    }
}

abstract class Payment{
    public abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment{
    public void processPayment(double amount){
        System.out.println("Payment made though the credit card: "+ amount);
    }
}

class PaypalPayment extends Payment{
    public void processPayment(double amount){
        System.out.println("Payment made though the paypal: "+ amount);
    }
}

