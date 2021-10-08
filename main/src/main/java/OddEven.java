public class OddEven {
    public static String method (int x){
        if (Math.abs(x)%2 == 1){
            return "Odd";
        }
        else if (x%2 == 0){
            return "Even";
        }
        else{
            return "Undefined";
        }
    }

}
