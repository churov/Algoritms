import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void oddEvenTest() {
        String expResult = "Odd";
        Assert.assertEquals(expResult, OddEven.method(-345));

    }
    @Test
    public void oddEvenTest1() {
        String expResult = "Even";
        Assert.assertEquals(expResult, OddEven.method(0));
    }
    @Test
    public void oddEvenTest2() {
        String expResult = "Even";
        Assert.assertEquals(expResult, OddEven.method(22222));
    }
    @Test
    public void oddEvenTest3() {
        String expResult = "Undefined";
        Assert.assertEquals(expResult, OddEven.method(2147483647 +1));
    }
}
