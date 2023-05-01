package PracticalWeek1;
/*
Create the following instance methods for the Library class:
addBooks - takes a list of book titles (strings)
and adds each title to the ArrayList of available books

borrowBook - takes a book title (string)
and moves it from the available ArrayList to the
ArrayList of books on loan

returnBook - takes a book title (string)
and moves it from the ArrayList of books on loan to the
ArrayList of available books
*/

import java.util.ArrayList;
import java.util.List;

//add class definitions below this line

class Library {
    ArrayList<String> available;
    ArrayList<String> onLoan;

    Library() {
        available = new ArrayList<String>();
        onLoan = new ArrayList<String>();
    }

    void addBooks(String[] booksToAdd){
        this.available.addAll(List.of(booksToAdd));
    }

    void borrowBook(String bookToRemove){
        this.available.remove(bookToRemove);
        this.onLoan.add(bookToRemove);
    }

    void returnBook(String bookToAdd){
        this.onLoan.remove(bookToAdd);
        this.available.add(bookToAdd);
    }
}
//add class definitions above this line

