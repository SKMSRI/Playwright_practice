package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_CheckBox {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/Register.html");
        //Checkbox
        Thread.sleep(5000);
        Pw.locator("//input[@type='checkbox' and @value='Cricket']").check();
        //Pw.locator("//input[@type='checkbox' and @value='Movies']").check();
        Pw.locator("//input[@value='Movies' ]").check();
        Thread.sleep(5000);
        Pw.locator("//input[@type='checkbox' and @value='Hockey']").check();
        //uncheck
        Thread.sleep(5000);
        Pw.locator( "//input[@value='Cricket']").uncheck();

    }
}
