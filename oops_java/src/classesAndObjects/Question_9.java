package classesAndObjects;

//10. Online Shopping System
//Create a Product class with properties like productID, name, price, and category.
//Define a ShoppingCart class that holds a list of products and provides methods to:
//Add a product to the cart.
//Remove a product by its ID.
//Calculate the total cost of items in the cart.
//List all products in a specific category.

import java.util.ArrayList;
import java.util.List;

public class Question_9 {
    public static void main(String[] args) {
        Prod prod = new Prod(1, "headphone", 1000, "music");
        Prod prod1 = new Prod(2, "laptop", 20000, "tech");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(prod);
        shoppingCart.addProduct(prod1);
        shoppingCart.listAllTheProducts();

        shoppingCart.getTotalCostOfItems();
    }
}

class Prod{
    private int productId;
    private String name;
    private double price;
    private String category;

    public Prod(int productId, String name, double price, String category){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getter and setter methods
    public int getProductId(){
        return productId;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void displayProducts(){
        System.out.println("ProductId: "+ productId);
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Category: "+ category);
    }
}

class ShoppingCart{
    List<Prod> prods;

    public ShoppingCart(){
        prods = new ArrayList<>();
    }

    //add a product to the cart
    public void addProduct(Prod prod){
        prods.add(prod);
        System.out.println("Product" + prod.getName() + " has been added to the cart");
    }

    //remove a product from the cart
    public void removeProduct(String productName){
        for (Prod prod: prods){
            if (prod.getName().equalsIgnoreCase(productName)){
                prods.remove(productName);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    //get total cost of items in the cart
    public void getTotalCostOfItems(){
        double totalCost = 0;
        for (Prod prod: prods){
            totalCost += prod.getPrice();
        }
        System.out.println("Total cost: "+ totalCost);
    }

    //list all the products in the cart
    public Prod listAllTheProducts(){
        if (prods.isEmpty()){
            System.out.println("The cart is empty!");
        }else {
            System.out.println("Fetching products details...");
            for (Prod prod: prods){
                prod.displayProducts();
                System.out.println("--------");
            }
        }
        return null;
    }
}
