package PracticeDay1;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Screenshotcapture {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://www.amazon.in/");
        Thread.sleep(5000);

        //Full Page screenshot
        Pw.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("amazon1.png"))
                .setFullPage(true));
        //Element screenshot
        Pw.locator("//img[@alt='Amazon Brand - Solimo']").screenshot(new Locator    .ScreenshotOptions()
                .setPath(Paths.get("amazon3.png")));
        bw.close();



    }
}
