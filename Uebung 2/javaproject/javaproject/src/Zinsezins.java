import java.util.Scanner;

public class Zinsezins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie das Startkapital in EUR an.");
        double startKap = input.nextDouble();
        System.out.println("Geben sie einen Zinssatz in % an.");
        double zinssatz = input.nextDouble();
        System.out.println("Geben sie die Dauer der Anlage in Jahren an.");
        double dauer = input.nextDouble();
        System.out.println(startKap * (((zinssatz / 100) * dauer) + 1));
        input.close();
    }
}
