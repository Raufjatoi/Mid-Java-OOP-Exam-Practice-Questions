import java.util.ArrayList;
import java.util.Scanner;

class Book {
    // Attributes
    int bookId;
    String bookName;
    boolean available;

    // Constructor
    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.available = true;
    }

    // Getters
    public String getName() {
        return bookName;
    }

    public int getId() {
        return bookId;
    }

    // Toggle availability
    public void toggleAvailability() {
        this.available = !this.available;
    }
}

class Library {
    static ArrayList<Book> bookList;

    // Constructor
    public Library() {
        this.bookList = new ArrayList<>();
    }

    // Methods
    public static void add(Book b) {
        for (Book book : bookList) {
            if (book.getName().equals(b.getName())) {
                System.out.println("A book with this name already exists in the list.");
                return;
            }
        }
        bookList.add(b);
        System.out.println("Book added to the list.");
    }

    public static void remove(Book b) {
        boolean removed = false;
        for (Book book : bookList) {
            if (book.getId() == b.getId()) {
                bookList.remove(book);
                removed = true;
                System.out.println("Removed the book from the list.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Book not found in the list.");
        }
    }

    public static void display() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).getId() + " : " + bookList.get(i).getName());
        }
    }
}

public class booklib {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\tBooks Library");
            System.out.print("1: Add book, 2: Remove book, 3: Display books, 4: Exit: ");
            int op = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (op == 1) {
                System.out.println("\t\tADD A BOOK");
                System.out.print("Name of book: ");
                String name = scanner.nextLine();
                System.out.print("ID of book: ");
                int id = scanner.nextInt();
                Book book1 = new Book(id, name);
                Library.add(book1);

            } else if (op == 2) {
                System.out.println("\t\tREMOVE A BOOK");
                System.out.print("Name of book: ");
                String name = scanner.nextLine();
                System.out.print("ID of book: ");
                int id = scanner.nextInt();
                Book book2 = new Book(id, name);
                Library.remove(book2);

            } else if (op == 3) {
                System.out.println("\t\tDISPLAY BOOKS");
                Library.display();

            } else if (op == 4) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
