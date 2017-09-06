public class Point2 {
	private int x;
	private int y;
	
	public Point2() {
		this(0, 0);
	}
	
	public Point2(int x, int y) {
		setLocation(x, y)
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Point2)) {
			return false;
		}
		
		Point2 other = (Point2) o;
		return x == other.x && y == other.y;
	}
	
	public void setLocation(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}
	
	
	