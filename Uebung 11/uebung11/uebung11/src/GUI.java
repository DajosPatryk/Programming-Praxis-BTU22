import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.*;

/**
 * Die Benutzer oberfläche.
 */
public class GUI extends Application{
    public static VBox uiGroup = new VBox();
    public static Button save = new Button("Save");
    public static Button read = new Button("Read");
    public static TextField txtfield = new TextField("Dateiname");
    public static TextArea txtarea = new TextArea("Inhalt");
    public static Label lbl = new Label("Errors kommen hierhin.");
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("IO");

        save.setOnAction(actionEvent -> {
            try{
                lbl.setText(IOString.schreibeInDatei(txtarea.getText(), txtfield.getText()));
            } catch (Exception e) {
                lbl.setText(e.toString());
            }
        });
        read.setOnAction(actionEvent -> {
            try {
                txtarea.setText(IOString.leseAusDatei(txtfield.getText()));
            } catch (Exception e) {
                lbl.setText(e.toString());
            }
        });

        uiGroup.getChildren().add(save);
        uiGroup.getChildren().add(read);
        uiGroup.getChildren().add(txtfield);
        uiGroup.getChildren().add(txtarea);
        uiGroup.getChildren().add(lbl);
        arg0.setScene(new Scene(uiGroup, 1920, 1080, Color.BLACK));
        arg0.show();
    }
}
