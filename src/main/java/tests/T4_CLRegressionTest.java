package tests;

import base.CLProjectSpecification;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CLAddContactPage;
import pages.CLHomePage;

import java.io.IOException;

public class T4_CLRegressionTest extends CLProjectSpecification {

    @BeforeTest
    public void setup() throws IOException {

        ExtentSparkReporter Reporter= new ExtentSparkReporter("C:\\Users\\HOSUR PS\\IdeaProjects\\Project2\\CLReports\\ContactListAppReports.html");
        Extent = new ExtentReports();
        Extent.attachReporter(Reporter);

        TestName="RegressionTest";
        TestDescription="Testing the login functionality with data hard code";
        TestAuthor="Sathiya Priya";
        TestCategory="Regression Testing";

    }

    @Test(priority = 1)
    public void contactSignUp() throws InterruptedException {
        Test = Extent.createTest("Signing Up", "Check whether the Signing Process is processing Successfully");
        CLHomePage SignUp = new CLHomePage(driver);
        SignUp.CLlaunchandLoad();
        SignUp.contactSignUp()
                .contactFirstName()
                .contactLastName()
                .contactEmail("testing.com")
                .contactPassword("demo123")
                .contactSubmit();
        Test.pass("SignUp Test executed successfully.");
    }

    @Test(priority = 2)
    public void contactAdd() throws InterruptedException {
        Test = Extent.createTest("Adding Contact", "Check whether the Adding Contact Process is processing Successfully");
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactAddbtn()
                .contactFirstName("Sri")
                .contactLastName("Priya")
                .contactDOB("1990-10-03")
                .contactEmail("testing.com")
                .contactPhone(325234560)
                .contactAdd1("2nd Main 1st cross street")
                .contactAdd2("Guindy")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600098")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Sai")
                .contactLastName("Krishna")
                .contactDOB("1992-08-12")
                .contactEmail("testing.com")
                .contactPhone(346527689)
                .contactAdd1("1st cross street")
                .contactAdd2("Adyar")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600038")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Sanjay")
                .contactLastName("Kumar")
                .contactDOB("1987-07-04")
                .contactEmail("testing.com")
                .contactPhone(15476790)
                .contactAdd1("Gandhi street")
                .contactAdd2("Chrompet")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600091")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Varun")
                .contactLastName("Raj")
                .contactDOB("1988-02-15")
                .contactEmail("testing.com")
                .contactPhone(174645643)
                .contactAdd1("4th Main 2nd cross street")
                .contactAdd2("Adyar")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600056")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Akshay")
                .contactLastName("Kumar")
                .contactDOB("1996-05-20")
                .contactEmail("testing.com")
                .contactPhone(1268517890)
                .contactAdd1("Vivekanadha street")
                .contactAdd2("Velachery")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600055")
                .contactCountry("India")
                .contactSubmit()
                .contactOrderVerify();
        Test.pass("Contact Adding Test executed successfully.");
    }

    @Test(priority = 3)
    public void contactEdit() throws InterruptedException {
        Test = Extent.createTest("Editing Contact", "Check whether the Editing Contact Process is processing Successfully");
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactOpen()
                .contactEdit()
                .contactEditFirstName("Sri sai")
                .contactSubmit()
                .contactReturn()
                .contactEditVerify();
        Test.pass("Contact Editing Test executed successfully.");

    }

    @Test(priority = 4)
    public void contactDelete() throws InterruptedException {
        Test = Extent.createTest("Deleting Contact", "Check whether the Deleting Contact Process is processing Successfully");
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactOpen2()
                .contactDelete()
                .contactDeleteok();
        Test.pass("Contact Deleting Test executed successfully.");
    }

    @Test(priority = 5)
    public void contactLogout() throws InterruptedException {
        Test = Extent.createTest("Logging Out from Login Page", "Check whether the logging out Process is processing Successfully");
        CLAddContactPage AddContact = new CLAddContactPage(driver);
        AddContact.Logout()
                .contactLoginScreen()
                .CLcloseBrowser();
        Test.pass("Logging Out Test executed successfully.");
    }
}
