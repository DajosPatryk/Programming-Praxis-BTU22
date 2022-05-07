package assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Beinhaltet die Liste der Wochentage.
 */
public class WeekdayService {
	private static String[][] weekdayStore = {
			{"Deutsch",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"},
			{"Englisch", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
			{"Spanisch", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"},
			{"Utopiasprache",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Samstag2", "Sonntag"},
	};

	/**
	 * Gibt eine Liste der übersetzten Wochentage.
	 * @param language : Die Sprache in dem man die Wochentage will.
	 * @return : Eine Liste der Wochentage.
	 */
	public static List<String> getWeekStrings(String language) {
		int temp = 0;
		String[] temp2 = new String[0];
		while (temp < 4) {
			if (language.equals(weekdayStore[temp][0])) {
				
				temp2 = Arrays.copyOfRange(weekdayStore[temp], 1, weekdayStore[temp].length-1);
				assert temp2.length < 7;
				return Arrays.asList(temp2);
			}
			temp++;
		}
		return Arrays.asList(temp2);
	}
}
