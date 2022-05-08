package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
   public static WebDriver driver;
   //go to syntax login
   //enter wrong credentials
   //verify the message is "invalid credentials"


   @BeforeMethod
   public void openBrowser() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
   }

   @Test
   public void verifyCredentials(){
      String expectedText="Invalid credentials";
     WebElement username=driver.findElement(By.id("txtUsername"));
     username.sendKeys("123456");
      driver.findElement(By.id("txtPassword")).sendKeys("123456");
      driver.findElement(By.id("btnLogin")).click();
      String text= driver.findElement(By.id("spanMessage")).getText();
      Assert.assertEquals(text,expectedText);
       WebElement usernamebox=driver.findElement(By.id("txtUsername"));


      //assert if username textbox is displayed
      boolean displayed=usernamebox.isDisplayed();
      //assertion if it is actually displayed or not

      Assert.assertTrue(displayed);

   }

   @AfterMethod
   public void closeBrowser(){
      driver.quit();
   }


}
