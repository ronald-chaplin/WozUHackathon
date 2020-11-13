package com.WozUHackathon.drinkDB.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Ingredients {

    @JsonProperty("ingredients")
    private List<String> attributes;

    public Ingredients(){}

    public List<String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "ingredients{" +
                "attributes=" + attributes +
                '}';
    }
}
