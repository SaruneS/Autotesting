package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class ElementPage {
  public static void clickTextboxFromMenu() {
    Common.clickElementByAction(Locators.DemoQa.Elements.menuTextbox);
  }
}
