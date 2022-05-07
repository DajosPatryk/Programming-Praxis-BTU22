/**
 * Die Main Klasse rechnet die Rechenaufgaben aus Aufgabe 4 Nummer 6 aus und gibt diese aus.
 */
public class Main {
    public static void main(String[] args) {
        Bruch bruch1 = new Bruch(1, 5);
        Bruch bruch2 = new Bruch(3);
        Bruch bruch3 = new Bruch(5, 2);

        Bruch result1 = Bruch.sub(Bruch.add(bruch1, bruch2), bruch3);
        Bruch result2 = Bruch.mul(result1, Bruch.div(bruch2, bruch3));

        System.out.println("Normal: " + result1.toString());
        System.out.println("Gekürzt: " + result1.shorten());
        System.out.println("Dezimalzahl: " + result1.decimalValue());

        System.out.println("Normal: " + result2.toString());
        System.out.println("Gekürzt: " + result2.shorten());
        System.out.println("Dezimalzahl: " + result2.decimalValue());
    }
}
