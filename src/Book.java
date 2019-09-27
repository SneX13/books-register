import java.util.Date; // use for publication year

/**
 * A class to model a book in book register.
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
     * Set the title, author, publisher, publicationYear, pages and book identifier EAN-13 fields when this object
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

    /**
     * @return book title as String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return book author name as String
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return book publisher name as String
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * @return the year in which book has been published in YYYY format
     */
    public int getPublicationYear() {
        return this.publicationYear;
    }

    /**
     * @return number of pages in the book
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * @return book's barcode (EAN-13) / ISBN-13 as String
     */
    public String getBookIdentifier() {
        return this.bookIdentifier;
    }

    /**
     * @return boolean representing if book has been borrowed or is it available
     */
    public boolean isBorrowed() {
        return this.borrowed;
    }

    /**
     * A method that registers that book has been borrowed.
     */
    public void setBorrowed() {
        this.borrowed = true;
    }

}
