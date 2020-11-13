package com.WozUHackathon.drinkDB.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


public class Drinks {


    @JsonProperty("drinks")
    private List<Drink> drinks;

    public Drinks(){};

    @Override
    public String toString() {
        return "{" + drinks +'}';
    }

    public int size(){
        return drinks.size();
    }

    public Drink get(int i){
        return drinks.get(i);
    }
}
