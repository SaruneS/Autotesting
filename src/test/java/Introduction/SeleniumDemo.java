package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo {

  WebDriver driver;

  @BeforeMethod
  public void setUo(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
  }

  @Test
  public void testDemo() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.shift4.com");

    WebElement buttonAcceptAllCookies = driver.findElement(By.id("cookies-banner--btns-accept"));

    try {
      Thread.sleep(2000);

      buttonAcceptAllCookies.click();

      Thread.sleep(2000);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

//    driver.quit();


  }


  @Test
  public void inputFullName() {

    WebDriverManager.chromedriver().setup();


    ChromeOptions options = new ChromeOptions();
//    options.addArguments("start-maximized");
    options.addArguments("window-size=2000,3000");
    options.addArguments("--force-device-scale-factor=0.75");


//    options.addArguments("headless");

    WebDriver driver = new ChromeDriver(options);
    driver.get("https://demoqa.com/text-box");

    String expectedResult = "Sarune";
    String actualResult;

    WebElement inputFullName = driver.findElement(By.xpath("//input[@id='userName']"));

    try {

      inputFullName.sendKeys(expectedResult);

      Thread.sleep(1500);

      WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
      buttonSubmit.click();
      Thread.sleep(1500);

    } catch (InterruptedException e) {
      e.printStackTrace();

      WebElement readMessage = driver.findElement(By.id("name"));
      readMessage.getText();
      actualResult = readMessage.getText();

      Assert.assertTrue(
        actualResult.contains(expectedResult),
        String.format(
          "Actual: %s; Expected %s",
          actualResult,
          expectedResult
        )
      );
    }
    // HOUSE WORK: su email ir current address padaryt ta pati.
    // //button[@id='submit']
    // //*@class='mt-2 row']
    // //*[text()== 'Name:']      randa pagal pavadinima
    // //*[contains(text()== 'Nam')]
    // //input[@id='userName']
  }

  @AfterMethod

  public void close(){}
}
