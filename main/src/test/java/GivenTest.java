import org.junit.Assert;
import org.junit.Test;

public class GivenTest {
    @Test
    public void givenTest1 (){
        int m = 5;
        String x = "Poor Number";
        Assert.assertEquals(x, Given.given(m));

    }
}
