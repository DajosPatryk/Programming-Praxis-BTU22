/**
 * Creates a Turtle.
 * @param y: position Y; getY, setY; default: 1;
 * @param x: position X; getX, setX; default: 1;
 * @param angle: movement direction; getAngle, setAngle; default: 1;
 * @param down: sets visibility; getDown, setDown; default: false;
 */
public class TurtleState {
    private double x;
    private double y;
    private double angle;
    private boolean down;

    public TurtleState(double x, double y, double angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.down = false;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public boolean getDown() {
        return down;
    }
    
    public void setDown(boolean down) {
        this.down = down;
    }
}
