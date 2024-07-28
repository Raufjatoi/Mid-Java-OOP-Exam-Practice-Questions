import java.util.Date;
import java.util.List;

class Book {
    String title ; 
    String ISBN ; 

    public String getTitle(){
        return title ;
    }
    public String getISBN(){
        return ISBN ; 
    }
}

class Author {
    String name ; 
    Date birdate ;

    public String getname (){
        return name ;
    }
    public Date getBirthDate (){
        return birdate ;
    }
}

class Library {
    List<Book> books ;
    List<Author> authors ;

    // methads or funs
    public void addbook(Book b ){
        // if ( some thin )
        books.add (b);
        // else if (somethin else true ){
        // sout+tab ( " its alreay in list ")}
    } 
    public void removebokk (Book b){
        // if same as up 
        books.remove(b);
    }
}


public class prc2 {
    
}
