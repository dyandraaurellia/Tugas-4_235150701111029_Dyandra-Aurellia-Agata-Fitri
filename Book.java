package Interface;

public class Book {
    private String title;
    private String author;
    private int year;
    protected boolean borrowed;

    public Book (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed(){
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowedInput) {
        this.borrowed = borrowedInput;
    }

    public void displayInfo(){
        System.out.println("Title\t: " + getTitle());
        System.out.println("Author\t: " + getAuthor());
        System.out.println("Year\t: " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
    }
}
