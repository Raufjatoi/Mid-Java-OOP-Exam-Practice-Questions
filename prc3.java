import java.util.Date;
import java.util.List;

class Customer {
    String name ; 
    String email;
    String address; 
    //geterss
    public String getname (){
        return name ;
    }
    public String getemail(){
        return email;
    }
    public String getaddress(){
        return address;
    }
}
class Product {
    int productID;
    String name ; 
    double price ; 
    // more getters 
    public String getName(){
        return name ;
    }
    public double getPrice(){
        return price ;
    } 

}
class Order {
    int orderID ;
    Date date ; 
    double total ; 
    // guse wha ya getters again 
    public int getOrderID(){
        return orderID;
    }
    public Date getDate (){
        return date;
    }
    public double getTotal (){
        return total;
    }
}
class ShoppingCart{
    List<Product> items ;
    Customer customer;
    // functions or method same thing 
    public void add(Product p){
        // some condition 
        items.add(p);
    }
    public void remove (Product p){
        // yk
        items.remove(p);
    }
    // last getter \
    public double getTotal(){
        double total = 0;
        // do some ops with loops 
        return total;
    }
}

public class prc3 {
    
}
