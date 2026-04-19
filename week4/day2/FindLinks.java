package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
    public static void main(String[] args) {
        
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //group of elements
        List<WebElement> links = driver.findElements(By.tagName("label"));
        //to find the size
        int listSize = links.size();
        System.out.println(listSize);
        //create list
        List<String> list=new ArrayList<String>();
        //to retrieve the values
        //datatype iterator  oldvariable
        for (WebElement each :links ) {
            String text = each.getText();
            System.out.println(text);
            list.add(text);
        }
        
        Collections.sort(list);
        System.out.println(list);
    }

}
