package pom.pages.seleniumeasy;

import pom.pages.Common;
import pom.pages.Locators;

public class DropdownListDemoPage {
  public static void openUrl(String url) {
    Common.openUrl(url);
  }

  public static void close() {
    Common.close();
  }

  public static void selectDayFromDropdownList(String dayOfWeek) {
    Common.selectOptionsByValue(
      Locators.SeleniumEasy.DropdownListDemo.selectDayOfWeek,
      dayOfWeek
    );
  }

  public static String readMessageSelectListDemo() {
    return Common.getText(Locators.SeleniumEasy.DropdownListDemo.paragraphSelectMessage);
  }

}
