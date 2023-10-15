package org.example.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(UserNameEmptyException.class)
    public String processError(UserNameEmptyException exc){
        System.out.println("Get Error "+exc.getUser);
        return "error";
    }
}
