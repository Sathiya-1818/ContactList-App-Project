package pages;

import base.CLProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class CLMainScreen extends CLProjectSpecification {

    public void CLmainscreen(WebDriver driver) {
        this.driver = driver;
    }
    public CLMainScreen clickDesktop()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href=\"/desktops\"])[4]")));
        element.click();
        return this;
    }
    public CLMainScreen AddContact()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/72/1/1    ');return false;\"]")));
        element.click();
        return this;
    }

    public CLMainScreen contactFirstName()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.sendKeys("Sathiya");
        return this;
    }
    public CLMainScreen contactLastName()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"lastName\"]")));
        element.sendKeys("Priya");
        return this;
    }
    public CLMainScreen contactEmail(String domain)
    {
        Random random = new Random();
        int uniqueNumber = random.nextInt(1000000);
        System.out.println("Login Email ID: "+"sathiya" + uniqueNumber + "@" + domain);
        String emailID="sathiya" + uniqueNumber + "@" + domain;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        element.sendKeys(emailID);
        return this;
    }
    public CLMainScreen contactPassword(String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"password\"]")));
        element.sendKeys(password);
        return this;
    }
    public CLMainScreen contactSubmit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"submit\"]")));
        element.click();
        return this;
    }

}
