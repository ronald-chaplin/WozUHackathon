package com.WozUHackathon.drinkDB.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Drinks {


    @JsonProperty("drinks")
    private List<Drink> drinks;

    public Drinks(){};

}
