package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_Frame_iFrames {
    public static void main(String[] args) {

        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/frames");
        Pw.locator("//iframe[@id='frame1']").locator("//h1[@id='sampleHeading']").click();
        String text = Pw.frameLocator("//iframe[@id='frame1']").locator("//h1[@id='sampleHeading']").textContent();
        System.out.println("Text in frame1: " + text);
        String text2 = Pw.frameLocator("//iframe[@id='frame2']").locator("//h1[@id='sampleHeading']").textContent();
        System.out.println("Text in frame2: " + text2);
        bw.close();


    }
}
