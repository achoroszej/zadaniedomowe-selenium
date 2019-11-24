package org.vistula.selenium.test.zadaniedomowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArenaLoginPage {

    private WebDriver driver;

    @FindBy(id="email")
    private WebElement email;

    @FindBy (id="password")
    private WebElement password;

    @FindBy (id="login")
    private WebElement login;

    public ArenaLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        public void logIn() {
            email.sendKeys("administrator@testarena.pl");
            password.sendKeys("sumXQQ72$L");
            login.click();
        }

}
