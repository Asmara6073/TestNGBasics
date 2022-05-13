package class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }


    @Test(groups="regression")
    public void verifyCredentials(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String expectedText="Invalid credentials";
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("123456");
        WebElement button= driver.findElement(By.id("btnLogin"));
        button.click();
        String text= driver.findElement(By.id("spanMessage")).getText();

        //assertion to make sure that the message is correct
        Assert.assertEquals(text,expectedText);

        //check all assertions
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }


}
