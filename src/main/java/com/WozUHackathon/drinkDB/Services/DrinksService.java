package com.WozUHackathon.drinkDB.Services;

import com.WozUHackathon.drinkDB.Models.Drinks;
import com.WozUHackathon.drinkDB.Models.Ingredients;

public interface DrinksService {

    Drinks getDrinksByName(String name);

    Drinks getRandomDrink();

    Ingredients getIngredient(String ingredient);

    void saveDrinks(Drinks drink);

}
