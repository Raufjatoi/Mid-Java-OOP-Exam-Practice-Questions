import java.util.ArrayList;

// Product class
class Product {
    String product_id, name, description;
    int price, stock_quantity;

    // Constructor
    public Product(String product_id, String name, String description, int price, int stock_quantity) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
    }

    // Getters
    public String getProductId() {
        return product_id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stock_quantity;
    }

    // Update stock quantity
    public void updateStockQuantity(int quantity) {
        this.stock_quantity += quantity;
    }
}

// InventoryManager class
class InventoryManager {
    static ArrayList<Product> stock = new ArrayList<>();

    // Constructor
    public InventoryManager(ArrayList<Product> stock) {
        this.stock = stock;
    }

    // Add product
    public static void add(Product p) {
        for (Product product : stock) {
            if (p.product_id.equals(product.product_id)) {
                System.out.println("Product ID already exists.");
                return;
            }
        }
        stock.add(p);
    }

    // Update stock
    public static void updateStock(String productId, int quantity) {
        for (Product product : stock) {
            if (product.product_id.equals(productId)) {
                product.updateStockQuantity(quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Search product
    public static void search(String productId) {
        for (Product product : stock) {
            if (product.product_id.equals(productId)) {
                System.out.println("Product ID: " + product.product_id);
                System.out.println("Name: " + product.name);
                System.out.println("Description: " + product.description);
                System.out.println("Price: " + product.price);
                System.out.println("Stock Quantity: " + product.stock_quantity);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Report
    public static void report() {
        for (Product product : stock) {
            System.out.println("Product ID: " + product.product_id);
            System.out.println("Name: " + product.name);
            System.out.println("Stock Quantity: " + product.stock_quantity);
            System.out.println("Total Value: " + (product.price * product.stock_quantity));
            System.out.println();
        }
    }
}

// Main class
public class q7 {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("1", "Laptop", "Gaming laptop", 1500, 10);
        Product p2 = new Product("2", "Smartphone", "Latest model", 800, 20);

        // Create inventory manager and add products
        InventoryManager manager = new InventoryManager(new ArrayList<>());
        manager.add(p1);
        manager.add(p2);

        // Update stock
        manager.updateStock("1", 5);

        // Search product
        manager.search("1");

        // Generate report
        manager.report();
    }
}
