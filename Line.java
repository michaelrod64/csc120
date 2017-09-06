public class Line {
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}
	
	public Point getP1() {
		return this.p1;
	}
	
	public Point getP2() {
		return this.p2;
	}
	
	public String toString() {
		return "[(" + p1.getX + ", " + p1.getY + "), (" + p2.getX + ", " + p2.getY
				+ ")]";
	}
	
	public double getSlope() { 
		if (p1.getX == p2.getX) {
			throw new IllegalArgumentException
		}
		return ((double) (p2.getY - p1.getY) / (p2.getX - p1.getX))
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Line)) {
			throw new IllegalArgumentException
		}
	return (this.p1.equals(o.p1) && this.p2.equals(o.p2)) || (this.p1.equals(o.p2)
			&& this.p2.equals(o.p1))
	}
	public boolean isColinear(Point P) {
		
		double lineSlope = (double)Math.round(this.getSlope() * 10000) / 10000;
		if (this.getP1().getX() == P.getX()) {
			throw new IllegalArgumentException;
		}
		double lineToPointSlope = (double)Math.round(((this.getP1().getY() - P.getY) 
									/ (this.getP1().getX() - P.getX)) * 10000) / 10000;
									
		return lineSlope == lineToPointSlope;
	}
	
	
		