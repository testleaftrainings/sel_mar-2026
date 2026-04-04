package week2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        EdgeDriver driver1=new EdgeDriver();
        //Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");
        //maximize the screen
        driver.manage().window().maximize();
        //get the title of the page
       // String title = driver.getTitle();
       // System.out.println(title);
       System.out.println(driver.getTitle());
    }

}
