package PracticeDay1;
//Automation waiting is a technique used in automated testing to pause the execution of a test script
// until a certain condition is met. This is important because web applications can have dynamic content that
// may take time to load, and if the test script tries to interact with an element before it is available,
// it can lead to errors.
//Default waiting is a built-in feature of many testing frameworks that automatically waits for a certain
// amount of time before throwing an error if an element is not found. This can be useful for simple cases, b
// ut it can also lead to longer test execution times if the wait time is set too high.

import com.microsoft.playwright.*;

public class Auto_waiting {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Register.html");
        //Page.Time(5000); // Set a timeout of 5 seconds for all actions on the page
        Pw.setDefaultTimeout(5000); // Set a default timeout of 5 seconds for all actions on the page
        //Pw.setDefaultNavigationTimeout(5000); // Set a default navigation timeout of
        Pw.locator("//input[@id='country']").fill("India");
        
    }
}
