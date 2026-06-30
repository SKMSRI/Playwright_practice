package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_BrokenLinks {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/links");

        //find all the links on the page
       Locator links = Pw.locator("a");
        int linkCount = links.count();
        System.out.println("Total links on the page: " + linkCount);

        //print the text of each link
//        for (int i = 0; i < linkCount; i++) {
//            String linkText = links.nth(i).textContent();
//            String linkHref = links.nth(i).getAttribute("href");
//            System.out.println("Link Text: " + linkText + " | Link Href: " + linkHref);

        //find broken links
        //
        }

}

