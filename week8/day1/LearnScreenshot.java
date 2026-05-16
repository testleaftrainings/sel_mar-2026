package week8.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/alert.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //takescreenshot
        File sourcFile = driver.getScreenshotAs(OutputType.FILE);
        //destination
        File destination=new File("./snaps/homepage.png");

        FileUtils.copyFile(sourcFile, destination);

    }
}
