import org.junit.Assert;
import org.junit.Test;

public class ArrayAlgoritmTest {
    @Test
    public void arrayAlgoritmTest1(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        Assert.assertArrayEquals(expectedResult, ArrayAlgoritm.arrayAlgoritm(array));
    }

}
