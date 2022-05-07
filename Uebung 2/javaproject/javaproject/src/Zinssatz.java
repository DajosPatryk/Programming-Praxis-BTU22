import java.util.Scanner;
public class Zinssatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie das Startkapital in EUR an.");
        double startKap = input.nextDouble();
        System.out.println("Geben sie einen Endkapital in EUR an.");
        double endKap = input.nextDouble();
        System.out.println("Geben sie die Dauer der Anlage in Jahren an.");
        double dauer = input.nextDouble();
        double result = (((endKap - startKap) / dauer) / startKap) * 100;
        System.out.println("Der Zinssatz lautet "+result+"%");
        input.close();
    }
}
