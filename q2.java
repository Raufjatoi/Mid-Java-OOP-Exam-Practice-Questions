// importing some libs 
import java.util.ArrayList;
import java.util.List;
// class
class Product {
    // properties or attributes 
    String name;
    int price;
    int quantity;

    // constructoe
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //getters method 
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    // setters or updaters whatever 
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
//another class 
class ShoppingCart {
    // attri
    List<Product> cart;

    // constructor
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    // add method
    public void addProduct(Product c) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                System.out.println("Product already exists");
                return;
            }
        }
        cart.add(c);
    }
    // update method 
    public void updateQuantity(Product c, int quantity) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                product.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Product does not exist");
    }
    // remove method 
    public void removeItem(Product c) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                cart.remove(product);
                return;
            }
        }
        System.out.println("Product does not exist");
    }
    // total method 
    public int total() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
    // display method
    public void display() {
        for (Product product : cart) {
            System.out.println("Item: " + product.getName() + " | Quantity: " + product.getQuantity() + " | Price: " + product.getPrice());
        }
    }
}
//main class
public class q2 {
    // maib method
    public static void main(String[] args) {
        // creating cart 
        ShoppingCart cart = new ShoppingCart();
        // creatin some producs
        Product p1 = new Product("Laptop", 40000, 1);
        Product p2 = new Product("Headphones", 300, 1);
        Product p3 = new Product("Speakers", 5600, 2);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.updateQuantity(p2, 2);
        cart.removeItem(p3);
        cart.display();
        int total = cart.total();
        System.out.println("Total Bill: " + total);
    }
}
