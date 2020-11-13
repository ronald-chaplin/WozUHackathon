package com.WozUHackathon.drinkDB.Services;


import com.WozUHackathon.drinkDB.Models.Drink;
import com.WozUHackathon.drinkDB.Models.Drinks;
import com.WozUHackathon.drinkDB.Models.Ingredients;
import com.WozUHackathon.drinkDB.Repositories.DrinksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DrinksServiceImpl implements DrinksService{

    @Autowired
    DrinksRepo drinksRepo;

//    @Autowired
//    IngredientRepo ingredientsRepo;

    @Override
    public Drinks getDrinksByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/search.php?s="+name, Drinks.class);
    }

    @Override
    public Drinks getRandomDrink() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/random.php", Drinks.class);
    }

    @Override
    public Ingredients getIngredient(String name){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/search.php?i="+name, Ingredients.class);
    }

    @Override
    public void saveDrinks(Drinks drinks){
        for(int i = 0; i < drinks.size(); i++)
        {
            drinksRepo.save(drinks.get(i));
        }
    }
}
