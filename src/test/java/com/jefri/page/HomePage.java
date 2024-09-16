package com.jefri.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By productTitle = By.xpath("//span[@class='title']");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement textProduct = driver.findElement(productTitle);
        assertTrue(textProduct.isDisplayed());
        assertEquals("Products", textProduct.getText());
    }
}
