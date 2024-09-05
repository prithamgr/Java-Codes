public class Babylonion {
    public static void main(String[] args) {
        int a = 900;
        float x = a;
        float y = 1;
        double e = 0.000001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = a / x;
        }
        System.out.println(x);
    }
}
