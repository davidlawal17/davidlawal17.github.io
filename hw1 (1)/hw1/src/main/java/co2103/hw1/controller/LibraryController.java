package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Library;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import static co2103.hw1.Hw1Application.libraries;

@Controller
public class LibraryController {

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(new LibraryValidator());
    }


    @GetMapping("/libraries")
    public String libraries(Model model) {

        model.addAttribute("libraries", libraries);
        return "libraries/list";
    }

    @RequestMapping("/newLibrary")
    public String newLibrary(Model model){
        model.addAttribute("library", new Library());
        return "libraries/form";
    }

    @PostMapping("/addLibrary")
    public String addLibrary(@Valid @ModelAttribute Library library, BindingResult results){

        if(results.hasErrors()){
            return "libraries/form";
        }
        libraries.add(library);
        return "redirect:/libraries";
    }

}
