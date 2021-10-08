import org.junit.Assert;
import org.junit.Test;

public class ComparingNumbersTest {
    @Test
    public void comparingNumbersTest1 (){
        int a = 89;
        int b = 89;
        Assert.assertEquals(0, ComparingNumbers.comparingNumbers(a, b));
    }
    @Test
    public void comparingNumbersTest2 (){
        int a = -89;
        int b = 89;
        Assert.assertEquals(-1, ComparingNumbers.comparingNumbers(a, b));
    }
    @Test
    public void comparingNumbersTest3 (){
        int a = 89;
        int b = -89;
        Assert.assertEquals(1, ComparingNumbers.comparingNumbers(a, b));
    }
}
