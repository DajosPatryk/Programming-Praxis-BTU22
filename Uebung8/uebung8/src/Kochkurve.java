import java.util.Scanner;

/**
 * Zeichnet eine Kochkurve
 * @param level: Die Stufe der Kochkurve.
 */
public class Kochkurve {
    private static Turtle drawingTurtle;
    private static LineFrame canvas;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        canvas = new LineFrame("Kochkurve");
        drawingTurtle = new Turtle(canvas, 0.10, 0.75, 0);
        System.out.println("Kochkurve Stufe: ");
        int level = input.nextInt();
        double triangleSize = 0.7;
        drawingTurtle.penDown();
        renderSide(0, triangleSize, level);
        drawingTurtle.turn(-120);
        renderSide(0, triangleSize, level);
        drawingTurtle.turn(-120);
        renderSide(0, triangleSize, level);
    }

    /**
     * Zeichnet eine Seite der Kochkurve rekursiv.
     * @param index: Auf welcher Stufe der Kochkurve sich die Methode befindet.
     * @param sideSize: Die groesse einer Seite dieser Stufe.
     * @param level: Die maximale Stufe der Kochkurve. 
     */
    public static void renderSide(int index, double sideSize, int level) {
        if (index != level) {
            renderSide(index + 1, sideSize / 3, level);
            drawingTurtle.turn(60);
            renderSide(index + 1, sideSize / 3, level);
            drawingTurtle.turn(-120);
            renderSide(index + 1, sideSize / 3, level);
            drawingTurtle.turn(60);
            renderSide(index + 1, sideSize/3, level);
        } else {
            drawingTurtle.forward(sideSize);
        }
    }
}
