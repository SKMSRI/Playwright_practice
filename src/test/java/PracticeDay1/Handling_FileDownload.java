package PracticeDay1;

import com.microsoft.playwright.*;

public class Handling_FileDownload {

    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext ct = bw.newContext(new Browser.NewContextOptions().setViewportSize(1521, 920));
        Page Pw = ct.newPage();
        Pw.navigate("https://demoqa.com/upload-download");
        Pw.locator("//a[@id='downloadButton']").click();

        //download file path
//        String path = download.path().toString();
//        System.out.println(path);

        //print the downloaded file name


        //cancel the download
       //download.cancel();
       // System.out.println("Download Cancelled");


    }
}
