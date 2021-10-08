import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;

public class AscendingSequenceTest {
    @Test
    public void ascendingSequenceTest1 (){
        int[] expectedResult =  {10, 15, 20, 25};
        Assert.assertArrayEquals(expectedResult, AscendingSequence.createArray(10, 25, 5));
    }

    @Test
    public void ascendingSequenceTest2 (){
        int[] expectedResult =  {-1};
        Assert.assertArrayEquals(expectedResult, AscendingSequence.createArray(10, -25, -5));
    }

    @Test
    public void ascendingSequenceTest3 (){
        int[] expectedResult =  {-1};
        Assert.assertArrayEquals(expectedResult, AscendingSequence.createArray(10, 10, 2));
    }
}
