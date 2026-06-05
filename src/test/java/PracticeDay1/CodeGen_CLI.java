package PracticeDay1;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class CodeGen_CLI {
          public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
               Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                BrowserContext context = browser.newContext();
                // Start tracing before creating / navigating a page.
                context.tracing().start(new Tracing.StartOptions()
                        .setScreenshots(true)
                        .setSnapshots(true)
                        .setSources(true));
                Page page = context.newPage();
                page.navigate("https://practicesoftwaretesting.com/#/");
                // Stop tracing and export it into a zip archive.
                context.tracing().stop(new Tracing.StopOptions()
                        .setPath(Paths.get("trace.zip")));
                page.locator("[data-test=\"product-01KTAH9Q9NJAGEQ7WRW8XM1TPS\"]").click();
                page.locator("[data-test=\"add-to-cart\"]").click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Pliers Pliers More information")).click();
                 page.locator("[data-test=\"add-to-cart\"]").click();

            }

        }

    }

//codegencli
// mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://practicesoftwaretesting.com/#/"
