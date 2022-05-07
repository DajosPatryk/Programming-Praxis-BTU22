import java.util.Scanner;

public class Palindrom {

    /**
     * Der Nutzer wird nach dem Text abgefragt.
     * 
     * @param userInput: Der Input des Nutzers.
     * @param text:      Der Text des Nutzers.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Text ein: ");
        String text = userInput.nextLine();
        userInput.close();
        System.out.println(palindrom(text.toLowerCase(), text.length() - 1));
    }

    /**
     * Die Methode vergleicht die erste position mit der letzten und geht so weiter
     * bis nach 0.
     * 
     * @param text:  Der Text des Nutzers.
     * @param index: Die Position im String namens "Text".
     * @return: True wenn es ein Palindrom ist und false wenn es keines ist.
     */
    public static boolean palindrom(String text, int index) {
        if (index == -1) {
            return true;
        } else if (text.charAt(index) != text.charAt(Math.abs(index - (text.length() - 1)))) {
            return false;
        }
        return palindrom(text, index - 1);
    }
}
