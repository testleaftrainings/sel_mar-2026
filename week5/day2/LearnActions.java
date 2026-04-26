package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.amazon.in/");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //mouseHover
        WebElement mouseHover = driver.findElement(By.xpath("//span[text()='Prime']"));
        //instantiate the Actions class
        Actions act=new Actions(driver);
        act.moveToElement(mouseHover).perform();
        //scrolldown
        WebElement scrollDown = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
        act.scrollToElement(scrollDown).perform();
        //click
        WebElement click = driver.findElement(By.xpath("//h5[contains(text(),'Business')]"));
        act.click(click).perform();
        //rightClick
        act.contextClick().perform();
    }

}
