package org.epam.aqa.ht5.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultPage extends BasePage {
    private static final String SEARCH_KEYWORD = "product";
    private static final String EXPECTED_QUERY = "query=product";

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void checkThatUrlContainsSearchKeyword() {
        getHomepage().searchByKeyword(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}
