package PracticeDay1;

import com.microsoft.playwright.*;

public class practice {
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



    /* practice automtion website
     * 1. open the browser
     * 2. navigate to google.com
     * 3. close the browser
     * 4. print the title of the page
     * 5. maximize the window
     * 6. capture the screenshot of the page
     * 7. handle multiple browser contexts
     * 8. locators in playwritght
 Websites to practice:
     * https://demo.automationtesting.in/Register.html
     *
     */
