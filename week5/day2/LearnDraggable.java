package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://jqueryui.com/draggable/");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //handle the frame
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.id("draggable"));
        //Actions
        Actions act=new Actions(driver);
        act.dragAndDropBy(drag, 50, 100).perform();
    }

}
