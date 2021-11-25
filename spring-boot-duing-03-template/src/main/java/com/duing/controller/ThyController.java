package com.duing.controller;

import com.duing.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ThyController {

    @RequestMapping("/thy")
    public String thy(Model model){
        Person person=new Person();
        model.addAttribute("name","<h1>张三</h1>");
        model.addAttribute("password",person.getPassword());

        model.addAttribute("person",person);

        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
       return "/thymeleaf/welcome";
    }
}
