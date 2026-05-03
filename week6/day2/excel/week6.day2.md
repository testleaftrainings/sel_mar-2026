03:00 to 04:00 -> ReadExcel&Excel Integrations with TestCase 
04:00 to 04:35 -> Breakout(20mins) + Break(10 mins)
04:35 to 05:00 -> Common integration
05:00 to 05:30 -> Cucumber Introduction (Feature file) 
05:30 to 06:00 -> Implemenation (Step def and Runner class)
06:00 to 06:20 -> Breakout

Read values from eXCEL:
-IDENTIFY THE WORKBOOK
  -Identify the worksheet
    -Identify the rows
     -locate the cell in a row

     XSSFWORKBOOK
     Steps to do Excel Integration:
Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
 String[][] data = new String[rowCount][columnCount];


Push=>  stringCellValue to the Array 
data[i-1][j]=stringCellValue;

Close the workbook and return the data 
wBook.close();
 return data;

Change main method to a normal static method
* public static String[][] readExcel(){ }

Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data * * *    @DataProvider(name="fetchData")
 public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(); 

	return ClassName.method();
	}



Common Integration:

(./data/createLead.xlsx); 
create input args inside method
public static String[][] read(String fileName){
	 (./data/"+fileName+".xlsx) 
	 }

into the BaseClass or PSM and declare a fileName globally
 * public String fileName; ------------ > Global declaration
 
 Cut and paste the DataProvider code from CreateLead Class
 * @DataProvider(name="fetchData") 
  public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(fileName); }
	
*Create setValues() inside each testcase and annotate with @BeforeTest and
 mention the filename here 
 @BeforeTest
  public void setValues() { 
	fileName="CreateLead"; 
	} 
	
* Finally , run from the xml file

BS
BT
BC
DP
BM
@T
AM
AC
AT
AS

     @BeforeSuite
      @Beforetest
       @beforeclass
        @Dataprovider
        @beforeMethod
        @test

Cucumber Framework Setup in VS Code using TestNG (Step-by-Step Guide)
Step 1: Create Maven Project
Press Ctrl + Shift + P
Type → Maven: New Project
Select → no-archetype
Enter GroupId → com.demo
Enter ArtifactId → cucumberproject
Choose Destination folder
Press Enter
// Output: Maven project is created
Step 2: Add Dependencies in pom.xml
Open pom.xml. Check if the dependency is added for Cucumber. If not added, add the below dependencies:

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.11.2</version>
</dependency>

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>7.11.2</version>
</dependency>
Step 3: Project Structure Setup
Navigate to src/test/java → for Step Definition & Runner
Create src/test/resources manually → for Feature files
Step 4: Create Feature Layer
Right click src/test
Create new folder → resources
Create new package under the resources folder → features
Inside features package → create file → login.feature
Step 5: Write Feature File
Use Gherkin syntax

Feature: Login

Scenario: Valid login
Given user enters username
When user enters password
Then user clicks login
Step 6: Create Step Definition Layer
Go to src/test/java
Create package → stepdefinitions
Create class → LoginSteps.java
Map steps using annotations

@Given("user enters username")
public void enterUsername() {
    System.out.println("Username entered");
}
Step 7: Create Runner Layer
Create package → runner
Create class → TestRunner.java
Extend AbstractTestNGCucumberTests
Step 8: Configure Runner Class
Add @CucumberOptions

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {"pretty"}
)
// Output: Cucumber will map feature and step definitions
Step 9: Execute Tests
Right click TestRunner.java
Run as TestNG Test
Step 10: Verify Output
Check console logs
Verify scenario execution status
Summary
Step Action

1 Create Maven project 2 Add dependencies 3 Setup project structure 4 Create feature 5 Write feature file 6 Map step definitions 7 Create runner 8 Configure runner 9 Execute tests 10 Verify output