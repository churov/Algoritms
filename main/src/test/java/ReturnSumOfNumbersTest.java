import org.junit.Assert;
import org.junit.Test;

public class ReturnSumOfNumbersTest {
    @Test
    public void returnSumOfNumbersTest1(){
        int x = 222;
        int expectedResult = 24753;
        Assert.assertEquals(expectedResult, ReturnSumOfNumbers.returnSumOfNumbersTest(x));
    }
    @Test
    public void returnSumOfNumbersTest2(){
        int x = -10;
        int expectedResult = 55;
        Assert.assertEquals(expectedResult, ReturnSumOfNumbers.returnSumOfNumbersTest(x));
    }
}
