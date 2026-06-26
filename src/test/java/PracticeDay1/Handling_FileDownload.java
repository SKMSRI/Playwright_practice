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
        //print the downloaded file name
        System.out.println("File Download");

        //download file path
     //String Path = Download.paths.toString();
        //System.out.println(Path);

        //cancel the download
       //download.cancel();
       // System.out.println("Download Cancelled");


    }
}
