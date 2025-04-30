package pages;

import base.CLProjectSpecification;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CLHomePage extends CLProjectSpecification {
    @FindBy(className = "ico-register")
    WebElement register;

    private static final String SCREENSHOT_FOLDER = "C:\\Users\\HOSUR PS\\IdeaProjects\\Project2\\CLSnaps\\";
    public String TestName;


    public CLHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CLRegisterPage registerclick() {
        driver.findElement(By.className("ico-register")).click();
        return new CLRegisterPage();
    }

    public CLLoginPage loginClick() {
        driver.findElement((By.xpath("//*[@id=\"email\"]"))).click();
        return new CLLoginPage(driver);
    }

    public CLHomePage ValidateLogin() {
        String ExpectedId = "meh472@gmail.com";
        WebElement MailId = driver.findElement(By.xpath("//*[@id=\"email\"]"));

        VisibilityofElement(MailId);
        String ActualId = MailId.getText();
        System.out.println(ActualId);

        if (ExpectedId.equalsIgnoreCase(ActualId)) {
            System.out.println("Registration is Successfull");
        } else {
            System.out.println("Registration is Unsuccessfull");
        }
        return this;
    }


    public CLMainScreen contactSignUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick=\"location.href='/addUser'\"]")));
        element.click();
        return new CLMainScreen();

    }

    public CLHomePage ValidateLogin1() {
        String ExpectedId = "meh472@gmail.com";
        WebElement MailId = driver.findElement(By.xpath("//*[@id=\"email\"]"));

        VisibilityofElement(MailId);
        String ActualId = MailId.getText();
        System.out.println(ActualId);

        if (ExpectedId==ActualId) {
            System.out.println("Login is Successfull");
        } else {
            System.out.println("Login is Unsuccessfull");
        }
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Ensure folder exists
            File folder = new File(SCREENSHOT_FOLDER);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filePath = SCREENSHOT_FOLDER + TestName + "_" + timestamp + ".png";

            FileUtils.copyFile(srcFile, new File(filePath));
            System.out.println("Screenshot saved successfully: " + filePath);

            //return filePath; // Returns the saved path for reference
        } catch (IOException e) {
            System.out.println("Screenshot saving failed: " + e.getMessage());
            e.printStackTrace(); // Helps debug any issues
        }
        return this;
    }
}
