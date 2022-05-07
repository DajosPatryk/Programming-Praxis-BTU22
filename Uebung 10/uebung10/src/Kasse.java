/**
 * Schnittstelle E-BookReader.
 * Verbraucht Strom.
 * Param preis: Der Preis.
 */
public class Kasse extends KioskInhalt implements Elektronisch {
    public Kasse(String name) {
        super(name);
    }

    @Override
    public double getStromverbrauch() {
        return 0.5;
    }
}
