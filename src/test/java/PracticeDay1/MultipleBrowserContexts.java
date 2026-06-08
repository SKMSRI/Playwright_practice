package PracticeDay1;

import com.microsoft.playwright.Playwright;

public class MultipleBrowserContexts {
    Public_static void main(String[] args) {
        Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)).newContext(new Browser.NewContextOptions().setViewportSize(1521, 920)).newPage().navigate("https://www.google.com/");   }
}
