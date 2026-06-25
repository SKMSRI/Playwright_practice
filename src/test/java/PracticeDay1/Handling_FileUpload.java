package PracticeDay1;

import com.microsoft.playwright.*;
import org.junit.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Handling_FileUpload {
    @Test
    public void singlefileupload() throws InterruptedException {

        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/automation-practice-form");

        //singlefileupload();
        Pw.setInputFiles("//input[@id=\"uploadPicture\"]",
                Paths.get("C:/Users/SAURABH/OneDrive/Pictures/Screenshots/1.png"));
        Thread.sleep(5000);
        //deattachfile
        Pw.setInputFiles("//input[@id=\"uploadPicture\"]", new Path[0]);

        //multiple file upload
//        Pw.setInputFiles("//input[@id=\"uploadPicture\"]",
//                        new Path[]{
//                        Paths.get("C:/Users/SAURABH/OneDrive/Pictures/Screenshots/1.png"),
//                        Paths.get("C:/Users/SAURABH/OneDrive/Pictures/Screenshots/2.png)});
//
}
}
