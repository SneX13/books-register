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