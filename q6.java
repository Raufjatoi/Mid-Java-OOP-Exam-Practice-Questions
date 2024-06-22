//6. Social Media News Feed:

import java.util.Date;
//o Design a class named Post with properties for author name, content (text),
//timestamp, and number of likes.
class Post {
    String author ; 
    String content ;
    Date timestamp ;
    int likes ; 

    // construct 
    public Post (String author , String content , Date timestamp , int likes ){
        this.author = author ;
        this.content = content ;
        this.timestamp = timestamp;
        this.likes = likes ; 

    }
    // Maybe get funcs hhuuh 
}
//o Create a class named SocialMediaFeed that holds an array of Post objects
//representing a user's news feed.
class SocialMediaFeed {
    static Post [] user ;

    //construct but arent tha isnt right ??     

    //o Implement functionalities in SocialMediaFeed to:
    
    // Search for posts by a particular author and display them in reverse
    //chronological order (newest first).

    // Add a new post to the feed, displaying it at the top (most recent). 

    public static void add(Post p , SocialMediaFeed u ){
        p.Add(u);
        }
        for ( int i = 0 ; u.length()){
            System.out.println(u[-i].name + " " + u[-i].content + " " + u[-i].timestamp + " " + u[-i].likes );

        }
    }
    // Like a post by a specific author and increment its like count (ensure the
    //post exists). 
    public static void like ( Post p , SocialMediaFeed u ){
        if (p in u){
            p.likes ++;
        }
    }

public class q6 {
    
}
