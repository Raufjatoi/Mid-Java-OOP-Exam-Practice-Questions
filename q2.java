import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product c) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                System.out.println("Product already exists");
                return;
            }
        }
        cart.add(c);
    }

    public void updateQuantity(Product c, int quantity) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                product.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Product does not exist");
    }

    public void removeItem(Product c) {
        for (Product product : cart) {
            if (product.getName().equals(c.getName())) {
                cart.remove(product);
                return;
            }
        }
        System.out.println("Product does not exist");
    }

    public int total() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void display() {
        for (Product product : cart) {
            System.out.println("Item: " + product.getName() + " | Quantity: " + product.getQuantity() + " | Price: " + product.getPrice());
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

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
