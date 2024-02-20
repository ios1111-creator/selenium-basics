package com.chromatech.atutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetCurrentUrl {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://mexil.it/chroma/site/userlogin";

        driver.get(url);

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
    }
}
