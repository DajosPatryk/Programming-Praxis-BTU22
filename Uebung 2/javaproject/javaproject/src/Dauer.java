import java.util.Scanner;

public class Dauer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie das Startkapital in EUR an.");
        double startKap = input.nextDouble();
        System.out.println("Geben sie einen Zinssatz in % an.");
        double zinssatz = input.nextDouble();
        System.out.println("Geben sie ihren gewünschten Endkapital an.");
        double endKap = input.nextDouble();
        double tempKap = startKap;
        double dauer = 0;
        if ((tempKap < endKap) || (tempKap != endKap)) {
            dauer = 1;
            while ((tempKap < endKap) || (tempKap != endKap)) {
                dauer = dauer + 1;
                tempKap = startKap * (((zinssatz / 100) * dauer) + 1);
            }
        }
        System.out.println("Es werden mindestens " + dauer + " Jahre benötigt um das Endkapital zu erreichen.");
        input.close();
    }
}
