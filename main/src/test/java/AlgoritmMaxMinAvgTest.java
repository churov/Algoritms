import org.junit.Assert;
import org.junit.Test;

public class AlgoritmMaxMinAvgTest {
    @Test
    public void algoritmMaxMinAvgTest1 (){
        int[] array = {1,2,3,4,5};
        int[] expectedResult = {5, 1, 3};
        Assert.assertArrayEquals(expectedResult, AlgoritmMaxMinAvg.algoritmMaxMinAvg(array));
    }

    @Test
    public void algoritmMaxMinAvgTest2 (){
        int[] array = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};
        Assert.assertArrayEquals(expectedResult, AlgoritmMaxMinAvg.algoritmMaxMinAvg(array));
    }

}
