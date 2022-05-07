public class Zoo {
    public static void main(String[] args) {
        Tier[] tiere = new Tier[4];
        tiere[0] = new Elefant();
        tiere[1] = new AfrikanischerElefant();
        tiere[2] = new Löwe();
        tiere[3] = new Wolf();
        inspiziereTiere(tiere);
    }

    public static void inspiziereTiere(Tier[] tiere) {
        for (int i = 0; i < tiere.length; i++) {
            tiere[i].toString();
            tiere[i].schreien();
            if (tiere[i].getArt() == "Löwe") {
                System.out.println("Löwen sind nicht so cool wie Tiger.");
            }
            if (tiere[i].getClass().getName() == "Elefant") {
                ((Elefant) tiere[i]).stampfen();
            }
            if (tiere[i].getClass().getName() == "AfrikanischerElefant") {
                ((Elefant) tiere[i]).stampfen();
                ((AfrikanischerElefant) tiere[i]).zeigeMarkenZeichen();
            }
        }
    }
}
