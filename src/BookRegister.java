import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class represents a book register which can add a book, delete a book,
 * search for a book based on title, author and EAN code.
 */
public class BookRegister {

    private ArrayList<Book> books;

    /**
     * todo: consider using HashMap
     */
    public BookRegister() {
        this.books = new ArrayList<>();
    }

    /**
     * @param book
     */
    public void addBook(Book book) {
        this.books.add(book);
    }

    /**
     * A method that fills the book registry with a number of books
     */
    public void fillBookRegisterWithBooks() {
        this.addBook(new Book("Title1", "WriterName WriteSurname", "NTNU", 2010, 123, "EAN1234567890123"));
        this.addBook(new Book("Title2", "Writer1", "NTNU", 2019, 1234, "EAN1234567890123"));
        this.addBook(new Book("Title2", "Writer2", "NTNU", 2018, 12355, "EAN1234567890123"));
        this.addBook(new Book("Title3", "Writer2", "NTNU", 2017, 123678, "EAN1234567890123"));
        this.addBook(new Book("Title4", "Writer3", "NTNU", 2016, 123, "EAN1234567890123"));
        this.addBook(new Book("Title5", "WriterName WriteSurname", "NTNU", 2006, 12366, "EAN3334567890123"));
    }

    /**
     * todo: use trim to clean input string
     * Find book with the title given by the parameter.
     * A method searches for the first book with a given title. If no book is found null is returned.
     *
     * @return found book
     */
    public Book findBookByTitle(String title) {
        Book foundBook = null;

        boolean searching = true;

        Iterator<Book> it = this.books.iterator();

        while (it.hasNext() && searching) {
            Book book = it.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBook = book;
                searching = false;
            }
        }
        return foundBook;
    }

    /**
     * todo: use trim to clean input string
     * Find all books by a given author.
     *
     * @return collection of books written by the author
     */
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();

        for (Book book : this.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    /**
     * A method to iterate over the books in the book register.
     *
     * @return Iterator for book register
     */
    public Iterator<Book> getIterator() {
        return books.iterator();
    }

    /**
     * @param bookId
     * @return Book
     */
    public Book findBookByEAN(String bookId) {
        Book foundBook = null;

        return foundBook;
    }

    public void removeBook(Book book) {
        //Todo
    }

}
