public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) { //tworzy i zwraca obiekt of
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println("Autorem książki " + book.title + " jest " + book.author);
    }
}
