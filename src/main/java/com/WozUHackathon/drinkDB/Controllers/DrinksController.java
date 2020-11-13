package com.WozUHackathon.drinkDB.Controllers;

import com.WozUHackathon.drinkDB.Models.Drinks;
import com.WozUHackathon.drinkDB.Models.Ingredients;
import com.WozUHackathon.drinkDB.Services.DrinksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("")
public class DrinksController {

    @Autowired
    DrinksServiceImpl drinksServiceImpl;


    @GetMapping(value = {"/", "index","Page-1", "index.html"})
    public String getIndex(){
        return "index.html";
    }

//    @GetMapping("/DrinkoftheDay.html")
//    public Drinks getDrinkOftheDay(){
//        return drinksServiceImpl.getRandomDrink();
//    }

    @GetMapping("/random")
    public String randomDrink(Model model){
        model.addAttribute("drinks", drinksServiceImpl.getRandomDrink());
        return "random";
    }

    @PostMapping("/random")
    public String getRandomDrink(Model model){
        model.addAttribute("drinks", drinksServiceImpl.getRandomDrink());
        return "random";
    }

    @RequestMapping("/searchbyname")
    public String drinkByName(@RequestParam(value = "search", required = false) String search, Model model){
        Drinks drinks = drinksServiceImpl.getDrinksByName(search);
        model.addAttribute("drinks", drinks);
        //drinksServiceImpl.saveDrinks(drinks);
        return "searchbyname";
    }

    @GetMapping("/nameresults")
    public String getDrinkByName(String search, Model model){
        model.addAttribute("drinks", drinksServiceImpl.getDrinksByName(search));
        return "nameresults";
    }


//
//    @GetMapping("/searchbyname/{name}")
//    public Drinks getDrinkByName(@PathVariable String drink){
//        return drinksServiceImpl.getDrinksByName(drink);
//    }

    @GetMapping("/searchingredient")
    public String searchIngredients(@RequestParam(value = "search", required = false) String search, Model model){
        model.addAttribute("ingredients", drinksServiceImpl.getIngredient(search));
        return "searchingredient";
    }

    @GetMapping("/ingredientresult")
    public String getIngredient(String search, Model model){
        model.addAttribute("ingredients", drinksServiceImpl.getIngredient(search));
        return("ingredientresult");
    }


}
