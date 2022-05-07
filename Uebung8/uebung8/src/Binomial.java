import java.util.Scanner;

public class Binomial {
    /**
     * Berechnet den Binomialkoeffizienten in verschiedene Wege und gibt die Ergebnisse aus.
     * @param n: Oberes Wert.
     * @param k: Unteres Wert.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl n an:");
        long n = (long) input.nextInt();
        System.out.println("Geben Sie eine Zahl k an:");
        long k = (long) input.nextInt();
        System.out.println("BinomialFakultat: " + binomialFakultat(n, k));
        System.out.println("BinomialProduktQuotient: " + binomialProduktQuotient(n, k));
        System.out.println("BinomialAlternierend: " + binomialAlternierend(n, k));
        System.out.println("BinomialRekursiv: " + binomialRekursiv(n, k));
        input.close();
    }
    /**
     * Berechnet den Binomialkoeffizienten rekursiv, im Format (n / k).
     * @param n: Oberes Wert.
     * @param k: Unteres Wert
     * @return: Die berechnete Zahl im Datentyp long.
     */
    public static long binomialRekursiv(long n, long k) {
        if (k == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return binomialRekursiv(n - 1, k - 1) + binomialRekursiv(n - 1, k);
        }
    }
    /**
     * Berechnet den Binomialkoeffizienten im Format (n / k).
     * @param n: Oberes Wert.
     * @param k: Unteres Wert
     * @return: Die berechnete Zahl im Datentyp long.
     */
    public static long binomialAlternierend(long n, long k) {
        long tempResult = 1;
        for (int i = 1; i <= k; i++) {
            tempResult = tempResult * (n - i + 1) / i;
        }
        return tempResult;
    }
    /**
     * Berechnet den Binomialkoeffizienten im Format (n / k).
     * @param n: Oberes Wert.
     * @param k: Unteres Wert
     * @return: Die berechnete Zahl im Datentyp long.
     */
    public static long binomialProduktQuotient(long n, long k) {
        long tempResultN = n;
        for (int i = 1; i <= k - 1; i++) {
            tempResultN = tempResultN * (n - i);
        }
        long tempResultK = 1;
        for (int i = 1; i <= k; i++) {
            tempResultK = tempResultK * i;
        }
        return tempResultN / tempResultK;
    }
    /**
     * Berechnet den Binomialkoeffizienten im Format (n / k).
     * @param n: Oberes Wert.
     * @param k: Unteres Wert
     * @return: Die berechnete Zahl im Datentyp long.
     */
    public static long binomialFakultat(long n, long k) {
        return fak(n, n - 1) / (fak(k, k - 1) * fak(n - k, n - k - 1));
    }
    /**
     * Berechnet einzelne Fakultat.
     * @param tempResult: Das gespeicherte Ergebnis. Start: n = tempResult.
     * @param index: Der gespeicherte Index. Start: n - 1 = index. 
     * @return: Die berechnete Zahl im Datentyp long.
     */
    private static long fak(long tempResult, long index) {
        if (index != 1) {
            tempResult = tempResult * index;
            index--;
            return fak(tempResult, index);
        } else {
            return tempResult;
        }
    }
}
