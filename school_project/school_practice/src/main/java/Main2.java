public class Main2 {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 1;
        } else if (b >= c && b >= a) {
            return 2;
        } else {
            return 3;
        }
    }
}