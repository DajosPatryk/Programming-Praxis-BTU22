/**
 * Ein Bruch Objekt im Format (Zähler/Nenner).
 */
public class Bruch {
    private int zaehler;
    private int nenner;

    /**
     * Hier wird das Objekt "Bruch" durch mit einem Parameter initialisiert. 
     * Nenner: 2, weil es das einfachste ist. 
     * @param newBruch: Die weitergeleitete Zahl.
     */
    public Bruch(int newBruch) {
        this(newBruch * 2, 2);
    }

    public Bruch(int newZaehler, int newNenner) {
        if (newZaehler != 0 && newNenner != 0) {
            this.zaehler = newZaehler;
            this.nenner = newNenner;
        }
    }

    /**
     * Der Bruch wird in ein String umgewandelt.
     */
    public String toString() {
        return "(" + this.zaehler + " / " + this.nenner + ")";
    }
    /**
     * Der Zähler des Bruchs wird aufgerufen.
     */
    public int getZaehler() {
        return this.zaehler;
    }
    /**
     * Der Nenner des Bruchs wird aufgerufen.
     */
    public int getNenner() {
        return this.nenner;
    }

    /**
     * Hier werden zwei Brüche addiert.
     * @param a: Der erste Bruch.
     * @param b: Der zweite Bruch.
     * @return: Der addierte Bruch.
     */
    public static Bruch add(Bruch a, Bruch b) {
        return new Bruch((a.getZaehler() * b.getNenner()) + (b.getZaehler() * a.getNenner()),
                a.getNenner() * b.getNenner());
    }
    
    /**
     * Hier werden zwei Brüche subtrahiert.
     * @param a: Der erste Bruch.
     * @param b: Der zweite Bruch.
     * @return: Der subtrahierte Bruch.
     */
    public static Bruch sub(Bruch a, Bruch b) {
        return new Bruch((a.getZaehler() * b.getNenner()) - (b.getZaehler() * a.getNenner()),
                a.getNenner() * b.getNenner());
    }
    /**
     * Hier werden zwei Brüche multipliziert.
     * @param a: Der erste Bruch.
     * @param b: Der zweite Bruch.
     * @return: Der multiplizierte Bruch.
     */
    public static Bruch mul(Bruch a, Bruch b) {
        return new Bruch(a.getZaehler() * b.getZaehler(), a.getNenner() * b.getNenner());
    }
    /**
     * Hier werden zwei brüche dividiert.
     * @param a: Der erste Bruch.
     * @param b: Der zweite Bruch.
     * @return: Der dividierte Bruch.
     */
    public static Bruch div(Bruch a, Bruch b) {
        return new Bruch(a.getZaehler() * b.getNenner(), a.getNenner() * b.getZaehler());
    }
    /**
     * Hier wird der dezimal Wert des Bruchs ausgegeben.
     * @param a: Der Bruch.
     * @return: Der dezimal Wert des Bruchs in double. 
     */
    public double decimalValue() {
        return (double) (this.zaehler) / (double) (this.nenner);
    }
    /**
     * Hier wird der Bruch umgekehrt.
     * @param a: Der Bruch.
     * @return: Der umgekehrte Bruch.
     */
    public Bruch reziproke() {
        return new Bruch(this.nenner, this.zaehler);
    }
    /**
     * Hier wird der Bruch so viele male wie möglich durch 2 oder 3 rekursiv gekürzt. 
     * @param a: Der Bruch.
     * @return: Der gekürzte bruch.
     */
    public Bruch shorten() {
        if (this.zaehler % 2 == 0 && this.nenner % 2 == 0) {
            this.zaehler = this.zaehler / 2;
            this.nenner = this.nenner / 2;
            this.shorten();
        } else if (this.zaehler % 3 == 0 && this.nenner % 3 == 0) {
            this.zaehler = this.zaehler / 3;
            this.nenner = this.nenner / 3;
            this.shorten();
        }
        return this;
    }
}
