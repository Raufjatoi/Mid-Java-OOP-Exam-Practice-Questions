// importin libs 
import java.util.Date;
import java.util.ArrayList;
//o Design a class named Post with properties for author name, content (text),
//timestamp, and number of likes.
class Post {
    // properties
    String author;
    String content;
    Date timestamp;
    int likes;
    // constructor
    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
        this.likes = 0; // at beginning likes be 0
    }
    // getter funcs
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public Date getDate() {
        return timestamp;
    }
    public int getLikes() {
        return likes;
    }
    // increase likes
    public void upLikes() {
        likes++;
    }
}
//o Create a class named SocialMediaFeed that holds an array of Post objects
//representing a user's news feed.
class SocialMediaFeed {
    ArrayList<Post> userFeed;
    // constructor
    public SocialMediaFeed() {
        this.userFeed = new ArrayList<>();
    }
    // getter
    public ArrayList<Post> getUserFeed() {
        return userFeed;
    }
    //o Implement functionalities in SocialMediaFeed to:
    // Add a new post to the feed, displaying it at the top (most recent).
    public void addPost(Post post) {
        userFeed.add(0, post);
    }
    // displayin all posts
    public void display() {
        for (Post post : userFeed) {
            System.out.println(post.author + " posted \"" + post.content + "\" at " + post.timestamp + ", likes = " + post.likes);
        }
    }
    // Like a post by a specific author and increment its like count (ensure the
    //post exists).
    public void addLike(String author) {
        for (Post post : userFeed) {
            if (post.author.equals(author)) {
                post.upLikes();
                return;
            }
        }
        System.out.println("Didn't find post by " + author);
    }
    // Search for posts by a particular author and display them in reverse
    //chronological order (newest first).
    public void searchPosts(String author) {
        ArrayList<Post> foundPosts = new ArrayList<>();
        for (Post post : userFeed) {
            if (post.author.equals(author)) {
                foundPosts.add(post);
            }
        }
        for (Post post : foundPosts) {
            System.out.println(post.author + " posted \"" + post.content + "\" at " + post.timestamp + ", likes = " + post.likes);
        }
    }
}
// main class 
public class q6 {
    // main method or func 
    public static void main(String[] args) {
        // creatin posts
        Post p1 = new Post("Rauf", "My first day at uni");
        Post p2 = new Post("Ahsan", "My ecommerce journey");
        Post p3 = new Post("Rauf", "Java or Python");
        // creatin social media feeds
        SocialMediaFeed raufFeed = new SocialMediaFeed();
        SocialMediaFeed ahsanFeed = new SocialMediaFeed();
        // addin posts to feeds
        raufFeed.addPost(p1);
        raufFeed.addPost(p3);
        ahsanFeed.addPost(p2);
        // operations
        raufFeed.addLike("Rauf");
        ahsanFeed.addLike("Ahsan");
        System.out.println("Rauf's Feed:");
        raufFeed.display();
        System.out.println("\nAhsan's Feed:");
        ahsanFeed.display();
        System.out.println("\n my posts:");
        raufFeed.searchPosts("Rauf");
    }
}
