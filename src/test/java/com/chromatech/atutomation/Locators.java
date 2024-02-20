package com.chromatech.atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://mexil.it/chroma/site/userlogin";

        driver.get(url);

        WebElement userNameTextBox = driver.findElement(By.id("email"));
        userNameTextBox.sendKeys("general@teacher.com");

        // Locating using name() locator/method
        // WebElement passwordTextBox = driver.findElement(By.name("password"));
        // passwordTextBox.sendKeys("123456");

        // Locating using className() locator/method
        // WebElement passwordTextBox = driver.findElement(By.className("form-password
        // form-control"));
        // passwordTextBox.sendKeys("123456");

        // Locating using tagName() locator/method
        // driver.findElement(By.tagName("input"))..sendKeys("123456");

        // Locating using linkText() locator/method
        // driver.findElement(By.linkText("Forgot Password")).click();

        // Locating using partialLinkText() locator/method
        // driver.findElement(By.partialLinkText("Forgot Passwo")).click();

        // Locating using cssSelector() locator/method #attributeValueOfID
        // driver.findElement(By.cssSelector("#password")).sendKeys("12121");

        // Locating using cssSelector() locator/method "[class = "attributeValue"]"
        // driver.findElement(By.cssSelector("[class = 'form-password
        // form-control']")).sendKeys("123");

        // Locating using full xpath() locator/method
        // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("123");

        // Locating using xpath()
        // driver.findElement(By.xpath("//*[@id='password']")).sendKeys("args");

        // Locating using relative xpath()
        driver.findElement(By.xpath("//input[@class = 'form-password form-control']")).sendKeys("123456");

        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    }
}
