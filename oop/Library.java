import java.util.Arrays;
public class Library {

    /*
    FIELDS
    ======
    Books - list of all the books
    count of books - number of books in the library (Books - rentals)
    rentals - list of books that have been rented out
    librarian on duty - someone's name
    */
    String[] books;
    int booksInLibrary;
    String[] rentedBooks;
    String onDuty;

    // ====== CONSTRUCTOR ======== //
    Library(String[] books, int booksInLibrary, String[] rentedBooks, String onDuty) {
        // FILL IN
    }

    /*
        check if the bookTitle exists in books
        If it does, add it to rentedBooks
        Update booksInLibrary to match
        If no book found, do nothing
     */
    void rentBook(String bookTitle) {

    }

    /*
        check if bookTitle exists in books (if it doesn't then the book doesn't belong to this lib)
        If it does, remove it from rentedBooks
        Update booksInLibrary to match
     */
    void returnBook(String bookTitle) {

    }

    // Change the name of the librarian on duty (this.onDuty) to newLibrarian
    void changeShift(String newLibrarian) {

    }

    public static void main(String[] args) {
        String[] books = {"To Kill a Mockingbird", "The Alchemist", "Purple Hibiscus", "Steve Jobs", "Americanah"};
        String[] rented = {};

        Library myLib = new Library(books, books.length, rented, "Mary Poppins");

        // Rent a Book
        myLib.rentBook("Steve Jobs");
        System.out.println(Arrays.toString(myLib.books)); // import array utils for this
        System.out.println(myLib.booksInLibrary);
        System.out.println(Arrays.toString(myLib.rentedBooks));

        // Return a Book
        myLib.returnBook("Steve Jobs");
        System.out.println(Arrays.toString(myLib.books)); // import array utils for this
        System.out.println(myLib.booksInLibrary);
        System.out.println(Arrays.toString(myLib.rentedBooks));

        // Change Librarian
        myLib.changeShift("Tevin");
        System.out.println(myLib.onDuty);
    }
}
