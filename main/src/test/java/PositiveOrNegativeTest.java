import org.junit.Assert;
import org.junit.Test;

public class PositiveOrNegativeTest {
    @Test
    public void positiveOrNegativeTest1(){
        int a = 555;
        Assert.assertEquals(true, PositiveOrNegative.posOrNeg(a));
    }

    @Test
    public void positiveOrNegativeTest2(){
        int a = 0;
        Assert.assertEquals(true, PositiveOrNegative.posOrNeg(a));
    }
    @Test
    public void positiveOrNegativeTest3(){
        int a = -555;
        Assert.assertEquals(false, PositiveOrNegative.posOrNeg(a));
    }
}