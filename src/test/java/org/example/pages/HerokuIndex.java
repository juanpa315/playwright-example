package org.example.pages;

import org.example.base.BasePage;


public class HerokuIndex extends BasePage{
    
    public void navigateToIndexPage(String url) {
        setUp();
        page.navigate(url);
    }

    public void clicElement(String element){
        page.locator(element).click();
    }

    public void enterValueIntoElement(String element, String textValue){
        page.locator(element).fill(textValue);
    }



}
