package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
        /**
         * possible scenarios for No such element exception
         * -check the locator
         * -wait statements
         * -element is present inside  a frame
         * 
         * @param args
         */
 public static void main(String[] args){
         ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/frame.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //handle the frame
        driver.switchTo().frame(0);
        //click
        driver.findElement(By.id("Click")).click();
 }
}
