package co2103.hw1.domain;
import java.util.List;

public class Library {
    private int id;
    private String president;
    private String website;
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPresident(String president) {

        this.president = president;
    }
    public String getPresident() {
        return president;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Book> getBooks() {

        return books;
    }

    public void setBooks(List<Book> books) {

        this.books = books;
    }

}
