package org.epam.aqa.ht5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final String SEARCH_INPUT = "*";
    private static final String SEARCH_BUTTON = "*";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void homePage(String link) {
        driver.get(link);
    }

    public void searchByKeyword(final String keyWord) {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyWord);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }
}
