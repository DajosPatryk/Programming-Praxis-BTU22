import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * Ist ein ButtonClickHandler.
 */
public class ButtonClickHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent arg0) {
        GUI.setCounter((GUI.getCounts() + 1) + " Klicks");
        GUI.setCounts(GUI.getCounts() + 1);
        GUI.addCircle();
    }
    
}
