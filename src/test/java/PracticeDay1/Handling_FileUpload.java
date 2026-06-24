package PracticeDay1;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.io.File;

public class Handling_FileUpload {
    @Test
    public void singlefileupload() throws InterruptedException {

        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demo.automationtesting.in/FileUpload.html");
        //Page.setInputFiles("//input[@id='input-4']", Path files = new File("C:\\Users\\Admin\\Downloads\\sampleFile.jpeg"));
    }
}
