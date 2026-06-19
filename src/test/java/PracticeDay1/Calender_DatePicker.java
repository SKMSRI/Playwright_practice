package PracticeDay1;

import com.microsoft.playwright.*;

public class Calender_DatePicker {

    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Datepicker.html");
        //Page.Locator(Selectors ""        )

    }
}
