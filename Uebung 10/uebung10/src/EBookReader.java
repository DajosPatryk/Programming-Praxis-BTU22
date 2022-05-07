/**
 * Schnittstelle E-BookReader.
 * Verbraucht Strom.
 * Param preis: Der Preis.
 */
public class EBookReader extends KioskInhalt implements Kaufbar, Elektronisch{
    private double preis;

    public EBookReader(String name) {
        super(name);
        this.preis = 55;
    }

    @Override
    public double getPreis() {
        return this.preis;
    }

    @Override
    public void setPreis(double preis) {
        this.preis = preis;
    }
    @Override
    public double getStromverbrauch() {
        return 0.25;
    }
}
