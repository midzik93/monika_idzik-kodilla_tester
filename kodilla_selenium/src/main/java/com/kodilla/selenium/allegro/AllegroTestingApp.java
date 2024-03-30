package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");   //po co to jest
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");


        WebElement categoryDropdown = driver.findElement(By.xpath("//select[@class=\"mgmw_wo\"]"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByValue("/kategoria/elektronika");

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
