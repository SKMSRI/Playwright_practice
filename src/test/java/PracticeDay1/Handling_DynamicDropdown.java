package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_DynamicDropdown {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Register.html");
        //Dynamic Dropdown
        Pw.locator("//input[@id='country']").fill("India");
        Pw.locator("//input[@id='country']").press("ArrowDown");
    }
}
