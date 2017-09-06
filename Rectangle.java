public class Rectangle {
	private int x;
	private int y;	
	private int width;
	private int height;
	
	
	public Rectangle (int x, int y, int width, int height) {
		if (width < 0 || height < 0) {
			throw new IllegalArgumentException;
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point p, int width, int height) {
		Rectangle(p.getX(), p.getY(), width, height);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return "Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width 
				+ ",height=" + this.height + "]";
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Rectangle)) {
			throw new IllegalArgumentException;
		}
		Rectangle other = (Rectangle) o;
		return other.getWidth() == this.width && other.getHeight() == this.height
		&& other.getX() == this.x && other.getY == this.y;
	}
	
	public boolean contains(int x, int y) {
		return (x >= this.x && x <= this.x + this.width) && (y >= this.y && y 
				<= this.y + height);
	}
	
	public boolean contains(Point p) {
		contains(p.getX(), p.getY()) 
	}

	public Rectangle union(Rectangle rect)  {
		Rectangle temp = new Rectangle(0, 0, 0, 0);
		temp.setX( Math.min(this.x, rect.getX()))
		temp.setY( Math.max(this.y, rect.getY()))
		temp.setWidth((this.width + rect.width) + (rect.getX() - this.x)
		
		