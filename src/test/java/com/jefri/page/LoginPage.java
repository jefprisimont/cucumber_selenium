package com.jefri.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    By usernameInput =By.id("user-name");
    By passwordInput =By.id("password");
    By loginButton =By.id("login-button");

    // Actions
    public void goToLoginPage() {
driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


}
