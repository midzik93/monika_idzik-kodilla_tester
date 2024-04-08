package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public abstract class AbstractKodillaStorePage {

    protected WebDriver driver;

    public AbstractKodillaStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void searchFor(String phrase);

    public abstract int getSearchResultsCount();
}
