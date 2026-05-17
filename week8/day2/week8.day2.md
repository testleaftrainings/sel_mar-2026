2:45 to 3:00 --->ExtentReports
3:00 to 4:00 --->ExtentReportIntegration
4:00 to 4:10 --->Break
4:10 to 5:10 --->HybridFramework
5:10 to 5:40 --->BreakOut
5:40 to 6:00 --->Recap

extent reports:
aventstack
-extenthtmlreporter
-ExtentReports
-Extent test

throw and throws keyword:
throw is used to throw an exception at a specific point in a code
throws is used to declare that a method acn throw certain exceptions, allowing the calling method to handle them appropriately
 

How to Explain the framework:
 1)-Highlevel overview :
  a)Hybrid Framework
   1)TestNg
   2)BDD
  b)Designpattern-POM
  c)project management tool-Maven
  d)Selenium-to interact with wb applications
  e)Libraries:
    Testng-to control the test exceution flow
    cucumber tool-to suport BDD
    Apachepoi-to intract with microsoft appication
    Commons-io-to handle the File
    Aventstack-Extent reports
 f)Git
2)Components of framework:
 src/test/java/com/framework/selenium/api/base:
 1)Driverinstance:driver instance is defined separately to avoid the conflict when we are working with parallel executions,cross browser,acros diff machines.
 2)SeleniumBase-ats as wrapperclass bec it contains the reusable methods ie)all the methods which is defined in element and browser interface are implemented here
 src/test/java/com/framework/selenium/api/design:
 1)Element--all the element related activities are defined
 2)Browser-all the browser related activities are defined
 3)Locators-enum
src/test/java/testng/api/base
 1)PSM--->contains the preconditions and postconditions
 2)RetryEngine- using the retryAnalyzer we can tries the failed testmethods by automation
 src/test/java/utils
 1)DtaLibrary-Read the values from excel
 2)Reporter-Abstract class(contains both implementation and un implemented methods)
 src/test/java/com/framework/selnium/pages: testscripts based on the framework methods
 src/test/java/com/framework/selenium/testcases:execution class

3)Executionflow:
   @BeforeSuite-->startReports()--->Reporter class
    @BeforeTest--->setValues()--->testclass
     @BeforeClass--->testCaseDetails()--->repoter
      @DataProvider--->senData()--->PSM
       @BeforeMethod--->preConditions()--->PSM
        @Test--->testcase
       @AfterMethod--->postcondition()--->Psm
     @AfterClass
    @AfterSuite--->stopRepports()--->Reporter