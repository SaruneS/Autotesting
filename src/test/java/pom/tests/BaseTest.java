package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pom.utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

  @BeforeMethod
  public void setUp(){

  }

  @AfterMethod
  public void close(){

  }
}
