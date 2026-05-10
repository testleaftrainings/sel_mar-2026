package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public ChromeDriver driver;
    @BeforeMethod
    public void preConditions(){
    ChromeOptions options=new ChromeOptions();
    options.addArguments("guest");
     driver=new ChromeDriver(options);
     System.out.println("BeforeMethod:"+driver);
    driver.get("https://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void postConditions(){
        driver.close();
    }


}
