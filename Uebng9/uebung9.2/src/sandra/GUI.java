package sandra;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    /**
     * Es wird ein Fenster mit Buttons, einem Textfeld, einem Label und einer Fläche
     * erstellt.
     */
    public static VBox box = new VBox();
    public static Label lbl = new Label("0 Klicks");
    public static TextField txtfld = new TextField("5");
    public static Button btn1 = new Button("Klick");
    public static Button btn2 = new Button("Setze Klicks");
    public static Canvas cnvs = new Canvas(400, 200);
    public static int clickcounter = 0;

    public static void drawCircle() {
        cnvs.getGraphicsContext2D().fillOval(20 * clickcounter, 0, 20, 20);

    }

    public static void main(String[] args) {
        launch(args);

    }

    /**
     * Es werden die vorhandenen Klicks zu den neuen Klicks addiert, und
     * entsprechend viele Ovale neu gezeichnet.
     * 
     */
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("GUI");
        btn1.setOnAction(new ButtonClickHandler());
        btn2.setOnAction(actionEvent -> {
            try {
                int k = Integer.parseInt(txtfld.getText());
                if (clickcounter != 0) {
                    drawCircle();
                    clickcounter++;
                    clickcounter--;
                }
                for (int i = 1; i <= k; i++) {
                    drawCircle();
                    clickcounter++;
                }
                lbl.setText(clickcounter + " Klicks");
            } catch (Exception e) {
                // TODO: handle exception
            }
        });
        box.getChildren().add(lbl);
        box.getChildren().add(txtfld);
        box.getChildren().add(btn1);
        box.getChildren().add(btn2);
        box.getChildren().add(cnvs);
        arg0.setScene(new Scene(box, 580, 900));

        arg0.show();

    }
}
