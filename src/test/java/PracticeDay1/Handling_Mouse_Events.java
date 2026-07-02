package PracticeDay1;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.MouseButton;

public class Handling_Mouse_Events {

    public static void main(String[] args) throws InterruptedException {
        Playwright Pw = Playwright.create();
        Browser bw = Pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw1 = ct.newPage();
        Pw1.navigate("https://demoqa.com/menu#");

        //Mouse Hover
        Pw1.getByText("Main Item 2").hover();
        //Click on Sub Item
        Pw1.getByText("SUB SUB LIST »").hover();
        Pw1.getByText("Sub Sub Item 1").click();
        Thread.sleep(5000);

        //Right Click
        Pw1.getByText("Main Item 2").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        Thread.sleep(5000);
        //Double Click
        Pw1.getByText("Main Item 2").dblclick();
        Thread.sleep(5000);
        bw.close();

    }
}

/*  // Generic click
page.getByRole(AriaRole.BUTTON).click();

// Double click
page.getByText("Item").dblclick();

// Right click
page.getByText("Item").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));

// Shift + click
page.getByText("Item").click(new Locator.ClickOptions().setModifiers(Arrays.asList(KeyboardModifier.SHIFT)));

// Ctrl + click on Windows and Linux
// Meta + click on macOS
page.getByText("Item").click(new Locator.ClickOptions().setModifiers(Arrays.asList(KeyboardModifier.CONTROL_OR_META)));

// Hover over element
page.getByText("Item").hover();

// Click the top left corner
page.getByText("Item").click(new Locator.ClickOptions().setPosition(0, 0));

*/