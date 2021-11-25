package com.duing.controller;

import com.duing.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class FtlController {


    @RequestMapping("/ftl")
    public String ftl(Model model){
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }



}
