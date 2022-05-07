public class Katze {
    protected String name;
    protected int alter;

    public Katze(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.name+ ", Alter: " + this.alter;
    }
    
}
