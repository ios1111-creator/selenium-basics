package com.chromatech.atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // Handling check box with unique attribute
        // driver.findElement(By.xpath("//input[@value='option1']")).click();
        // driver.findElement(By.xpath("//input[@value='option3']")).click();

        // Handling check box with non-unique attribute
        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

    }
}
