package classesAndObjects;

// Product and Inventory
//Define a Product class with properties such as productID, name, price, and quantity.
//Create an Inventory class that holds a collection of Product objects. The Inventory class should have methods to:
//Add a product to the inventory.
//Remove a product by its ID.
//Update the quantity of a product.
//Find products below a specified stock level.
//Display the total inventory value (based on price and quantity).

import java.util.ArrayList;
import java.util.List;

public class Question_7 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "headphones", 5000, 2);
        Product product2 = new Product(2, "laptop", 60000, 5);

        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.updateQuantity(1, 8);
        //inventory.displayProducts();

        //inventory.findProductsAtSpecifiedStockLevel(5);
        inventory.getInventoryValue("headphones");
    }
}

class Product{
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters and setters method
    public int getProductId(){
        return productId;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //display details
    public void displayDetails(){
        System.out.println("Product Id: "+ productId);
        System.out.println("Name: "+ name);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Price: "+ price);
    }
}

class Inventory{
    List<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    //add product to the inventory
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product"+ product.getName() +" has been added to the inventory.");
    }

    //remove a product by its id
    public void removeProduct(int id){
        for (Product product: products){
            if (product.getProductId() == id){
                products.remove(product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    //method to update product quantity
    public void updateQuantity(int id, int quantity){
        for (Product product: products){
            if (product.getProductId() == id){
                int new_quantity = product.getQuantity() + quantity;
                product.setQuantity(new_quantity);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    //find the products below the specified stock level
    public void findProductsAtSpecifiedStockLevel(int quantity){
        System.out.println("Fetching products below quantity: "+ quantity);
        for (Product product: products){
            if (product.getQuantity() <= quantity){
                product.displayDetails();
            }
        }
    }

    //total inventory value of a particular product
    public void getInventoryValue(String productName){
        for (Product product: products){
            if (product.getName().equalsIgnoreCase(productName)){
                double totalValue = product.getQuantity() * product.getPrice();
                System.out.println("Total inventory value: "+ totalValue);
            }
        }
    }

    //display all products in the inventory
    public void displayProducts(){
        if (products.isEmpty()){
            System.out.println("The inventory is empty!");
        }else {
            System.out.println("Fetching products from the inventory...");
            for (Product product: products){
                product.displayDetails();
                System.out.println("--------");
            }
        }
    }
}
