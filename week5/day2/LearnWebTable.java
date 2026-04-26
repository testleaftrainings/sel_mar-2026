package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://www.leafground.com/table.xhtml");
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //locate the table
        driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
        //rowCount
        //WebElement element = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
        List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
        int size = row.size();
        System.out.println(size);
        //columncount
        List<WebElement> colCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
        System.out.println(colCount.size());
        //retrieve the particular data
        String singleData = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]/td[2]")).getText();
        System.out.println(singleData);
        //entire row
        List<WebElement> EntireRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
        for (WebElement each : EntireRow ) {
            System.out.println(each.getText());
        }

        //dynamic table
        for (int i = 1; i < row.size() ; i++) {
            driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
            System.out.println("-------------------------");
            for (int j = 1; j <colCount.size() ; j++) {
                //driver.findElement(By.xpath("//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
                WebElement dynamicData = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
                System.out.println(dynamicData.getText());
            }
        }

    }

}
