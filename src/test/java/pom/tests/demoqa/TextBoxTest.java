package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.demoqa.ElementPage;
import pom.pages.demoqa.HomePage;
import pom.pages.demoqa.TextBoxPage;
import pom.tests.BaseTest;
import pom.utils.TestListener;


public class TextBoxTest extends BaseTest {

  @BeforeMethod
  @Override
  public void setUp() {

   // TextBoxPage.openUrl("https://demoqa.com/text-box");
    HomePage.openUrl("https://demoqa.com/");
    HomePage.clickElementFromMenu();
    ElementPage.clickTextboxFromMenu();
  }

  @Test
  public void testInputFullName() {
    String expectedResult = "Sarune";
    String actualResult;

    TextBoxPage.writeFullName(expectedResult);
    TextBoxPage.sleep(1500);

    TextBoxPage.clickButtonSubmit();
    TextBoxPage.sleep(1500);

    actualResult = TextBoxPage.readFullName();
    TextBoxPage.sleep(1500);

    Assert.assertTrue(
      actualResult.contains(expectedResult),
      String.format(
        "Actual: %s; Expected %s",
        actualResult,
        expectedResult
      )
    );
  }

  @AfterMethod
  public void close() {
    TextBoxPage.close();
  }

}
