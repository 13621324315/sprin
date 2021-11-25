package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class GuestController {

    @Autowired
    private GuestService service;


    /**
     * 查询所有Guest
     */
    @RequestMapping("/GuestList")
    public String GuestList(Model model){
        //调用service
        List<Guest> list=service.list();
        model.addAttribute("list",list);
        return "/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/GuestList";
    }


    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name,Model model){
        System.out.println(name);
        //调用service 查询个人信息表
        Guest guest=service.selectOne(name);
        model.addAttribute("guest",guest);
        System.out.println(guest.getName());
        return "/toUpdate";
    }

    @RequestMapping("/update")
    public String update(Guest guest){

        service.update(guest);
        return "redirect:/GuestList";
    }

    @RequestMapping("/delete")
    public String delete(String name){
        service.delete(name);
        return "redirect:/GuestList";
    }



}
