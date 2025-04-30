package pages;

import base.CLProjectSpecification;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CLAddContactPage extends CLProjectSpecification {

    public CLAddContactPage(WebDriver ldriver)
    {
        this.driver = ldriver;
    }
    public CLAddContactPage contactAddbtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"add-contact\"]")));
        element.click();
        return new CLAddContactPage(driver);
    }
    public CLAddContactPage contactFirstName(String fname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.sendKeys(fname);
        return this;
    }
    public CLAddContactPage contactLastName(String lname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"lastName\"]")));
        element.sendKeys(lname);
        return this;
    }
    public CLAddContactPage contactDOB(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"birthdate\"]")));
        element.sendKeys(name);
        return this;
    }
    public CLAddContactPage contactEmail(String domain)
    {
        Random random = new Random();
        int uniqueNumber = random.nextInt(1000000);
        System.out.println(uniqueNumber + "@" + domain);
        String emailID=uniqueNumber + "@" + domain;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        element.sendKeys(emailID);
        return this;
    }
    public CLAddContactPage contactPhone(int num)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"phone\"]")));
        element.sendKeys(String.valueOf(num));
        return this;
    }
    public CLAddContactPage contactAdd1(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"street1\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public CLAddContactPage contactAdd2(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"street2\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public CLAddContactPage contactCity(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"city\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public CLAddContactPage contactState(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"stateProvince\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public CLAddContactPage contactPostalCode(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"postalCode\"]")));
        element.sendKeys(name);
        return this;
    }
    public CLAddContactPage contactCountry(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"country\"]")));
        element.sendKeys(name);
        return this;
    }
    public CLAddContactPage contactSubmit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"submit\"]")));
        element.click();
        return this;
    }

    public CLAddContactPage contactOrderVerify()
    {
        List<WebElement> contactElements = driver.findElements(By.cssSelector(".contacts > div"));
        // Adjust the selector based on how the contacts are displayed

        // Extract contact names into a list
        List<String> actualContactNames = new ArrayList<>();
        for (WebElement contact : contactElements) {
            actualContactNames.add(contact.getText());
            System.out.println("Contact Name:   "+actualContactNames.add(contact.getText()));
        }

        // Create a copy and sort it
        List<String> sortedContactNames = new ArrayList<>(actualContactNames);
        Collections.sort(sortedContactNames);

        // Compare original and sorted lists
        if (actualContactNames.equals(sortedContactNames)) {
            System.out.println("Contacts are in alphabetical order.");
        } else {
            System.out.println("Contacts are NOT in alphabetical order.");
        }
        return this;
    }
    public CLAddContactPage contactOpen()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")));
        element.click();
        return this;
    }
    public CLAddContactPage contactEdit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"edit-contact\"]")));
        element.click();
        return this;
    }
    public CLAddContactPage contactEditFirstName(String name) throws InterruptedException
    {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Edit Contact')]")));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.clear();
        element.sendKeys(name);
        return this;
    }
    public CLAddContactPage contactReturn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"return\"]")));
        element.click();
        return this;
    }
    public CLAddContactPage contactEditVerify()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")));
        String ele = element.getText();
        Assert.assertEquals(ele, "Sri sai Krishna", "Page title does not match!");

        return this;
    }
    public CLAddContactPage contactOpen2() throws InterruptedException
    {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[2]/td[2]")));
        element.click();
        return this;
    }
    public CLAddContactPage contactDelete()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"delete\"]")));
        element.click();
        return this;
    }
    public CLAddContactPage contactDeleteok()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }
    public CLAddContactPage Logout() throws InterruptedException
   {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
        return new CLAddContactPage(driver);
   }

    public CLAddContactPage contactLoginScreen()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"signup\"]")));
        System.out.println("Logout Successfully...!!!");
        return this;
    }

}
