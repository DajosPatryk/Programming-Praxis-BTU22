package assertions;
import java.util.List;

public class Assertions {
    public static void main(String[] args) {
        String lang = args[0];
        String day = args[1];
        try{
            assert (day.equals("Montag") || day.equals("Dienstag") || day.equals("Mittwoch") || day.equals("Donnerstag") || day.equals("Freitag")
                || day.equals("Samstag") || day.equals("Sonntag")) : day + " ist nicht bekannt.";
        }
        catch (AssertionError e) {
            System.out.println(e);
        }

        List<String> temp = WeekdayService.getWeekStrings("Deutsch");
        int pos = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (lang.toLowerCase().equals(temp.get(i).toLowerCase())) {
                pos = i;
            }
        }
        
        String expected1 = "Der Montag heißt auf Spanisch Lunes";
        String expected2 = "Der Mittwoch heißt auf Spanisch Miércoles";
        String expected3 = "Der Montag heißt auf Utopiasprache Montag";
        String result = "Der " + day + " heißt auf " + lang + " " + WeekdayService.getWeekStrings(lang).get(pos);
        assert expected1.equals(result) || expected2.equals(result) || expected3.equals(result);
        System.out.println(result);
    }
}
