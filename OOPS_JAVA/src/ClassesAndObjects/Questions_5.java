package ClassesAndObjects;

//2. Product and Inventory
//Define a Product class with properties such as productID, name, price, and quantity.
//Create an Inventory class that holds a collection of Product objects. The Inventory class should have methods to:
//Add a product to the inventory.
//Remove a product by its ID.
//Update the quantity of a product.
//Find products below a specified stock level.
//Display the total inventory value (based on price and quantity).

import java.util.ArrayList;
import java.util.List;

public class Questions_5 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "basketball", 2000, 2);
        Product product2 = new Product(2, "Tshirts", 1000, 5);

        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.updateProduct("basketball", 3);
        //inventory.removeProduct(2);

        inventory.getInventoryValue("tshirts");
        inventory.displayProduct();
    }
}

class Product{
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    //getter and setter methods
    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setProductId(int productId){
        this.productId= productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void displayInformation(){
        System.out.println("ProductId: "+ productId + " ProductName: "+ productName + " Price: $"+ price + "Quentity: "+ quantity);
    }
}

class Inventory{
    List<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    //add products to incentory
    public void addProduct(Product product){
        System.out.println("Product " + product.getProductName() + " addded to inventory");
        products.add(product);
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

    //update the product
    public void updateProduct(String name, int updatedQuantity){
        for (Product product: products){
            if (product.getProductName().equalsIgnoreCase(name)){
               int quantity = product.getQuantity();
               updatedQuantity += quantity;

               product.setQuantity(updatedQuantity);
            }
        }
    }

    //get total inventory value
    public void getInventoryValue(String name){
        for (Product product: products){
            if (product.getProductName().equalsIgnoreCase(name)){
                int qty = product.getQuantity();
                double price = product.getPrice();

                int inventory_level = (int) (qty * price);

                System.out.println("The total inventory level is: "+ inventory_level);
            }
        }
    }

    //display the product
    public void displayProduct(){
        if (products.isEmpty()){
            System.out.println("The inventory is empty!");
        }else {
            for (Product product: products){
                product.displayInformation();
            }
        }
    }

}
