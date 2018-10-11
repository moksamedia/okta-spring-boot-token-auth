package com.okta.springboottokenauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home(java.security.Principal user) {
        if (user != null) {
            return "Hello " + user.getName();
        }
        else {
            return "Who are you?!";
        }
    }

}