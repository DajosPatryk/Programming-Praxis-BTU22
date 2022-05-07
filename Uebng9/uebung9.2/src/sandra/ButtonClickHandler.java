package sandra;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
/** 
 * Die Klasse handlet die Klicks.
 */
public class ButtonClickHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent arg0) {
        GUI.clickcounter++;
        GUI.lbl.setText(GUI.clickcounter + "Clicks");
        GUI.drawCircle();
    }

}
