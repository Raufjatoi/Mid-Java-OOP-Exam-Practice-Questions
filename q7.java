//E-commerce Product Inventory:
//o Create a class named Product with details like product ID, name, description,
//price, and stock quantity.

import java.util.ArrayList;

class Product {
    String product_id , name , description ;
    int price , stock_quantity ;

    public Product (String product_id , String name , String description , int price , int stock_quantity){
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
    }
    //getters 
    public String getproduct_id(){
        return product_id;
    }
    public String getdescription(){
        return description;
    }
    public String getname (){
        return name ;
    }
    public int getprice (){
        return price ;
    }
    public int getquantity(){
        return stock_quantity ;
    } 
    // maybe some updaters too like inc , dec blah blah 
}

//o Design a class named InventoryManager to manage product stock.
class InventoryManager {
    static ArrayList<Product> stock ;

    public InventoryManager ( ArrayList<Product> stock ){
        this.stock = stock;
    }
    // getter ?? 

//o Implement functionalities in InventoryManager to:
// Add a new product to the inventory with a unique ID.
    public static void add (Product p){
        for (Product product : stock){
            if (p.product_id == product.product_id){
                stock.add(p);
            }

        }
    }
// Update the stock quantity of an existing product (allow adding or
//removing stock).
// Search for a product by ID and display its details (if found).
// Generate a report showing all products with their current stock levels and
//total value (price * quantity).
}
public class q7 {
    
}
