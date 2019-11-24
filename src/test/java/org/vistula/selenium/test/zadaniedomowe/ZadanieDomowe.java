package org.vistula.selenium.test.zadaniedomowe;

import org.junit.Test;

public class ZadanieDomowe extends ArenaSeleniumTest {

    @Test
    public void shouldCreateProject() {

        ArenaLoginPage arenaLoginPage = new ArenaLoginPage(driver);
        ArenaHomePage arenaHomePage = new ArenaHomePage(driver);
        ArenaAdminPage arenaAdminPage = new ArenaAdminPage(driver);
        ArenaAddProjectPage arenaAddProjectPage = new ArenaAddProjectPage(driver);
        ArenaProjectsPage arenaProjectsPage = new ArenaProjectsPage(driver);

        arenaLoginPage.logIn();
        arenaHomePage.openAdminPanel();
        arenaAdminPage.openAddProject();
        arenaAddProjectPage.createProject();
        arenaProjectsPage.openProjectsList();
        arenaProjectsPage.searchProject(randomName);

        arenaProjectsPage.verifySearchResult(randomName);

    }

}
