
public class Book {
    private String title;
    private String author;

    // Constructor 1: Only title
    public Book(String title) {
        this.title = title;
        this.author = null; // author remains unset
    }

    // Constructor 2: Title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not specified");
        }
    }
}

