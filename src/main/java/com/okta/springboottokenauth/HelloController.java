package com.okta.springboottokenauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(java.security.Principal user) {
        if (user != null) {
            return "Hello " + user.getName();
        }
        else {
            return "Who are you?!";
        }
    }

}