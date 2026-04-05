package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {
    /**
     * To Locate a Dropdown:
     * -using Selectclass
     * -to make sure whether the dd field is present inside a select tag
     * -if it is present inside a select tag,we need to instantiate the select class and
     * pass the webelement as an srgument to the constructor
     * -3 methods to be used in select class for locating the dropdown
     *  a)Select by value
     * 2)select by visible text
     * 3)select by index
     * 
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
        //clickLeads
        driver.findElement(By.linkText("Leads")).click();
        //click createLead
        driver.findElement(By.linkText("Create Lead")).click();
        //enterCompanyName
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        //enterFirstName
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
        //enterLastname
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
        //locate sourceDD
        WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
        //INStantiate the Select class
        Select sel=new Select(sourceDD);
        sel.selectByValue("LEAD_PR");
        //marketing campaign
        WebElement mcDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select sel1=new Select(mcDD);
        //sel1.selectByIndex(3);
        sel1.selectByVisibleText("Car and Driver");
        driver.findElement(By.name("submitButton")).click();
    }

}
