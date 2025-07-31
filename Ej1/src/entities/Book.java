
package entities;

public class Book {
    
    private int ISBN;
    private String title;
    private String author;
    private int pages;

    public Book() {
    }

    public Book(int ISBN, String title, String author, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
