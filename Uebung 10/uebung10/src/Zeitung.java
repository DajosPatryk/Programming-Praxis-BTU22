/**
 * Schnittstelle Zeitung.
 * Param preis: Der Preis.
 */
public class Zeitung extends KioskInhalt implements Kaufbar {
    private double preis;

    public Zeitung(String name) {
        super(name);
        this.preis = 0.50;
    }
    @Override
    public double getPreis() {
        return this.preis;
    }
    @Override
    public void setPreis(double preis) {
        this.preis = preis;
    }
}
