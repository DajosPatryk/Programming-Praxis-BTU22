import java.util.Scanner;

public class Subtraktion {
    public static void main(String[] args) {
        double a = getRandomInt(50, 100);
        double b = getRandomInt(0, 50);
        Scanner input = new Scanner(System.in);
        System.out.println("Was ist die Subtraktion von Wert " + a + " und Wert " + b + " ?");
        double usertemp = input.nextDouble();
        System.out.println((a - b) == usertemp);
        System.out.println("Tatsächlicher Wert: " + (a - b));
        input.close();
    }

    private static double getRandomInt(double min, double max) {
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min) + min);
    }
}
