package PracticeDay1;
import com.microsoft.playwright.*;
import java.sql.Driver;

public class Handling_MultipleWindows_tabs {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw1 = ct.newPage();
        Pw1.navigate("https://demoqa.com/browser-windows");
        System.out.println("Parent Window Title: " + Pw1.title());

        //open new tab or window
        Thread.sleep(5000);
        Pw1.locator("//button[@id='tabButton']").click();
        //switch to new tab
        for (Page newtab : ct.pages()) {
            if (!newtab.equals(Pw1)) {
                System.out.println("Switched to New Tab Title: " + newtab.title());
                break;

            }
            //Pw1.close();
        }

        //switch to new window
        Thread.sleep(5000);
        Pw1.locator("//button[@id='messageWindowButton']").click();
        for (Page newwindow : ct.pages()) {
            if (!newwindow.equals(Pw1)) {
                System.out.println("Switched to New Window Title: " + newwindow.title());
                break;
            }
        }

    }
}
//you tube Ur;: https://www.youtube.com/watch?v=qPvmSHffI2A or https://www.youtube.com/watch?v=1MP-14mimPo