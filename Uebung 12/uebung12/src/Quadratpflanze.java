public class Quadratpflanze {

    /**
     * Berechnet den Flächeninhalt einer Quadratpflanze.
     * @param n : Jahre der Pflanze.
     * @param m : Seitenlänge.
     * @return : Der Flächeninhalt einer Quadratpflanze.
     */
    public static double flaecheninhalt(int n, double m) {
        if (n != -1) {
            return (m * m) + (flaecheninhalt(n - 1, (m * (1.00 / 3.00))) * 3);
        }
        return 0;
    }

    /**
     * Berechnet den Umfang einer Quadratpflanze.
     * @param n : Jahre der Pflanze.
     * @param m : Seitenlänge.
     * @return : Der Umfang einer Quadratpflanze in double.
     */
    public static double umfang(int n, double m) {
        if ((n <= 0) && (n != -1)) {
            return (2 * m) + (umfang(n + 1, (m * (1.00 / 3.00))) * 3);
        } else if (n >= 0) {
            return (4 * m) + (umfang(n - n * 2 - 1, (m * (1.00 / 3.00))) * 3);
        }
        return 0;
    }
}
