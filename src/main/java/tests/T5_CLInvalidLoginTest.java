package tests;

import base.CLProjectSpecification;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import pages.CLHomePage;
import org.testng.annotations.Test;

import java.io.IOException;

public class T5_CLInvalidLoginTest extends CLProjectSpecification {

    @BeforeTest
    public void setup() throws IOException {

        ExtentSparkReporter Reporter= new ExtentSparkReporter("C:\\Users\\HOSUR PS\\IdeaProjects\\Project2\\CLReports\\ContactListAppReports.html");
        Extent = new ExtentReports();
        Extent.attachReporter(Reporter);

        TestName="Invalid Login Test";
        TestDescription="Testing the login functionality with data hard code";
        TestAuthor="Sathiya Priya";
        TestCategory="Smoke Testing";

    }


    @Test(priority = 1)
    public void CLInvalidLoginTest()
    {
        Test = Extent.createTest("Adding Contact", "Check whether the Login Functionality is processing Successfully");
        CLHomePage Obj = new CLHomePage(driver);
        //Obj.CLbrowserlaunch();
        Obj.loginClick()
                .mail("meh427@gmail.com")
                .Password("Sathiya86")
                .LoginButton()
                .ValidateLogin1();
        Test.pass("Invalid Login Test executed successfully.");
    }
}
