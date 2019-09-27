import java.util.Iterator;
import java.util.ArrayList;

/**
 * Represents the main starting class of the BookRegister application.
 * @author Snezana
 * @version 0.1
 */
public class BookRegisterApp
{
    private BookRegister bookRegister;

    public void init()
    {
        bookRegister = new BookRegister();
        bookRegister.fillBookRegisterWithBooks();
    }

    public void listAllBooks() {
        Iterator<Book> it = bookRegister.getIterator();

        System.out.println("Book register holds following books: ");

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("" + book.getTitle() + " " + book.getAuthor() + " " +
                    book.getPublisher() + " " + book.getPublicationYear() + " " +
                    book.getPages() + " " + book.getBookIdentifier());
            System.out.println("###############################################");
        }
    }
}
