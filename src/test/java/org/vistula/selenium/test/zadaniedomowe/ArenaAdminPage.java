package org.vistula.selenium.test.zadaniedomowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArenaAdminPage {

    private WebDriver driver;

    @FindBy(css="a[href='http://demo.testarena.pl/administration/add_project']")
    private WebElement addProjectButton;

    public ArenaAdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAddProject() {
        addProjectButton.click();
    }


}
