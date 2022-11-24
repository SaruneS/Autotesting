package pom.pages;

import org.openqa.selenium.By;

public class Locators {

  public static class DemoQa {

    public static class TextBox {
      public static By inputFullName = By.xpath("//input[@id='userName']");
      public static By buttonSubmit = By.xpath("//button[@id='submit']");
      public static By paragraphFullName = By.xpath("//p[@id='name']");
    }

    public static class Home {
      public static By menuElement = By.xpath("//div[@class='category-cards']//*[text()='Elements']");
    }

    public static class Elements {
      public static By menuTextbox = By.xpath("//*[text()='Text Box']");
    }

    public static class Buttons {
      public static By buttonDoubleClick = By.xpath("//*[@id='doubleClickBtn']");
      public static By paragraphDoubleClick = By.xpath("//p[@id='doubleClickMessage']");
      public static By buttonRightClick = By.xpath("//button[@id='rightClickBtn']");
      public static By paragraphRightClick = By.xpath("//p[@id='rightClickMessage']");
    }
  }

  public static class SeleniumEasy {

    public static class CheckboxDemo {
      public static By checkBox =
        By.xpath("//input[@id = 'isAgeSelected']");
      public static By textAge =
        By.xpath("//div[@id = 'txtAge']");

      public static By buttonCheck = By.xpath("//input[@id='check1']");
      public static By multipleCheckBox = By.xpath("//input[@id='cb1-element']");
    }

    public static class DropdownListDemo {
      public static By selectDayOfWeek =
        By.xpath("//select[@ id = 'select-demo']");
      public static By paragraphSelectMessage =
        By.xpath("//*contains(text(),'Day selected')])[1]");
    }

    public static class RadioButtonDemo {

      public static By buttonCheckedValue = By.xpath("//*[@id='buttoncheck']");
      public static By paragraphCheckedValue = By.xpath("//p[@class='radiobutton']");
      public static By buttonGetValues = By.xpath("//button[@class = 'btn btn-default' and @onclick='getValues();']");
      public static By paragraphGenderAndAge = By.xpath("//p[@class = 'groupradiobutton']");

      public static By inputRadioButton(String gender) {
        return By.xpath("//*[@value = '" + gender + "' and @name='optradio']");
      }

      public static By inputGender(String gender) {
        return By.xpath("//*[@value = '" + gender + "' and @name='gender']");
      }

      public static By inputAge(String age) {
        return By.xpath("//*[@value = '" + age + "' and @name='ageGroup']");
      }
    }
  }

}
