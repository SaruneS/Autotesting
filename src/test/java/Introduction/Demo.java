package Introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void test01(){
        String expectedResult = "Sarune";
        String actualResult = "Sarune";

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void test02(){
        String expectedResult = "Sarune";
        String actualResult = "Srune";

        Assert.assertTrue(
                actualResult == expectedResult,
                String.format(
                        "actual: %s, expected: %s, ",
                        actualResult,
                        expectedResult
                )
                );
    }
}
