package PracticeDay1;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Maxmizewindow {

               public static void main(String[] args) {

            Playwright PW = Playwright.create();
            ArrayList<String> arguments = new ArrayList<>();
            arguments.add("--start-maximized");
            Browser bw = PW.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
            BrowserContext context = bw.newContext(new Browser.NewContextOptions().setViewportSize(null));

            Page page = context.newPage();

            page.navigate("http://google.com");
            System.out.println(page.title());

        }

    }


