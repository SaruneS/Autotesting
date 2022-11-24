package Introduction;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestClasswork {

  // Testas 1
  @Test
  public void testIfNumber995DividesFrom3WithoutReminder() {
    //1. Duomenys
    int inputA = 995;
    int inputB = 3;
    int expectedResult = 0;
    int actualResult;

    //2. Testo veikmas
    actualResult = inputA % inputB;

    //3. Tikrinam rezultatus

    Assert.assertEquals(actualResult, expectedResult);
  }

  //Testas 2
  @Test
  public void testIfTodayIsWednesday() {
    DayOfWeek expectedResult = DayOfWeek.THURSDAY;
    DayOfWeek actualResult;

    actualResult = LocalDate.now().getDayOfWeek();

    Assert.assertEquals(
      actualResult,
      expectedResult,
      String.format(
        "Actual: %s; Expected: %s",
        actualResult,
        expectedResult
      )
    );

    Assert.assertTrue(
      actualResult.equals(expectedResult),
      String.format(
        "Actual: %s; Expected: %s",
        actualResult,
        expectedResult
      )
    );
  }

  //Testas3
  @Test
  public void testIfSentenceContainsSomeText() {
    String expectedResult = "namo";
    String actualResult = "noriu namo";

    Assert.assertTrue(
      actualResult.contains(expectedResult),
      String.format(
        "Actual: %s;%n Expected: %s",
        actualResult,
        expectedResult
      )
    );

  }

  //Testas4
  @Test
  public void testWaitFor5Seconds() {
    int sleepTime = 5;
    try {
      for (int i : new int[5]) {
        i++;
      }
      System.out.println("Sleeping " + sleepTime + "s");
      Thread.sleep(sleepTime * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  //zalias jei nuo 1 iki 10 yra 4 lyginiai skaiciai. (dalyba moduliu is 2 = 0).\

  @Test
  public void lyginiaiSkaiciai() {
    int lyginiai = 0;

    for (int i = 1; i < 10; i++) {
      System.out.println(i);
      int liekana = i % 2;
      boolean lyginis = liekana == 0;

      if (lyginis) {
        lyginiai++;
      }
    }
    Assert.assertEquals(lyginiai, 4);
  }

  //  4 yra lyginis skaičius
  @Test
  public void lyginisSkaicius() {
    int inputC = 4;
    int inputD = 2;
    int tikimasiLiekanos = 0;
    int gaunamaLiekana;
    gaunamaLiekana = inputC % inputD;

    Assert.assertEquals(gaunamaLiekana, tikimasiLiekanos);
  }

  @Test
  public void dabartineValanda (){
    int dabartineValanda = java.time.LocalDateTime.now().getHour();
    int tikimasiValandos = 19;

    Assert.assertEquals(dabartineValanda,tikimasiValandos);
}


}

