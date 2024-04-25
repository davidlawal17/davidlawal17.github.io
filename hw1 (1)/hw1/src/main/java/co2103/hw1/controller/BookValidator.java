package co2103.hw1.controller;

import co2103.hw1.domain.Book;
import co2103.hw1.domain.Library;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class BookValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Book.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Book y = (Book) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "", " Your book needs a title");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author", "", " Your book needs an author");


        if (!(y.getGenre().equals("Sport") || y.getGenre().equals("History") || y.getGenre().equals("Biography")))  {
           errors.rejectValue("genre", "","Genre has to be either Sport, History or Biography");
       }

        if (y.getAmount()< 5 || y.getAmount() > 8) {
            errors.rejectValue("amount", "", "Amount needs to be between 5 and 8 ");
        }
    }

}
