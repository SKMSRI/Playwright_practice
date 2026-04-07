package PracticeDay1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Screenshotcapture {

    public static void main(String[] args) {

        Playwright Pw= Playwright.create();
        Browser bw= Pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        bw.newPage().navigate("https://www.google.com/").screenshot(new Browser.PageScreenshotOptions().setPath("screenshot.png").setFullPage(true));
    }
}
