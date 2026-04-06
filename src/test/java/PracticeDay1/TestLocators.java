package PracticeDay1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.TypeOptions;
import com.microsoft.playwright.Playwright;

public class TestLocators {

    public static void main(String[] args) {


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("http://gmail.com");

        //page.locator("#identifierId").type("trainer@way2automation.com");
        //page.locator("[id='identifierId']").type("trainer@way2automation.com");
        //page.type("id=identifierId", "trainer@way2automation.com", new TypeOptions().setDelay(100));
        page.locator("[type=email]").type("trainer@way2automation.com");
        //page.click("text=Next");
        page.click("button:has-text('Next')");
        page.locator("[type=password]").fill("sdfsdfdsf");
        page.click("button:has-text('Next')");
        System.out.println(page.locator("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span").innerText());






    }

}
     /* page.getByRole() to locate by explicit and implicit accessibility attributes.
        page.getByText() to locate by text content.
        page.getByLabel() to locate a form control by associated label's text.
        page.getByPlaceholder() to locate an input by placeholder.
        page.getByAltText() to locate an element, usually image, by its text alternative.
        page.getByTitle() to locate an element by its title attribute.
        page.getByTestId() to locate an element based on its data-testid attribute (other attributes can be configured)*/