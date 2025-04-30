package pages;

import base.CLProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CLRegisterResult extends CLProjectSpecification {

    public CLRegisterResult(WebDriver driver){
        this.driver = driver;
    }
    public CLRegisterResult ValidateRegister(){
        String ExpectedId = "meh472@gmail.com";
        WebElement MailId = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));

        VisibilityofElement(MailId);
        String ActualId = MailId.getText();
        System.out.println(ActualId);

        if(ExpectedId.equalsIgnoreCase(ActualId)){
            System.out.println("Registration is Successfull");
        }else{
            System.out.println("Registration is Unsuccessfull");
        }
        return this;
    }
}
