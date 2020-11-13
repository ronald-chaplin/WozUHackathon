package com.WozUHackathon.drinkDB.Repositories;

import com.WozUHackathon.drinkDB.Models.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksRepo extends CrudRepository<Drink, String> {
}
