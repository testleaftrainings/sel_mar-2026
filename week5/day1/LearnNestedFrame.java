package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
    /**
     * no such frame exception
     * @param args
     */
    public static void main(String[] args){
         ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/frame.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //outer frame
        WebElement nestFrame = driver.findElement(By.xpath("//h5[contains(text(),' Click Me (Inside Nested frame)')]/following-sibling::iframe"));
        //handle the frame
        driver.switchTo().frame(nestFrame);
        //handle the inner frame
        //driver.switchTo().frame("frame2");
        driver.switchTo().frame(0);
        //click
        driver.findElement(By.id("Click")).click();
        //what is the difference between default content and parent frame
        driver.switchTo().defaultContent();//comes out of all the frames to the main page
        driver.switchTo().parentFrame();//switches to the immediate parent frame
    }

}
