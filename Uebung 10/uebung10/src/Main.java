import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static List<KioskInhalt> produkte = new ArrayList<KioskInhalt>(
    Arrays.asList(new Zeitung("Blaett"), new Kasse("EineKaSSE"), new EBookReader("Samsong")));
    private static Kiosk meinKiosk = new Kiosk("Patryk's 7/11", produkte);
    public static void main(String[] args) {
        System.out.println(meinKiosk.toString());
    }
}
