package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetables;
import com.duing.config.FoodConfig;
import com.duing.config.VegetableConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
    @Autowired
    private FoodConfig foodConfig;



    @RequestMapping("/json")
    public Food json(){
        Food food=new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        return username+"--"+password;
    }





    @Autowired
    private VegetableConfig vegetableConfig;

    @RequestMapping("/veg")
    public Vegetables veg(){
        Vegetables vegetables=new Vegetables();
        vegetables.setEggplant(vegetableConfig.getEggplant());
        vegetables.setGreenpapper(vegetableConfig.getGreenpapper());
        vegetables.setPhoto(vegetableConfig.getPhoto());
        return vegetables;
    }
}
