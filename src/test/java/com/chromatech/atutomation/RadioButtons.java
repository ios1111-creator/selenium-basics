package com.chromatech.atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // Handling radio button with unique attribute
        // driver.findElement(By.xpath("//input[@value ='radio1']")).click();

        // Handling radio button with non unique attribute
        driver.findElement(By.xpath("(//input[@name = 'radioButton'])[2]")).click();
        ;
    }
}
