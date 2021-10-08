public class ArrayAlgoritm {
    public static int[] arrayAlgoritm (int[] array){
        int[] evenArray = new int[array.length/2];
        for (int i = 0, b = 1; i < evenArray.length; i++, b += 2) {

            evenArray[i] = array[b];

        }
        return evenArray;
    }
}
