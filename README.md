# Programing Project Case

In the project you will create a solution that can be used by the library at NTNU. In other words, you should develop a register of books. The project will be developed step by step in each submission later in the semester. In the last submission we will put on a text-based user interface so that we get a complete application.

When the project is complete it should be possible to do the following with your application (requirement specification):

* It should be possible for the user to submit new books
* Books should contain the following information:
    - Tittle
    - Author
    - Publisher
    - Year published
    - Number of page
    - Barcode (EAN-13)
    - Whether the book is on loan or not
* The user should be able to search the registry for
    - Title
    - Author
    - barcode
* User should be able to delete a particular book
* User should be able to print on screen full list of books in the registry

### Step 1 - Create a book class
Create a brand new project in BlueJ (or the IDE you are using).
Create a class to represent a Book.
Create required accessor and mutator methods. Do not create more mutator methods than you think is needed. Reflects on what information about a book can change.

### Step 2 - Book Register
Create your own class to represent the actual book register in your application.
Then do the following:
- Create a method in the registry class that fills the registry with 4-5 books (useful feature to later test the class so you don't have to load books every time you test).
- Create a method that can be used to add a book to the registry.
- Create a method that prints all the books of the console. Keep in mind that the printout should look clear.

### Step 3 - search function
The following will be implemented:

- Create a new method for printing all books in the library, but now using iterator and while loop. Call the method listAllBooks2() or similar.
- Create a method that searches for the first book with a given title. The method should return the found book. If no book is found that matches the title being searched for, null should be returned.
- Create a method that searches all books by a given author. The method should return a collection of all books written by the author it is searched for.
- Create a method that returns an Iterator <> object that other objects can use to iterate over the books in the library (will be used by the UI class).

### Step 4 - user interface
Create a whole new class, which in future will be developed to become the user interface of the application. Call the class e.g. BookLibraryApp.

Create the following methods in this class:

- public void init()  
    - This method should be called at the start of the application. The method should create an object from book register 
    and fill the register with a number of books.
- public void listAllBooks() 
    - The method should, using the iterator object from the book register, print out all books in the registry. (*Here you 
    can move the code from book register class to this method so that everything related to UI is in the BookLibraryApp 
    class and not in the book register or book class. Think how do you want to present the list of books to the user. In 
    table form? Like a long list? With or without an introductory text? Should you inform the user about how many books 
    there are in the library etc?*)



