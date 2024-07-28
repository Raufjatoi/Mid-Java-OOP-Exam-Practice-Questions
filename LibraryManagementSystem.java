import java.util.ArrayList;
import java.util.List;

// Abstract class LibraryItem
abstract class LibraryItem {
    private String title;
    private String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    // Abstract method
    public abstract void displayInfo();
}

// Book class extending LibraryItem
class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, String id, String author, String genre) {
        super(title, id);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("ID: " + getId());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
    }
}

// Magazine class extending LibraryItem
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("ID: " + getId());
        System.out.println("Issue Number: " + getIssueNumber());
    }
}

// Member class
class Member {
    private String memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String memberId) {
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public void displayInfo() {
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Borrowed Items:");
        for (LibraryItem item : borrowedItems) {
            item.displayInfo();
        }
    }
}

// Abstract Staff class
abstract class Staff {
    private String staffId;
    private String role;

    public Staff(String staffId, String role) {
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getRole() {
        return role;
    }

    public abstract void performDuty();
}

// Librarian class extending Staff
class Librarian extends Staff {
    private String section;

    public Librarian(String staffId, String section) {
        super(staffId, "Librarian");
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    @Override
    public void performDuty() {
        System.out.println("Managing library section: " + getSection());
    }
}

// Main class to demonstrate the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of Book, Magazine, Member, and Librarian
        Book book = new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald", "Fiction");
        Magazine magazine = new Magazine("National Geographic", "M001", 2024);
        Member member = new Member("M1001");
        Librarian librarian = new Librarian("S2001", "Fiction");

        // Member borrows items
        member.borrowItem(book);
        member.borrowItem(magazine);

        // Display member info
        member.displayInfo();

        // Display item info
        book.displayInfo();
        magazine.displayInfo();

        // Librarian performs duty
        librarian.performDuty();
    }
}
