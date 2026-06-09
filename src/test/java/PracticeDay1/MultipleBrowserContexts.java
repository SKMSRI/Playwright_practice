package PracticeDay1;

import com.microsoft.playwright.*;

import java.security.PublicKey;

public class MultipleBrowserContexts {
    public static void main(String[] args){
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context1 = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw1 = context1.newPage();
        Pw1.navigate("http://google.com");
        BrowserContext context2 = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw2 = context2.newPage();
        Pw2.navigate("http://bing.com");
           }
}
