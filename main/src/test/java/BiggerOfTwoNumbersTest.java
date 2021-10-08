import org.junit.Assert;
import org.junit.Test;

public class BiggerOfTwoNumbersTest {
    @Test
    public void biggerOfTwoNumbersTest1(){
        int a = 3333;
        int b = 9999;
        Assert.assertEquals(9999, BiggerOfTwoNumbers.bigger(a, b));
    }
}
