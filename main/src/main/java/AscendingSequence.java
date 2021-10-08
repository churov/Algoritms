public class AscendingSequence {
    public static int[] createArray (int a, int b, int n){
        int[] myArray = new int[(b-a)/(n)+1];
        for (int i = 0; i < myArray.length; i ++, a+=n){
            myArray[i] = a;
        }
        return myArray;
    }
}
