import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.*;

/**
 * Die Main Classe meines GUI.
 * param VBox: Eine Gruppe von UI Elementen.
 * param klick: Ein Button der ein Klick hinzufügt.
 * param counter: Ein Text der die Klicks zusammen rechnet. 
 * param counts: Integer Datentyp der die Klicks speichert.
 * param bild: Ein Canvas Element wo gezeichnet wird.
 */
public class GUI extends Application {
    // Ich habe die Variablen am anfang der Klasse hinzugefügt, damit die Klasse
    // ButtonClickHandler es leicht hat, die Variablen zu modifizieren.
    public static VBox uiGroup = new VBox();
    public static Button klick = new Button("Klick");
    public static Label counter = new Label("0 Klicks");
    public static int counts = 0;
    public static Canvas bild = new Canvas(400, 200);

    public static void setCounter(String value) {
        GUI.counter.setText(value);
    }

    public static int getCounts() {
        return counts;
    }
    public static void setCounts(int counts) {
        GUI.counts = counts;
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Zeichnet ein Kreis.
     */
    public static void addCircle() {
        bild.getGraphicsContext2D().strokeOval(counts*5, 0, 5, 5);
        bild.getGraphicsContext2D().fillOval(counts*5, 0, 5, 5);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GUI");
        //Weiterer Code
        klick.setOnAction(new ButtonClickHandler());
        Button meinZweiterButton = new Button("Setze Klicks");
        TextField txtFeld = new TextField("5");
        meinZweiterButton.setOnAction(actionEvent -> {
            try {
                int temp = Integer.parseInt(txtFeld.getText());
                for (int i = 0; i < temp; i++) {
                    GUI.addCircle();
                    GUI.counts++;
                }
                GUI.counter.setText(counts + " Klicks");
            } catch (Exception e) {
                txtFeld.setText("Das ist keine Zahl!!!");
            }
        });
        uiGroup.getChildren().add(counter);
        uiGroup.getChildren().add(txtFeld);
        uiGroup.getChildren().add(klick);
        uiGroup.getChildren().add(meinZweiterButton);
        uiGroup.getChildren().add(bild);
        
        primaryStage.setScene(new Scene(uiGroup, 1920, 1080, Color.BLACK));
        primaryStage.show();
    }
}
