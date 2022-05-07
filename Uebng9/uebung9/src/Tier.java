public abstract class Tier {
    private String name;
    private String art;
    private int alter;
    private Schreiverhalten schreiverhalten;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Schreiverhalten getSchreiverhalten() {
        return schreiverhalten;
    }

    public void setSchreiverhalten(Schreiverhalten schreiverhalten) {
        this.schreiverhalten = schreiverhalten;
    }

    public void feiereGeburtstag() {
        this.alter++;
    }

    public void schreien() {
        schreiverhalten.schreien();
    }

    public String toString() {
        return this.name + ", der " + this.art;
    }
}
