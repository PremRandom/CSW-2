// Abstract LibraryResource class
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Abstract method to be implemented in subclasses
    public abstract void displayDetails();
}

// Book subclass
class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pageCount);
    }
}

// Magazine subclass
class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + ", Issue Date: " + issueDate);
    }
}

// DVD subclass
class DVD extends LibraryResource {
    private double duration; // Duration in hours

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " by " + getAuthor() + ", Duration: " + duration + " hours");
    }
}

// Main class
public class A1Q7 {
    public static void main(String[] args) {
        // Creating objects of different library resources
        LibraryResource book = new Book("Java Programming", "James Gosling", 500);
        LibraryResource magazine = new Magazine("Tech Today", "John Doe", "Feb 2025");
        LibraryResource dvd = new DVD("AI Revolution", "Jane Smith", 2.5);

        // Displaying details
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
