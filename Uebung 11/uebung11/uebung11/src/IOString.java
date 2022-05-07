import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Schreibt und öffnet Dateien
 */
public class IOString {
    /**
     * Schreibt in eine datei.
     * @param text : Inhalt der Datei.
     * @param name : name des Datei.
     * @return : Einen "OK". :)
     * @throws Exception : Wenn was schief läuft.
     */
    public static String schreibeInDatei(String text, String name) throws Exception {
        try {
            FileWriter fw = new FileWriter(name);
            fw.write(text);
            fw.close();
            return "OK";
        } catch (IOException e) {
            throw new Exception(e);
        }
    }

    /**
     * Öffnet eine Datei.
     * @param name : Name der Datei.
     * @return : Den Inhalt der Datei in String.
     * @throws Exception : Wenn was schief läuft.
     */
    public static String leseAusDatei(String name) throws Exception {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                result.append(sCurrentLine).append("\n");
            }
            return result.toString();
        } catch (IOException e) {
            throw new Exception(e);
        }
    }
}
