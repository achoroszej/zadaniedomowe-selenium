package org.vistula.selenium.test.zadaniedomowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArenaAddProjectPage {

    private WebDriver driver;

    @FindBy(id="name")
    private WebElement inputProjectName;

    @FindBy(id="prefix")
    private WebElement inputProjectPrefix;

    @FindBy(id="save")
    private WebElement saveButton;

    public ArenaAddProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createProject() {
        String randomName = ZadanieDomowe.randomName;
        String randomPrefix = ZadanieDomowe.randomPrefix;
        inputProjectName.sendKeys(randomName);
        inputProjectPrefix.sendKeys(randomPrefix);
        saveButton.click();
    }





}
