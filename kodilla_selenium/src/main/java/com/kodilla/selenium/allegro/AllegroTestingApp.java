//package com.kodilla.selenium.allegro;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//public class AllegroTestingApp {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.get("https://allegro.pl/");
//
//        WebElement categoryDropdown = driver.findElement(By.cssSelector("select[data-role='filters-dropdown-toggle']"));
//        Select categorySelect = new Select(categoryDropdown);
//        categorySelect.selectByValue("/kategoria/elektronika");
//
//        WebElement searchInput = driver.findElement(By.cssSelector("input[name='string']"));
//        searchInput.sendKeys("Mavic mini");
//
//        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
//        searchButton.click();
//
//    }
//}
