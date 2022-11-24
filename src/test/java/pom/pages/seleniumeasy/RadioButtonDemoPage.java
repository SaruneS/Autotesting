package pom.pages.seleniumeasy;
import pom.pages.Common;
import pom.pages.Locators;

public class RadioButtonDemoPage {
  public static void setUp(String url) {
    Common.openUrl(url);
  }
  public static void close() {
    Common.close();
  }
  public static void clickRadioButton(String gender) {
    Common.clickElement(
      Locators.SeleniumEasy.RadioButtonDemo.inputRadioButton(gender)
    );
  }
  public static void clickGetCheckedValue() {
    Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.buttonCheckedValue);
  }

  public static String readMessageCheckedValue() {
    return Common.getText(Locators.SeleniumEasy.RadioButtonDemo.paragraphCheckedValue);
  }

  public static void clickRadioButtonGender(String gender) {
    Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputGender(gender));
  }

  public static void clickRadioButtonAge(String age) {
    Common.clickElement(
      Locators.SeleniumEasy.RadioButtonDemo.inputAge(age));
  }

  public static void clickButtonGetCheckedValues() {
    Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.buttonGetValues);
  }

  public static String readMessageOfGenderAge() {
    return Common.getText(Locators.SeleniumEasy.RadioButtonDemo.paragraphGenderAndAge);
  }
}