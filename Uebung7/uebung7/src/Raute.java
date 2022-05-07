import java.util.Scanner;

public class Raute {
    /**
     * Der Nutzer wird nach der Breite gefragt
     * @param userInput: Die Breite des Nutzers.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Geben Sie die Breite an: ");
        int width = userInput.nextInt();
        userInput.close();
        if (width % 2 != 0) {
            raute(width, 1, "up");
        }
    }

    /**
     * Hier wird die Zeile bestimmt.
     * @param width: Die Breite angegeben von dem Nutzer.
     * @param index: Die Position in der Raute, gibt auch die Anzahl der Hash's an. Start: 1, weil 1 Hash. 
     * @param direction: Gibt an ob der index nach oben oder unten geht. 
     */
    public static void raute(int width, int index, String direction) {
        if (width == index) {
            direction = "down";
            System.out.println("");
            rauteLine(0, width, 0);
            raute(width, index - 2, direction);
        } else if (index != -1 && direction == "down") {
            System.out.println("");
            rauteLine(width - index, index, 0);
            raute(width, index - 2, direction);
        } else if (direction == "up" && index != -1) {
            System.out.println("");
            rauteLine(width - index, index, 0);
            raute(width, index + 2, direction);
        }
    }

    /**
     * Hier wird eine Zeile berechnet und ausgegeben.
     * @param spaces: Gibt an wieviele spaces in der Zeile es gibt.
     * @param hash: Gibt an wieviele Hash's in der Zeile es noch übrig sind.
     * @param doneSpaces: Gibt an wieviele spaces schon geschrieben wurden. 
     */
    public static void rauteLine(int spaces, int hash, int doneSpaces) {
        if (spaces / 2 == doneSpaces && hash != 0) {
            System.out.print("#");
            rauteLine(spaces, hash - 1, doneSpaces);
        } else if (doneSpaces != spaces) {
            System.out.print(" ");
            rauteLine(spaces, hash, doneSpaces + 1);
        }
    }
}
