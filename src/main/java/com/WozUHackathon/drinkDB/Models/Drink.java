package com.WozUHackathon.drinkDB.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name="Drinks")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Drink {



    @Id
    @Column(name = "drink_id")
    @JsonProperty("idDrink")
    private String idDrink;
    @Column(name = "drink")
    @JsonProperty("strDrink")
    private String strDrink;
    @JsonProperty("strDrinkAlternate")
    private String strDrinkAlternate;
    @Column(name="category",nullable = true)
    @JsonProperty("strCategory")
    private String strCategory;
    @Column(name="alcoholic",nullable = true)
    @JsonProperty("strAlcoholic")
    private String strAlcoholic;
    @Column(name="glass",nullable = true)
    @JsonProperty("strGlass")
    private String strGlass;
    @JsonProperty("StrInstructions")
    private String strInstructions;
    @Column(name="drink_thumb",nullable = true)
    @JsonProperty("strDrinkThumb")
    private String strDrinkThumb;
    @Column(name="ingredient_a",nullable = true)
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @Column(name="ingredient_b",nullable = true)
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @Column(name="ingredient_c",nullable = true)
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @Column(name="ingredient_d",nullable = true)
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @Column(name="ingredient_e",nullable = true)
    @JsonProperty("strIngredient5")
    private String strIngredient5;
    @Column(name="ingredient_f",nullable = true)
    @JsonProperty("strIngredient6")
    private String strIngredient6;
    @Column(name="ingredient_g",nullable = true)
    @JsonProperty("strIngredient7")
    private String strIngredient7;
    @Column(name="ingredient_h",nullable = true)
    @JsonProperty("strIngredient8")
    private String strIngredient8;
    @Column(name="ingredient_i",nullable = true)
    @JsonProperty("strIngredient9")
    private String strIngredient9;
    @Column(name="ingredient_j",nullable = true)
    @JsonProperty("strIngredient10")
    private String strIngredient10;
    @Column(name="ingredient_k",nullable = true)
    @JsonProperty("strIngredient11")
    private String strIngredient11;
    @Column(name="ingredient_l",nullable = true)
    @JsonProperty("strIngredient12")
    private String strIngredient12;
    @Column(name="ingredient_m",nullable = true)
    @JsonProperty("strIngredient13")
    private String strIngredient13;
    @Column(name="ingredient_n",nullable = true)
    @JsonProperty("strIngredient14")
    private String strIngredient14;
    @Column(name="ingredient_o",nullable = true)
    @JsonProperty("strIngredient15")
    private String strIngredient15;
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @JsonProperty("strMeasure4")
    private String strMeasure4;
    @JsonProperty("strMeasure5")
    private String strMeasure5;
    @JsonProperty("strMeasure6")
    private String strMeasure6;
    @JsonProperty("strMeasure7")
    private String strMeasure7;
    @JsonProperty("strMeasure8")
    private String strMeasure8;
    @JsonProperty("strMeasure9")
    private String strMeasure9;
    @JsonProperty("strMeasure10")
    private String strMeasure10;
    @JsonProperty("strMeasure11")
    private String strMeasure11;
    @JsonProperty("strMeasure12")
    private String strMeasure12;
    @JsonProperty("strMeasure13")
    private String strMeasure13;
    @JsonProperty("strMeasure14")
    private String strMeasure14;
    @JsonProperty("strMeasure15")
    private String strMeasure15;
    @Column(name="date_modified")
    @JsonProperty("dateModified")
    private String dateModified;

    //private List<String> attributes = new ArrayList<>();

    public Drink(){}

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    public void setStrDrinkAlternate(String strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6() {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7() {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8() {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9() {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10() {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11() {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12() {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13() {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14() {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15() {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public String toString() {
        List<String>attributes = new ArrayList<>();
        Collections.addAll(attributes, strDrink, strDrinkAlternate,strCategory, strAlcoholic, strGlass, strInstructions,
                strDrinkThumb, strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5,
                strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11,
                strIngredient12, strIngredient13, strIngredient14, strIngredient15, strMeasure1, strMeasure2,
                strMeasure3, strMeasure4, strMeasure5, strMeasure6, strMeasure7, strMeasure8, strMeasure9,
                strMeasure10, strMeasure11, strMeasure12, strMeasure13, strMeasure14, strMeasure15);
        List<String>temp = new ArrayList<>();
        for(String string : attributes){
            if(string != null){
                temp.add(string+"\n"); //not sure why but this removes the instructions even though they are not null
            }
        }
        return temp.toString();
    }
}