package com.WozUHackathon.drinkDB.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Drinks {


    @JsonProperty("drinks")
    private List<Drink> drinks;

    public Drinks(){};

}
