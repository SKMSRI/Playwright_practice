package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_Alerts_Popups {

    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/alerts");


        //Page.onDialog(handler) listener must handle the dialog.
        // Otherwise your action will stall, be it Locator.click() or something else.
        Pw.onDialog(dialog -> dialog.accept());
        //System.out.println("Alert Text: " + Pw.onDialog(dialog -> dialog.message()));
        //popup alert
        Pw.locator("//button[@id='alertButton']").click();
        Thread.sleep(5000);
        Pw.locator("//button[@id='timerAlertButton']").click();
        Pw.locator("//button[@id='confirmButton']").click();
        Pw.locator("//button[@id='promtButton']").click();
        bw.close();

    }
}
