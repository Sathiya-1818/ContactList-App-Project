package pages;

import base.CLProjectSpecification;
import org.openqa.selenium.By;

public class CLRegisterPage extends CLProjectSpecification {
    public CLRegisterPage() {
        this.driver = driver;
    }

    public CLRegisterPage Firstname() {
        driver.findElement(By.id("FirstName")).sendKeys("Sathiya");
        return this;
    }

    public CLRegisterPage Lastname() {
        driver.findElement(By.id("LastName")).sendKeys("Priya");
        return this;
    }

    public CLRegisterPage Email() {
        driver.findElement(By.id("Email")).sendKeys("meh472@gmail.com");
        return this;
    }

    public CLRegisterPage Password() {
        driver.findElement(By.id("Password")).sendKeys("Sathiya86");
        return this;
    }

    public CLRegisterResult RegButton() {
        driver.findElement(By.id("register-button")).click();
        return new CLRegisterResult(driver);
    }

}
