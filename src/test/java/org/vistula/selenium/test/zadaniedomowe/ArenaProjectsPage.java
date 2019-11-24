package org.vistula.selenium.test.zadaniedomowe;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArenaProjectsPage {

    private WebDriver driver;

    @FindBy(className="item2")
    private WebElement projectsButton;

    @FindBy(name="search")
    private WebElement projectsSearchBar;

    @FindBy(id="j_searchButton")
    private WebElement projectsSearchButton;

    public ArenaProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openProjectsList() {
        projectsButton.click();
    }

    public void searchProject(String text) {
        projectsSearchBar.sendKeys(text);
        projectsSearchButton.click();
    }

    public void verifySearchResult (String text)
    {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table//a[text()='" + text + "']")
        ));
    }
}
