package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePageTest {

    private WebDriver driver;
    private KodillaStorePage storePage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/store");
        storePage = new KodillaStorePage(driver);
    }


    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testNotebookSearch() {
        storePage.searchFor("NoteBook");
        assertEquals(2, storePage.getSearchResultsCount(), "Incorrect number of search results for 'NoteBook'");
    }

    @Test
    public void testSchoolSearch() {
        storePage.searchFor("School");
        assertEquals(1, storePage.getSearchResultsCount(), "Incorrect number of search results for 'School'");
    }

    @Test
    public void testBrandSearch() {
        storePage.searchFor("Brand");
        assertEquals(1, storePage.getSearchResultsCount(), "Incorrect number of search results for 'Brand'");
    }

    @Test
    public void testBusinessSearch() {
        storePage.searchFor("Bussines");
        assertEquals(1, storePage.getSearchResultsCount(), "Incorrect number of search results for 'Business'");
    }

    @Test
    public void testGamingSearch() {
        storePage.searchFor("Gaming");
        assertEquals(1, storePage.getSearchResultsCount(), "Incorrect number of search results for 'Gaming'");
    }

    @Test
    public void testPowerfulSearch() {
        storePage.searchFor("Powerful");
        assertEquals(0, storePage.getSearchResultsCount(), "Incorrect number of search results for 'Powerful'");
    }

    @Test
    public void testCaseInsensitivity() {
        storePage.searchFor("notebook");
        int count1 = storePage.getSearchResultsCount();
        storePage.searchFor("NoteBook");
        int count2 = storePage.getSearchResultsCount();
        assertEquals(count1, count2, "Search results count should be the same regardless of case sensitivity");
    }
}
