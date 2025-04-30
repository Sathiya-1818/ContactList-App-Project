package tests;

import base.CLProjectSpecification;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CLHomePage;

import java.io.IOException;

public class T1_CLRegisterTest extends CLProjectSpecification {

    @BeforeTest
    public void setup() throws IOException {
        // Set up ExtentReports for test logging
        ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\HOSUR PS\\IdeaProjects\\Project2\\CLReports\\ContactListAppReports.html");
        Extent = new ExtentReports();
        Extent.attachReporter(reporter);

        // Test metadata
        TestName = "Regression Test";
        TestDescription = "Testing the functionalities with hardcoded data";
        TestAuthor = "Sathiya Priya";
        TestCategory = "Regression Testing";
    }

    @Test
    public void CLRegisterTest()
    {
        Test = Extent.createTest("Signing Up", "Check whether the Signing Process is processing Successfully");
        CLHomePage Obj = new CLHomePage(driver);
        //Obj.CLlaunchandLoad();
        Obj.contactSignUp()
                .contactFirstName()
                .contactLastName()
                .contactEmail("testing.com")
                .contactPassword("clapp123")
                .contactSubmit();
        Test.pass("Register Test executed successfully.");
    }
}
