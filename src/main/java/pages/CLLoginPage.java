package pages;


import base.CLProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLLoginPage extends CLProjectSpecification {
    public CLLoginPage(WebDriver driver){
        this.driver = driver;
    }
    public CLLoginPage mail(String mailId){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mailId);
        return this;
    }
    public CLLoginPage Password(String password) {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        return this;
    }
    public CLHomePage LoginButton() {
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        return new CLHomePage(driver);
    }
}
