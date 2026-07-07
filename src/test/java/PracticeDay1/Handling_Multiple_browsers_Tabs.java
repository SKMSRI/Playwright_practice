package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_Multiple_browsers_Tabs {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser bw = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext ct1 = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        BrowserContext ct2 = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));

        Page Pw1 = ct1.newPage();
        Page Pw2 = ct2.newPage();

        Pw1.navigate("https://demoqa.com/browser-windows");
        System.out.println("Browser 1 Title: " + Pw1.title());
        Thread.sleep(5000);
//        bw.close();

        Pw2.navigate("https://demoqa.com/alerts");
        System.out.println("Browser 2 Title: " + Pw2.title());
        //bw.close();
    }
}
