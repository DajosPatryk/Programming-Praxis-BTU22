public class Potenzen {
    public static double potenzBerechnen(double a, double b) {
        if (b == 1) {
            return a;
        }
        return Math.pow(a, Math.floor(b / 2)) * Math.pow(a, Math.ceil(b / 2));
    }
}
