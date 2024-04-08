package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class KodillaStorePage extends AbstractKodillaStorePage{

    @FindBy(css = "input[placeholder='Szukaj...']")
    WebElement searchField;

    public KodillaStorePage(WebDriver driver) {
     super(driver);
        PageFactory.initElements(driver,this);
        driver.navigate().to("https://kodilla.com/pl/test/store");
    }
    public void searchFor(String phrase){
        searchField.clear();
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.ENTER);
    }
    public int getSearchResultsCount() {
        return driver.findElements(By.cssSelector(".element")).size();
    }
}
