package com.chromatech.atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
        // Initializing dropDown with WebElement
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        // Creating object of select class and passing dropdown as an argument ro
        // select() constructor
        Select select = new Select(dropDown);

        // Select option by visible text
        // select.selectByVisibleText("Option2");

        // Select option by Index
        // select.selectByIndex(3);

        // Select option by value
        select.selectByValue("option2");
    }
}
