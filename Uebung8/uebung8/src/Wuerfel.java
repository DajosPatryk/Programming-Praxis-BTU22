/**
 * Zeichnet einen Wuerfel.
 */
public class Wuerfel {
    private static Turtle drawingTurtle;
    private static LineFrame canvas;
    public static void main(String[] args) {
        canvas = new LineFrame("Würfel");
        drawingTurtle = new Turtle(canvas, 0.25, 0.75, 0);
        drawingTurtle.penDown();
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(90);
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(90);
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(90);
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(90);
        drawingTurtle.penUp();
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(45);
        drawingTurtle.penDown();
        drawingTurtle.forward(0.2);
        drawingTurtle.turn(45);
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(90);
        drawingTurtle.forward(0.4);
        drawingTurtle.turn(45);
        drawingTurtle.forward(0.2);
        drawingTurtle.penUp();
        drawingTurtle.turn(135);
        drawingTurtle.forward(0.4);
        drawingTurtle.penDown();
        drawingTurtle.turn(45);
        drawingTurtle.forward(0.2);
    }
}
