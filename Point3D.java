public class Point3D extends Point {
	private int z;
	
	public Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public Point3D() {
		this(0, 0, 0);
	}
	
	public int getZ() {
		return z;
	}
}

	
	

