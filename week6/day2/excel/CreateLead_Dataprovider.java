package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
@Test(dataProvider="fetchData")
	public void runCL(String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="fetchData")
public String[][] sendData(){
	/**
	 *1) Declare a 2D array
	 * String[]--->no of rows
	 * 2nd[]--->no of columns
	 * 2)Assign the data
	 */
	String[][] data=new String[3][3];
	data[0][0]="Testleaf";
	data[0][1]="Saranya";
	data[0][2]="S";

	data[1][0]="Testleaf";
	data[1][1]="Vinoth";
	data[1][2]="S";

	data[2][0]="Testleaf";
	data[2][1]="Anburaj";
	data[2][2]="R";

	return data;

}
}






