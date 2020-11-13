package com.WozUHackathon.drinkDB;

import com.WozUHackathon.drinkDB.Models.Drinks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DrinkDbApplicationTest {

        WebDriver driver;
        WebElement click;
        Drinks drinks;

        @BeforeClass
        void setUp(){
            System.setProperty("webdriver.chrome.driver", "d:/selenium/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://drinkdbhackathon.herokuapp.com/");
        }

        @Test(priority = 1)
        void testLoad(){
            assertEquals("https://drinkdbhackathon.herokuapp.com/", driver.getCurrentUrl());
        }

        @Test(priority = 2)
        void testRandom(){
            click = driver.findElement(By.xpath("/html/body/div/a[1]"));
            click.click();
            assertEquals("https://drinkdbhackathon.herokuapp.com/random", driver.getCurrentUrl());
        }

        @Test(priority = 3)
        void testNameSearchLoad(){
            driver.navigate().back();
            click = driver.findElement(By.xpath("/html/body/div[1]/a[2]"));
            click.click();
            assertEquals("https://drinkdbhackathon.herokuapp.com/searchbyname", driver.getCurrentUrl());
        }
    }

