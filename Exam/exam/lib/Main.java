import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Katze> lieblingstiere = new ArrayList<Katze>();
        lieblingstiere.add(new Hauskatze("Humps"));
        lieblingstiere.add(new Tiger("Pumps"));
        gebeTiereAus(lieblingstiere);

    }

    public static void gebeTiereAus(List<Katze> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            if (list.get(i) instanceof Tiger) {
                ((Tiger)list.get(i)).bruellen();
            }
        }
    }
}
