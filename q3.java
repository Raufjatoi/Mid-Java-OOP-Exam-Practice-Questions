// importin some libs 
import java.util.ArrayList;
import java.util.List;

// class Dish
class Dish {
    // member variables or properties or attributes so many names 
    String name, description, category;
    int price;

    // Construc
    public Dish(String name, String description, int price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
    // getter methods are kinda easy when u wanna get the value then doin those . thing 
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
// restaurant menu class
class RestaurantMenu {
    // atributes 
    static List<Dish> menu = new ArrayList<>(); 
    // constructor
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
    // method to display
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

    // method to search 
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
    // method to allow some modification 
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

// main class to run the program
public class q3 {
    // main function 
    public static void main(String[] args) {
        // creatin a new dish
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
