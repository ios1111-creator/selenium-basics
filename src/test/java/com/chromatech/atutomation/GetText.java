package com.chromatech.atutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://mexil.it/chroma/site/userlogin";
        driver.get(url);

        WebElement signInButtonText = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
        System.out.println("Text of sign in button is: " + signInButtonText.getText());

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password"));
        System.out.println("Text of forgot password is: " + forgotPassword.getText());
    }
}
