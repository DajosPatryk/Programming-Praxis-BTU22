import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie Ihre erste Zahl ein: ");
        int a = input.nextInt();
        System.out.println("Geben Sie Ihre zweite Zahl ein: ");
        int b = input.nextInt();

        System.out.println("Schleife1: " + Subtraktion.subtrahiere(a, b));
        System.out.println("Schleife2: " + Subtraktion.schleife2(a, b));
        System.out.println("Schleife3: " + Subtraktion.schleife3(a, b));
        System.out.println("Rekursiv: " + Subtraktion.rekursiv(a, b));
    }
}
