import java.util.List;

/**
 * Ist ein Kiosk der Sachen enthält.
 * Param name: Name des Kiosks.
 * Param inhalt: enthält Sachen vom typ KioskInhalt.
 */
public class Kiosk{
    private String name = "";
    private List<KioskInhalt> inhalt;
    private KioskInhalt example = new KioskInhalt();
    KioskInhalt.getClass();

    public Kiosk(String name, List<KioskInhalt> inhalt) {
        this.name = name;
        this.inhalt = inhalt;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String temp = this.name + " Kiosk Inventar: ";
        for (int i = 0; i < inhalt.size(); i++) {
            if (inhalt.get(i).getClass().getName() == "Zeitung") {
                temp = temp + ", " + i + ":(" + inhalt.get(i).getName() + " Zeitung, " + "Preis:"
                        + ((Zeitung) inhalt.get(i)).getPreis() + ")";
            }
            if (inhalt.get(i).getClass().getName() == "EBookReader") {
                temp = temp + ", "
                        + i + ":(" + inhalt.get(i).getName() + " EBookReader, " + "Preis:"
                        + ((EBookReader) inhalt.get(i)).getPreis() + ", Stromverbrauch: "
                        + ((EBookReader) inhalt.get(i)).getStromverbrauch() + ")";
            }
            if (inhalt.get(i).getClass().getName() == "Kasse") {
                temp = temp + ", "
                        + i + ":(" + inhalt.get(i).getName() + " Kasse, "
                        + "Stromverbrauch: "
                        + ((Kasse) inhalt.get(i)).getStromverbrauch() + ")";
            }
        }
        return temp;
    }
}
