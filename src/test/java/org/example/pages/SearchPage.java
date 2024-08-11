package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SearchPage {
    private final Page page;
    private final Locator searchTermInput;

    public SearchPage(Page page) {
        this.page = page;
        this.searchTermInput = page.locator("[aria-label='Enter your search term']");
    }

    public void navigate() {
        page.navigate("https://bing.com");
    }

    public void search(String text) {
        searchTermInput.fill(text);
        searchTermInput.press("Enter");
    }
}
