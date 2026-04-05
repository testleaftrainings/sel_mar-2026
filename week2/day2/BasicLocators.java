package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocators {
    /*Locating the webelement use findElement()
    -use sendKeys() for passing any input parameter
    -click actions use click() method
     */
    public static void main(String[] args) {
        //to handle the browser notifications
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver=new ChromeDriver(options);
        
        //Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");
        //maximize the screen
        driver.manage().window().maximize();
       System.out.println(driver.getTitle());
       //Enter the username
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Enter password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        //click Login
        driver.findElement(By.className("decorativeSubmit")).click();
        //clickCrmsfa
        driver.findElement(By.partialLinkText("CRM")).click();
        //close the browser
        driver.close();
    }
}
