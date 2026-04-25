package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
    /**
     * No alert present exception
     * unhandled alert exception
     */
    public static void main(String[] args){
         ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/alert.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //simple Alert
        driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        //handle the alerts by switching the driver focus to alert box
        Alert alert = driver.switchTo().alert();
       System.out.println(alert.getText());
        alert.accept();
         
        //confirmation alert
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        //Alert alert2 = driver.switchTo().alert();
        alert.dismiss();
        //get text of the result
        String text = driver.findElement(By.id("result")).getText();
        System.out.println(text);
        //prompt Alert
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        alert.sendKeys("Saranya");
        alert.accept();
        //Sweet alerts or NOn modal alerts--->inspectable but cannot be ignored
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        //sweet alert
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    }

}
