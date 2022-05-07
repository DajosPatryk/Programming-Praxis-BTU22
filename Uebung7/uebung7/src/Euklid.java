import java.util.Scanner;

public class Euklid {
    /**
     * Hier wird der Nutzer nach Zahlen gefragt.
     * @param a: Die erste Z/ahl.
     * @param b: Die zweite Zahl.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Geben Sie Ihre erste Zahl an: ");
        int a = userInput.nextInt();
        System.out.println("Geben Sie Ihre zweite Zahl an: ");
        int b = userInput.nextInt();
        userInput.close();
        System.out.println("Euklid: " + ggt(a, b));
    }

    /**
     * Hier wird der größter gemeinsamer Teiler rekursiv berechnet.
     * @param a: Die erste Zahl.
     * @param b: Die zweite Zahl.
     * @return: Der größter gemeinsamer Teiler, ruft sich selber auf.
     */
    public static double ggt(double a, double b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return ggt(a - b, b);
        } else {
            return ggt(a, b - a);
        }
    }
}
