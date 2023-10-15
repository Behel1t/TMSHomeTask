package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;
   @GetMapping
    public String homePage(@RequestHeader(name = "myKeyHeader",required = false) String myHeader){

       return "home";
    }
    @PostMapping
    public String addUser(User user) throws UserNameEmptyException {
       userService.save(user);
        return "home";
    }

}
