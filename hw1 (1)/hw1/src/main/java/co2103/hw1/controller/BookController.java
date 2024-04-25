package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Book;
import co2103.hw1.domain.Library;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static co2103.hw1.Hw1Application.libraries;

@Controller
public class BookController {


    @GetMapping("/books")
    public String books(@RequestParam int library, Model model) {
        model.addAttribute("library", library);
        for (Library i : libraries) {
            if (i.getId() == library) {
                model.addAttribute("books", i.getBooks());
            }

        }
        return "books/list";
    }

    @RequestMapping("/newBook")
    public String newBook(@RequestParam int library, Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("library", library);
        return "books/form";
    }

    @PostMapping("/addBook")
    public String addBook(@Valid @ModelAttribute Book book, BindingResult results,@RequestParam int library, Model model) {
        model.addAttribute("library",library);
        if (results.hasErrors()){
            return "books/form";
        }
        for (Library i : libraries) {
            if (i.getId() == library) {
                model.addAttribute("books", i.getBooks());
            }

            i.getBooks().add(book);

        }
        return "redirect:/libraries";

    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {binder.addValidators(new BookValidator());}
}
