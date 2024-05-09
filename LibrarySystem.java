package Interface;

public class LibrarySystem {
    public static void main(String[] args) {
        Textbook textbook = new Textbook("Java Programming", "John Smith", 2020 , "Programming");
        Novel novel = new Novel("Harry Potter", "J. K. Rowling", 1997, "Fiction");
        Magazine magazine = new Magazine(" The Atlantic", "Amanda Mull", 2021, "Politics");

        System.out.println("----- Book Information -----");
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        System.out.println("----- Borrowing and Returning Books -----");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook();
    }
}