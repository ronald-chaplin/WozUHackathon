package com.WozUHackathon.drinkDB.Services;

import com.WozUHackathon.drinkDB.Models.Drinks;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DrinksServiceImpl implements DrinksService{

    @Override
    public Drinks getDrinks(String drink) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita", Drinks.class);
    }

    @Override
    public Drinks getRandomDrink() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://www.thecocktaildb.com/api/json/v1/1/random.php", Drinks.class);
    }
}
