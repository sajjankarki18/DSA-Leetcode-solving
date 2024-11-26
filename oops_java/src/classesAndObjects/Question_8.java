package classesAndObjects;

//3. Bank and Customer
//Create a Customer class with properties customerID, name, email, and phone.
//Define a Bank class that holds a list of Customer objects and provides methods to:
//Add a new customer.
//Remove a customer by ID.
//Update customer contact information.
//List all customers in the bank.
//Search for a customer by name.

import java.util.ArrayList;
import java.util.List;

public class Question_8 {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "sajan karki", "sajjankarki10@gmail.com", 281271);
        Customer customer2 = new Customer(2, "milan khatri", "milan123@gmail.com", 428232);

        Bank bank = new Bank();
        bank.addCustomer(customer2);
        bank.addCustomer(customer);

        bank.searchCustomer("sajan karki");
    }
}

class Customer{
    private int customerId;
    private String name;
    private String email;
    private int phone;

    public Customer(int customerId, String name, String email, int phone){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    //getter and setter methods
    public int getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getPhone(){
        return phone;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public void displayDetails(){
        System.out.println("Customer Id: "+ customerId);
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);
        System.out.println("Phone: "+ phone);
    }
}

class Bank{
    List<Customer> customers;

    public Bank(){
        customers = new ArrayList<>();
    }

    //add a new customer
    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Customer "+ customer.getName() + " added to the bank");
    }

    //remove a customer by id
    public void removeCustomer(int id){
        for (Customer customer: customers){
            if (customer.getCustomerId() == id){
                customers.remove(id);
                return;
            }
        }
        System.out.println("customer not found!");
    }

    //search customer by name
    public void searchCustomer(String customerName){
        for (Customer customer: customers){
            System.out.println("Fetching customer "+ customerName);
            if (customer.getName().equalsIgnoreCase(customerName)){
                customer.displayDetails();
                return;
            }
        }
        System.out.println("Customer not found");
    }

    //list all customer in the bank
    public void displayCustomers(){
        if (customers.isEmpty()){
            System.out.println("The bank is empty!");
        }else {
            System.out.println("Fetching customers...");
            for (Customer customer: customers){
                customer.displayDetails();
                System.out.println("--------");
            }
        }
    }
}