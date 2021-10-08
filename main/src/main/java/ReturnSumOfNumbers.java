public class ReturnSumOfNumbers {
    public static int returnSumOfNumbersTest(int a) {
        int sum = 0;
        if (a > 1) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
        else {
            for (int i = 0; i >= a; i--){
                sum -= i;
            }
            return sum;
        }
    }
}
