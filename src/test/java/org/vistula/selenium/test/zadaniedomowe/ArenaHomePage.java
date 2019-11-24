package org.vistula.selenium.test.zadaniedomowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArenaHomePage {

    private WebDriver driver;

    @FindBy(className="header_admin")
    private WebElement adminButton;

    public ArenaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAdminPanel() {
       adminButton.click();
    }

}
