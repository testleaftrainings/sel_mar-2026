3:00 to 3:40 --->ExceptionHandling
3:40 to 4:00 --->Explicit wait
4:00 to 4:40 --->Constructor
4:40 to 4:50 --->Break
4:50 to 5:30 --->POM introduction
5:30 to 5:50 --->Breakout
5:50 to 6:30 --->Seq & Parallel Execution

Exception:
Abnormal behaviour that stops the program execution.
Types:
1)checked(compiletime)-due to some external factors eg)i/o errors
2)unchecked(Runtime)-during the execution of the program.
How to handle the Exceptions:
-try/catch/finally blocks

ExplicitWait:
-condition based wait,it is applicable for a particular piece of code.
-it will halt the execution until the condition is met,otherwise will throw an exception called as timeout exception.

CreateLeadScenario:
------------------
LoginPage--->class
 enterUname--->methods
 enterpword
 clickLogin

WelcomePage--->class
 click Crmsfa--->method

Homepage--->java class
 click leadslink--->method

MyLeadsPage-->java class
 click CreateLead-->method

CreateLeadPage--->class
 enter cName
 enterFname
 enterLname
 clickcreateSubit

ViewLeadsPage--->java class
 verifyLeads-->method

Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a BaseClass and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create  driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends BaseClass Create methods for each action inside each page
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
