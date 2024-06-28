//6. Social Media News Feed:

import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

//o Design a class named Post with properties for author name, content (text),
//timestamp, and number of likes.
class Post {
    // properts 
    String author ; 
    String content ;
    Date timestamp ;
    int likes ; 

    // construct 
    public Post (String author , String content  ){
        this.author = author ;
        this.content = content ;
        this.timestamp = null;
        this.likes = 0 ; // at beggni likes be 0

    }
    // getter funcs 
    public String getauthor (){
        return author;
    }
    public String getcontent (){
        return content ;
    }
    public Date geDate (){
        return timestamp ;
    }
    public int getlikes (){
        return likes ;
    }
    //incre likes 
    public int uplikes (){
        return likes ++;
    }
}
//o Create a class named SocialMediaFeed that holds an array of Post objects
//representing a user's news feed.
class SocialMediaFeed {
    static Post [] user ;

    //construct 
    public SocialMediaFeed (Post [] user ){
        this.user = user;
    } 
    //getter 
    public Post [] getuser (){
        return user ;
    }

//o Implement functionalities in SocialMediaFeed to:
// Add a new post to the feed, displaying it at the top (most recent).
    public static void addpost (Post post ){
        post.Add(user);
        }
    public static void display (){
        for (int i = 0; i < user.length; i++ ){
            System.out.println(user[-i+1].author + "posted " + user[-i+1].content + "at" + user[-i+1].timestamp + "likes = " + user[-1+1].likes);
        }
    }
// Like a post by a specific author and increment its like count (ensure the
//post exists).
    public static void addlike (Post p){
        for (int i = 0; i < user.length; i ++ ){
            if ( p.author == user[i].author ){
                p.uplikes();
            }
            else {
                System.out.println("didnt found post ");
            }
        }
    } 
// Search for posts by a particular author and display them in reverse
//chronological order (newest first).
    public static void searchposts (Post p ){
        Post [] found ;
        for (int i = 0; i < user.length; i++){
            if (p.author == user[i].author){
                p.Add(found);    
        }
        }
        for (int i = 0; i < found.length; i++){
            System.out.println(found.author , found.content , found.likes);
    }
}
}
public class q6 {
    public static void main(String[] args) {

        //create 
        Post p1 = new Post("Rauf", "My first day at uni" );
        Post p2 = new Post("ahsan" , "My ecommerce journey ");
        Post p3 = new Post ("Rauf", "java or python ");


        SocialMediaFeed rauf = new SocialMediaFeed(p1,p3);
        SocialMediaFeed ahsan = new SocialMediaFeed(p2);

        //ops
        rauf.addlike(p1);
        ahsan.addlike(p2);

        rauf.display();

        rauf.searchposts(p3);

        ahsan.display();


        
    }
}
