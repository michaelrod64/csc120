public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		setLocation(x, y);
	}
	
	public Point(Object p) {
		Point other = checkObject(p)
		setLocation(other.getX(), other.getY());
	}
	
	public void checkObject(Object check) {
		if (!(check instanceof Point)) {
			throw new IllegalArgumentException();
		}
		Point other = (Point) check;
		return other;
	}
	
	public double getSlope(Object p) {
		Point other = checkObject(p);
		if (other.getX() == this.x) {
			throw new IllegalArgumentException();
		}
		return ((other.getY() - this.y)/(other.getX() - this.x))
	}
	
	public boolean isColinear(Object p1, Object p2) {
		double other1Slope = (double)Math.round(getSlope(p1) * 10000) / 10000;
		double other2Slope = (double)Math.round(getSlope(p2) * 10000) / 10000;
		return other1Slope == other2Slope;
	}
		
	
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double getDistance(Object p) {
		Point other = checkObject(p);
		return Math.sqrt(Math.pow((other.getX() - this.x) , 2) +
				Math.pow((other.getY() - this.y) , 2));
	}
	
	public int getManhattanDistance(Object other) {
		Point other = checkObject(p);
		return Math.abs(other.getX() - this.x)  + Math.abs(other.getY() - this.y);
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean equals(Object o) {
		Point other = checkObject(o);
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
		return "java.awt.Point[x=" + this.x + ", y=" + this.y + "]";
	}
	
	public static Point parsePoint(String str) {
		int initialX = 0
		int initialY = 0
		int i = 0
		while (initialX = 0) {
			char c = string.charAt(i)
			if(boolean isDigit = (c >= '0' && c <= '9')) {
				initialX = str.charAt(i)
			}
			i++
		}
		while (initialY = 0) {
			char d = string.charAt(i)
			if(isDigit = (d >= '0' && d <= '9')) {
				initialY = str.charAt(i)
			}
		}
		return new Point(initialX, initialY);
	}
			
			
	
	
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}
}

	