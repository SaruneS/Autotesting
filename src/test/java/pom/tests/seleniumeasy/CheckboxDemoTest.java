package pom.tests.seleniumeasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.Locators;
import pom.pages.seleniumeasy.CheckboxDemoPage;

public class CheckboxDemoTest {

  @BeforeMethod
  public void setUp() {
    CheckboxDemoPage.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
  }

  @Test
  public void testCheckBox() {
    String expectedResult = "Success";
    String actualResult = "";

    CheckboxDemoPage.clickSingleCheckbox();
    actualResult = CheckboxDemoPage.readMessage();
    CheckboxDemoPage.sleep(3000);

    Assert.assertTrue(
      actualResult.contains(expectedResult),
      String.format(
        "Actual: %s; Expected %s",
        actualResult,
        expectedResult
      )
    );
  }

  @DataProvider(name = "multipleCheckBoxDataProvider")
  public Object[][] dataProviderRadioButtonGroup() {
    return new Object[][]{
      {"Uncheck All", true},
      {"Check All", false}
    };
  }

  @Test(dataProvider = "multipleCheckBoxDataProvider")
  public void testMultipleCheckBox(String expectedAttributeValue, boolean expectedCheckboxStatus){

    String attributeName = "value";
    String actualAttributeValue;
    boolean isCheckBoxesSelected;

    CheckboxDemoPage.clickButtonCheck();
    if (!expectedCheckboxStatus)CheckboxDemoPage.clickButtonCheck();

    actualAttributeValue = CheckboxDemoPage.readButtonText(attributeName);

    isCheckBoxesSelected = CheckboxDemoPage.checkIfAllCheckboxesAreSelected(expectedCheckboxStatus);

    Assert.assertTrue(
      actualAttributeValue.contains(expectedAttributeValue),
      String.format(
        "Actual: %s; Expected %s",
        actualAttributeValue,
        expectedAttributeValue)
      );

    Assert.assertTrue(isCheckBoxesSelected);
  }


  @AfterMethod
  public void close() {
    CheckboxDemoPage.close();

  }
}
