package Interface;

interface LibraryItem {
    void borrowBook();
    void returnBook();
    boolean isBorrowed();
    void displayInfo();
}

class Textbook extends Book implements IBookOperations {
    private String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Textbook: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Textbook: " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Textbook: " + getTitle()+ " returned successfully.");
        } else {
            System.out.println("Textbook: " + getTitle() + " is not borrowed.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Borrowed: " + borrowed);
        System.out.println("Subject : " + this.subject);
        System.out.println();
    }
}

class Novel extends Book implements IBookOperations {
    private String genre;
    
    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Novel: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Novel: " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Novel: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Novel: " + getTitle() + " is not borrowed.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Borrowed: " + borrowed);
        System.out.println("Genre : " + this.genre);
        System.out.println();
    }
}

class Magazine extends Book implements IBookOperations {
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public String category() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Magazine: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine: " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            System.out.println("Magazine: " + getTitle() + " was not returned.");
        } else {
            borrowed = false;
            System.out.println("Magazine: " + getTitle() + " has been returned.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Category : " + this.category);
        System.out.println();
    }
}