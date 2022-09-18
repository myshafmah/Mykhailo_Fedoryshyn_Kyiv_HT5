package org.epam.aqa.ht5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsosTest extends BaseTest{
    private static final String SEARCH_KEYWORD = "product";
    private static final String EXPECTED_QUERY = "query=product";

    @Test
    public void test() {
        System.out.println(1);
    }

    @Test
    public void addToCartTest() {
        System.out.println(2);
    }

    @Test
    public void searchResultTest() {
        System.out.println(3);
    }

    @Test
    public void checkThatUrlContainsSearchKeyword() {
        getHomepage().searchByKeyword(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}