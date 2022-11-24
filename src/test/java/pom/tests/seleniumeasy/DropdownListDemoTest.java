package pom.tests.seleniumeasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumeasy.DropdownListDemoPage;

public class DropdownListDemoTest {
  @BeforeMethod
  public void setUp() {
    DropdownListDemoPage.openUrl("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

  }

  @Test
  public void testSelectListDemo() {
    String expectedResult = "Thursday";
    String actualResult;

    DropdownListDemoPage.selectDayFromDropdownList(expectedResult);
    actualResult = DropdownListDemoPage.readMessageSelectListDemo();

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
    DropdownListDemoPage.close();
  }

}
