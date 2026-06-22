package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_DropDown {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Register.html");
        //Dropdown
        Thread.sleep(5000);
        Pw.locator("//select[@id='Skills']").selectOption("Java");
        Thread.sleep(5000);
        //Pw.locator("//Select[@id='countries']").selectOption("India");
        Pw.locator("//Select[@id='yearbox']").selectOption( "1990");

    }
}
