package com.chromatech.atutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) {
        // System.out.println("I am a cool tester");
        //Using Edge browser
        // WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mexil.it/chroma/site/userlogin");
    }
}
