package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {
    public static void main(String[] args) throws IOException {
        //set up the report path
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./learnselenium/reports/result.html");
        //instantiate the ExtentReports
        ExtentReports extent=new ExtentReports();
        //attach the file with the reportter path
        extent.attachReporter(reporter);
        //craetea testcasename or its description
        ExtentTest test=extent.createTest("Login","Login with valid credentials");
        //Assign category of the testcase
        test.assignCategory("Regression testing");
        test.assignAuthor("Saranya");
        //assign the steplevel status of the testcase
        test.pass("username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("../../snaps/homepage.png").build());
        test.pass("pword entered sucessfully");
        //mandotory step
        extent.flush();//to save reports
        System.out.println("done");
    }
}
