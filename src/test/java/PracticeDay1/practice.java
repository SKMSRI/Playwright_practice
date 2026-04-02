package PracticeDay1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page PW =bw.newPage();
        PW.navigate("http://google.com");
         System.out.println(PW.title());
        // PW.close();
        // bw.close();
         Thread.sleep(5000);
    }

    }

