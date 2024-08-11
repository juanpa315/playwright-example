package org.example.tests;

import org.example.pages.HerokuIndex;
import org.example.pages.Locators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;
public class TestRunner {

    HerokuIndex herokuIndex = new HerokuIndex();
    Locators locators = new Locators();
    Page page;


    @Test
    public void loginIntoHerokuPage() {
        herokuIndex.navigateToIndexPage("https://katalon-demo-cura.herokuapp.com/");
        herokuIndex.clicElement(locators.makeAppinmentButton);
        herokuIndex.enterValueIntoElement(locators.usernameField, "John Doe");
        herokuIndex.enterValueIntoElement(locators.passwordField, "ThisIsNotAPassword");
        herokuIndex.clicElement(locators.loginBtn);
        herokuIndex.clicElement(locators.chkHospotalRreadmission);
        herokuIndex.clicElement(locators.txtVisitDate);
        herokuIndex.enterValueIntoElement(locators.txtVisitDate, "20/10/2020");
        herokuIndex.enterValueIntoElement(locators.txtComment, "test");
        herokuIndex.clicElement(locators.btnBookAppointment);

        Assertions.assertTrue(
            page.locator("text=Appointment Confirmation").isVisible(),
            "The text 'Appointment Confirmation' should be visible on the page.");
    }

    
}
