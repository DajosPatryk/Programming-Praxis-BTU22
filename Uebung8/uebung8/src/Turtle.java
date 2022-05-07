public class Turtle {
	private TurtleState state;
	private LineFrame lineFrame;

	/**
	 * Konstruktor der nur das LineFrame übergeben bekommt und den anderen
	 * Konstruktor mit default-Werten aufruft.
	 * 
	 * @param lineFrame: Das Visualisierungsfenster, auf dem gezeichnet wird.
	 */
	public Turtle(LineFrame lineFrame) {
		this(lineFrame, 0.5, 0.5, Math.PI / 2);
	}

	/**
	 * Konstruktor, der Werte übergeben bekommt und diese den internen Feldern
	 * zuweist.
	 * 
	 * @param lineFrame: Das Visualisierungsfenster, auf dem gezeichnet wird.
	 * @param initX: x-Position der Turtle
	 * @param initY: y-Position der Turtle
	 * @param initAngle: Ausrichtung (Winkel) der Turtle
	 */
	public Turtle(LineFrame lineFrame, double initX, double initY, double initAngle) {
		this.state = new TurtleState(initX, initY, initAngle);
		this.lineFrame = lineFrame;
	}

	/**
	 * Setzt den Stift auf dem Blatt ab.
	 */
	public void penDown() {
		state.setDown(true);
	}

	/**
	 * Hebt den Stift vom Blatt weg.
	 */
	public void penUp() {
		state.setDown(false);
	}

	/**
	 * Bewegt die Schildkröte um stepSize in die blickrichtung der Schildkröte.
	 * StepSize hat dabei einen Wert zwischen 0 und 1, wobei 1 gleich einer
	 * Bildschrimlänge entspricht.
	 * 
	 * @param stepSize: Die Schrittlänge.
	 * @param x0: Anfangskoordinate X.
	 * @param y0: Anfangskooridnate Y.
	 * @param angle0: Anfangsrichtung. 
	 * @param xRoute: Die berechnete Bewegung für die Koordinate X.
	 * @param yRoute: Die berechnete Bewegung für die Koordinate Y.
	 * @param xCalculated: Die berechnete Position für die Koordinate X.
	 * @param yCalculated: Die berechnete Position für die Koordinate Y.
	 */
	public void forward(double stepSize) {
		double x0 = state.getX();
		double y0 = state.getY();
		double angle0 = (state.getAngle() / Math.PI) * 180;
		double xRoute = stepSize * Math.cos(Math.toRadians(angle0));
		double yRoute = stepSize * Math.sin(Math.toRadians(angle0));
		double xCalculated = x0 + xRoute;
		double yCalculated = y0 + yRoute;

		if (state.getDown()) {
			lineFrame.drawLine(x0, y0, xCalculated, yCalculated);
		}
		state.setX(xCalculated);
		state.setY(yCalculated);
	}

	/**
	 * Dreht sich um den angegebenen Wert.
	 * 
	 * @param angle: Der Wert um den sich die Turtle dreht in deg.
	 */
	public void turn(double angle) {
		state.setAngle(((((state.getAngle() / Math.PI) * 180) - angle)/180)*Math.PI);
	}
}
