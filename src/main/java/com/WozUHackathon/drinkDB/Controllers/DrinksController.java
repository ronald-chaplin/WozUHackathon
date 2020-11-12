package com.WozUHackathon.drinkDB.Controllers;

import com.WozUHackathon.drinkDB.Models.Drinks;
import com.WozUHackathon.drinkDB.Services.DrinksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/", "index","page-1"})
public class DrinksController {

    @Autowired
    DrinksServiceImpl drinksServiceImpl;

    @GetMapping("/drinkoftheday")
    public Drinks getDrinkOftheDay(){
        return drinksServiceImpl.getRandomDrink();
    }


}
