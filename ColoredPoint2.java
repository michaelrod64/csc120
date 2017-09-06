public class ColoredPoint2 extends Point2 implements Colored {
	private Color color;
	
	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color
	}
	
	public Color getColor() {
		return color;
	}
}