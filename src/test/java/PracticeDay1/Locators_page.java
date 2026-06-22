package PracticeDay1;

import com.microsoft.playwright.*;

public class Locators_page {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Register.html");
        //Locators
        //Textbox
        //Dropdown
        //Radio button
        //Checkbox
        //Button
        //Link
        //Image
        //Table
        //Alert 
    }
}
