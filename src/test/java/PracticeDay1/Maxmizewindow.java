package PracticeDay1;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Maxmizewindow {

               public static void main(String[] args) throws InterruptedException {

                   Playwright pw = Playwright.create();
                   Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                   BrowserContext context = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
                   Page Pw = context.newPage();
                   Pw.navigate("http://google.com");
                   //Pw.close();
                   //bw.close();
                   Thread.sleep(5000);
                   //System.out.println(Pw.title());

        }

    }


