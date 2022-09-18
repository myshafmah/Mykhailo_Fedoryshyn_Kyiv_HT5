package org.epam.aqa.ht5.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    
}
