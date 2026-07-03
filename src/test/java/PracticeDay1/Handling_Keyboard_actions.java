package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_Keyboard_actions {

    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/automation-practice-form");


        Pw.locator("#firstName").fill("Saurabh");
        Pw.locator("#firstName").press("Tab");
        Thread.sleep(2000);
        Pw.locator("#lastName").fill("Kumar");
        Pw.locator("#lastName").press("Tab");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Pw.locator("//input[@id='userEmail']").fill("abc@gmail.com");
        Thread.sleep(2000);
        Pw.locator("//input[@id='userEmail']").press("tab");
        Thread.sleep(2000);


    }
}
/* Keyboard actions in Playwright allow you to simulate user interactions with the keyboard, such as typing text,
pressing keys, and performing keyboard shortcuts.
Here are some common keyboard actions you can perform using Playwright:
// Hit Enter
page.getByText("Submit").press("Enter");

// Dispatch Control+Right
page.getByRole(AriaRole.TEXTBOX).press("Control+ArrowRight");

// Press $ sign on keyboard
page.getByRole(AriaRole.TEXTBOX).press("$");
// <input id=name>
page.locator("#name").press("Shift+A");

// <input id=name>
page.locator("#name").press("Shift+ArrowLeft");
*/