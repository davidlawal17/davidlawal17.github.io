package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Library;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LibraryValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Library.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
         Library a = (Library) target;
         for(Library ex : Hw1Application.libraries) {
             if(ex.getId() == a.getId()) {
                 errors.rejectValue("id","", "Id already in use");
             }
         }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "president", "", " Your Library needs a President");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "website", "", " Your Library needs a Website");


    }

}
