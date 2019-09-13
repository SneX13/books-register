import java.util.Date; // use for publication year

/**
 * The Book class represents a book.
 */
public class Book {

    // The fields.
    private String title;
    private String author;
    private String publisher;
    private int publicationYear; // type Date?
    private int pages; //has to be larger then 0 ?
    private String bookIdentifier; // EAN-13 - ISBN-13 - should this be unique? create check method
    private boolean borrowed;

    /**
     * Set the fields title, author, publisher, publicationYear, pages and book identifier EAN-13 when this object
     * is constructed.
     */
    public Book(String bookTitle, String bookAuthor, String bookPublisher, int bookPublicationYear, int bookPages, String ean13) {
        title = bookTitle;
        author = bookAuthor;
        publisher = bookPublisher;
        publicationYear = bookPublicationYear;
        pages = bookPages;
        bookIdentifier = ean13;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public int getPages() {
        return this.pages;
    }

    public String getBookIdentifier() {
        return this.bookIdentifier;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed() {
        this.borrowed = true;
    }

}
