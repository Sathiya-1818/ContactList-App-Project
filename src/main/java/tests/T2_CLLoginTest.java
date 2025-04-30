package tests;

import base.CLProjectSpecification;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CLHomePage;

import java.io.IOException;

public class T2_CLLoginTest extends CLProjectSpecification {

    @BeforeTest
    public void setup() throws IOException {

        ExtentSparkReporter Reporter= new ExtentSparkReporter("C:\\Users\\HOSUR PS\\IdeaProjects\\Project2\\CLReports\\ContactListAppReports.html");
        Extent = new ExtentReports();
        Extent.attachReporter(Reporter);

        TestName="Login Test";
        TestDescription="Testing the login functionality with data hard code";
        TestAuthor="Sathiya Priya";
        TestCategory="Smoke Testing";

    }


    @Test(priority = 1)
    public void CLLoginTest()
    {
        Test = Extent.createTest("Adding Contact", "Check whether the Login Functionality is processing Successfully");
        CLHomePage Obj = new CLHomePage(driver);
        //Obj.CLbrowserlaunch();
        Obj.loginClick()
                .mail("meh472@gmail.com")
                .Password("Sathiya86")
                .LoginButton().ValidateLogin1();
        Test.pass("Login Test executed successfully.");
    }
}
