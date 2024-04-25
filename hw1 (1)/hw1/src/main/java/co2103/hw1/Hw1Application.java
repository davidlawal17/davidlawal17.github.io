package co2103.hw1;

import co2103.hw1.domain.Book;
import co2103.hw1.domain.Library;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
    public static List<Library> libraries;


    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args){
        Book book1 = new Book();
        book1.setTitle("Mice and Men");
        book1.setAuthor("JKRowley");
        book1.setGenre("Adventure");
        book1.setAmount(1);

        Book book2 = new Book();
        book2.setTitle("Happy Rush");
        book2.setAuthor("JKRowley");
        book2.setGenre("Action");
        book2.setAmount(1);

        libraries = new ArrayList<>();
        Library a = new Library();
        a.setId(1);
        a.setPresident("Obama");
        a.setWebsite("www.Obama_library.com");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        a.setBooks(books);



        libraries.add(a);




    }
}