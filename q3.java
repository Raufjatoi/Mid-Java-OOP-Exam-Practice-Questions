import java.util.ArrayList;
import java.util.List;

// Define class
class Dish {
    // Member variables
    String name, description, category;
    int price;

    // Construc
    public Dish(String name, String description, int price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}

// RestaurantMenu class
class RestaurantMenu {
    static List<Dish> menu = new ArrayList<>(); 

    // Constructor
    public RestaurantMenu(List<Dish> menu) {
        this.menu = menu;
    }

    // add method 
    public static void addDish(Dish d) {
        for (Dish dish : menu) {
            if (dish.getName().equals(d.getName())) {
                return;
            }
        }
        menu.add(d);
    }

    // Method to display
    public static void display() {
        System.out.println("Category: Sweet");
        for (Dish dish : menu) {
            if (dish.getCategory().equals("sweet")) {
                System.out.println(dish.getName() + ": " + dish.getDescription() + ", $" + dish.getPrice());
            }
        }

        System.out.println("Category: Spicy");
        for (Dish dish : menu) {
            if (dish.getCategory().equals("spicy")) {
                System.out.println(dish.getName() + ": " + dish.getDescription() + ", $" + dish.getPrice());
            }
        }
    }

    // Method to search 
    public static void search(String dishName) {
        for (Dish dish : menu) {
            if (dish.getName().equals(dishName)) {
                System.out.println("Found dish: " + dish.getName() + ", Price: $" + dish.getPrice() +
                        ", Description: " + dish.getDescription() + ", Category: " + dish.getCategory());
                return;
            }
        }
        System.out.println("Dish not found");
    }

    // Method to allow modification 
    public static void modifyDish(String dishName, int newPrice, String newDescription) {
        for (Dish dish : menu) {
            if (dish.getName().equals(dishName)) {
                dish.price = newPrice;
                dish.description = newDescription;
                System.out.println("Dish updated: " + dish.getName());
                return;
            }
        }
        System.out.println("Dish not found");
    }
}

// Main class to run the program
public class q3 {
    public static void main(String[] args) {
        // Create a new dish
        Dish d1 = new Dish("biryani", "traditional pakistani dish", 200, "spicy");

        // Add
        RestaurantMenu.addDish(d1);

        // Display
        RestaurantMenu.display();

        // Search
        RestaurantMenu.search("biryani");

        // Modify 
        RestaurantMenu.modifyDish("biryani", 250, "delicious traditional pakistani dish");
    }
}
