package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/window.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the address of the current window
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);//288C3AD532DA85894D5969B38BDC262B,6BB8EE4B2F85244E9CC44FD29A78CAEA
        System.out.println(driver.getTitle());
        //click open
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        //retrieve the child window address
        Set<String> childWindow = driver.getWindowHandles();
        //conver set into list
        List<String> listWindow=new ArrayList<String>(childWindow);
        //switch to window
        driver.switchTo().window(listWindow.get(1));
        String cHWindow = driver.getWindowHandle();
        System.out.println(cHWindow);
        System.out.println(driver.getTitle());
        driver.close();
        //driver.switchTo().window(listWindow.get(1));no such window exception
        driver.quit();
    }

}
