public class AfrikanischerElefant extends Elefant {
    public AfrikanischerElefant() {
        new Elefant();
    }

    public void zeigeMarkenZeichen() {
        System.out.println(getName() + " wackelt mit seinen großen Ohren.");
    }
    
    public String toString() {
        return getName() + ", der Afrikanischer Elefant";
    }
}
