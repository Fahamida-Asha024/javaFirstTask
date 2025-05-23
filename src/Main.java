public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984"); // Only title
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee"); // Title and author

        book1.displayInfo();
        System.out.println("---");
        book2.displayInfo();
    }
}
