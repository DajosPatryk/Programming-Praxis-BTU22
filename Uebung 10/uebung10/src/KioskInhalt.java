/**
 * Enthält irgendwas. 
 * 1 Inhalt.
 * Param name: name des Inhalts.
 */
public class KioskInhalt {
    private String name = "";

    public KioskInhalt() {
        this.name = "Nothing";
    }
    public KioskInhalt(String name) {
        if (name == null) {
            this.name = "Nothing";
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
}
