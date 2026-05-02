package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
    @Test
    public void testcase(){
        System.out.println("testcase1 is passed");
    }
    @BeforeSuite
    public void startReports(){
        System.out.println("reports started");
    }
    @AfterSuite
    public void stopReports(){
        System.out.println("reports stopped");
    }
    @BeforeMethod
    public void preConditions(){
        System.out.println("preconditions setup is done");
    }
    @BeforeTest
     public void dataBaseSetup(){
        System.out.println("connection is fixed");
    }
    @BeforeClass
     public void testCaseDetails(){
        System.out.println("testCaseDetails are assigned");
    }
    @AfterMethod
    public void postConditions(){
        System.out.println("postconditions setup is done");
    }
    
    /*
    reports started--->BeforeSuite
connection is fixed-->beforetest
testCaseDetails are assigned--->BeforClass

testcase1 is passed---->test
 */

}
