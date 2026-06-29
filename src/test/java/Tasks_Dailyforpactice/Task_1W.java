package Tasks_Dailyforpactice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class Task_1W {

    public static void main(String[] args) {
        Playwright pw=Playwright.create();
        Browser Bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         Bw.newContext().newPage().navigate("https://demo.automationtesting.in/Register.html");
         System.out.println(Bw.newContext().newPage().title());

    }
}

/* practice automtion website
     * 1. open the browser
     * 2. navigate to https://demo.automationtesting.in/Register.html
     * 3. maximize the window
     * 4. print the title of the page
     * 5. capture the screenshot of the page
     * 6. handle multiple browser contexts
     * 7. close the browser
     * 8. locators in playwritght
 Websites to practice:
     * https://demo.automationtesting.in/Register.html
     *
*/