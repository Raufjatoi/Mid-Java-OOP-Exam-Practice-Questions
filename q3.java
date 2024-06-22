//3. Restaurant Menu Management:


//o Create a class named Dish with member variables for name, description 
//(optional), price, and category (e.g., appetizer, main course).
class Dish {
    //member var 
    String name , description , category  ;
    int price ;

    public Dish (String name , String description ,  int price , String category){
        this.name = name;
        this.description = description;
        this.price = price ;
        this.category = category;

        // maybe get fun later if needed cause still figuring out these 

    }

}
//o Implement methods in RestaurantMenu to:



class RestaurantMenu{
    static Dish [] dishes;

    //constructor 

    public RestaurantMenu(Dish [] dishes){
      this.dishes = dishes ;

    }
    public static void add_dish (Dish d ){
        for ( int i = 0;  i <  dishes.length ; i++){
            if (d.name != dishes[i].name){
                d.add(dishes);
            }

        }
    }
    // Display all dishes categorized by type.
    public static void display (){
        for (int i = 0; i < dishes.length ; i++ ){
            dishes[i].category = "sweet";
            System.out.println("Category : Sweeet ");
            System.out.println(dishes[i]); 
        }
        for (int i = 0; i < dishes.length ; i++){
            dishes[i].category = "spicey";
            System.out.println("Category : Spicy ");
            System.out.println(dishes[i]);
            
        }
    }
    // Search for a dish by name and display its details (if found).
    public static void search (Dish s ){
        for (int i = 0; i < dishes.length ; i++){
            if (s.name == dishes[i].name){
                System.out.println("found");
                System.out.println("dish : " + dishes[i].name + " price : " + dishes[i].price + "\n " + 
                " description :" + dishes[i].description + " cateogory " + dishes[i].category );
            }
            else{
                System.out.println("not found");
            }
        }
    }
    
// Allow modification of dish details (price, description) based on name.
// later 

}

public class q3 {
    public static void main(String[] args) {
        Dish d1 = new Dish("biryani", "traditional paki dish" ,  200 , "spicy" );

        RestaurantMenu.add_dish(d1);
        RestaurantMenu.display();
        RestaurantMenu.search(d1);
    }
    
}
