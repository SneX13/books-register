import java.util.ArrayList;

/**
 * A class represents a book register which can add a book, delete a book,
 * search for a book based on title, author and EAN code.
 */
public class BookRegister {

    private ArrayList<Book> books;

    public BookRegister() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void fillBookRegisterWithBooks() {
        this.books.add(new Book("Title1", "Writer", "NTNU", 2010, 123, "EAN1234567890123"));
        this.books.add(new Book("Title2", "Writer", "NTNU", 2019, 1234, "EAN1234567890123"));
        this.books.add(new Book("Title2", "Writer", "NTNU", 2018, 12355, "EAN1234567890123"));
        this.books.add(new Book("Title3", "Writer", "NTNU", 2017, 123678, "EAN1234567890123"));
        this.books.add(new Book("Title4", "Writer", "NTNU", 2016, 123, "EAN1234567890123"));

    }

    public void listAllBooks() {
        System.out.println("Book register holds following books: ");

        for (Book book : this.books) {
            System.out.println("" + book.getTitle() + " " + book.getAuthor() + " " +
                    book.getPublisher() + " " + book.getPublicationYear() + " " +
                    book.getPages() + " " + book.getBookIdentifier());
            System.out.println("###############################################");
        }
    }

}
