package tests;

import base.CLProjectSpecification;
import org.testng.annotations.Test;
import pages.CLAddContactPage;

public class T3_ContactCheckTest extends CLProjectSpecification {

    @Test
    public void CLAddContactTest(){
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactAddbtn()
                .contactFirstName("Sathiya")
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
                .contactSubmit()
                ;
        Contact.contactAddbtn()
                .contactFirstName("Praba")
                .contactLastName("karan")
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
                .contactFirstName("BMP")
                .contactLastName("Murugaperumal")
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
                .contactFirstName("Varadha")
                .contactLastName("Rajan")
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
                .contactFirstName("Sri")
                .contactLastName("Krishna")
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
        //extent.flush();
    }

    @Test(priority = 3)
    public void contactEdit() throws InterruptedException {
        //test = extent.createTest("Editing Contact", "Check whether the Editing Contact Process is processing Successfully");
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactOpen()
                .contactEdit()
                .contactEditFirstName("Sri sai")
                .contactSubmit()
                .contactReturn()
                .contactEditVerify();
       // extent.flush();

    }

    @Test(priority = 4)
    public void contactDelete() throws InterruptedException {
        //test = extent.createTest("Deleting Contact", "Check whether the Deleting Contact Process is processing Successfully");
        CLAddContactPage Contact = new CLAddContactPage(driver);
        Contact.contactOpen2()
                .contactDelete()
                .contactDeleteok()
                .Logout()
                .CLcloseBrowser();

    }
}
