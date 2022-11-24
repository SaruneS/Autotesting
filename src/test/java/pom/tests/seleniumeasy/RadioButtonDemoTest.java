package pom.tests.seleniumeasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.seleniumeasy.DropdownListDemoPage;
import pom.pages.seleniumeasy.RadioButtonDemoPage;
import pom.tests.BaseTest;

public class RadioButtonDemoTest extends BaseTest {

  @BeforeMethod
//  public void setUp() {
//    RadioButtonDemoPage.setUp("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//
//  }
  @Override
  public void setUp() {
    RadioButtonDemoPage.setUp("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
  }

  @DataProvider(name = "radioButtonDataProvider")
  public Object[][] dataProviderRadioButton() {
    return new Object[][]{
      {"Male"},
      {"Female"}
    };
  }

  @Test(dataProvider = "radioButtonDataProvider")
  public void testRadioButton(String expectedResult) {
    String actualResult;

    RadioButtonDemoPage.clickRadioButton(expectedResult);
    RadioButtonDemoPage.clickGetCheckedValue();
    actualResult = RadioButtonDemoPage.readMessageCheckedValue();

    Assert.assertTrue(
      actualResult.contains(expectedResult),
      String.format(
        "Actual: %s; Expected %s",
        actualResult,
        expectedResult
      )
    );

  }

  @DataProvider(name = "radioButtonGroupDataProvider", parallel = true)
  public Object[][] dataProviderRadioButtonGroup() {
    return new Object[][]{
      {"Male", "0 - 5"},
      {"Male", "5 - 15"},
      {"Male", "15 - 50"},
      {"Female", "0 - 5"},
      {"Female", "5 - 15"},
      {"Female", "15 - 50"}
    };
  }

  @Test(dataProvider = "radioButtonGroupDataProvider", threadPoolSize = 6)
  public void testGroupRadioButtons(String expectedGender, String expectedAge) {
    String actualResult;

    RadioButtonDemoPage.clickRadioButtonGender(expectedGender);
    RadioButtonDemoPage.clickRadioButtonAge(expectedAge);
    RadioButtonDemoPage.clickButtonGetCheckedValues();

    actualResult = RadioButtonDemoPage.readMessageOfGenderAge();

    Assert.assertTrue(
      actualResult.contains(expectedGender),
      String.format(
        "Actual: %s; Expected %s",
        actualResult,
        expectedGender
      )
    );

    Assert.assertTrue(
      actualResult.contains(expectedAge),
      String.format(
        "Actual: %s; Expected %s",
        actualResult,
        expectedAge
      )
    );
  }

  @AfterMethod
  public void close() {
    RadioButtonDemoPage.close();
  }
}


//input[@id='check1']