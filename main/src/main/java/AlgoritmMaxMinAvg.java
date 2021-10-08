public class AlgoritmMaxMinAvg {
    public static int[] algoritmMaxMinAvg(int[] resultArray){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int[] array = new int [3];
        for (int i = 0; i < resultArray.length; i++){
            if (resultArray[i] > max){
                max = resultArray[i];
                array[0] = max;
            }
            if (resultArray[i] < min){
                min = resultArray[i];
                array[1] = min;
            }
            sum += resultArray[i];
            array[2] = sum/resultArray.length;
        }

        return array;
    }

}