package org.vistula.selenium.test.zadaniedomowe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArenaSeleniumTest {

    protected WebDriver driver;
    public static String randomName;
    public static String randomPrefix;

    public static String getRandomString() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.testarena.pl/zaloguj");
    }

    @Before
    public void createRandomProject() {
        randomName = getRandomString();
        randomPrefix = getRandomString();
    }

    @After
    public void quit() {
        driver.quit();
   }
}
