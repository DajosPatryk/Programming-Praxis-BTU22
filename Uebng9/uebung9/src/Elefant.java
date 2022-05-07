public class Elefant extends Tier{
    public Elefant() {
        setName("Hannah");
        setArt("Elefant");
        setAlter(1);
        setSchreiverhalten(new Troeten());
    }

    public void stampfen() {
        System.out.println("Wenn er auf den Boden stampft, erzittert die Erde.");
    }
}
