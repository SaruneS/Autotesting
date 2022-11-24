package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {
  public static void openUrl(String url) {
    Common.openUrl(url);
  }
  public static void clickElementFromMenu() {
    Common.clickElementByAction(
      Locators.DemoQa.Home.menuElement);
  }
}
