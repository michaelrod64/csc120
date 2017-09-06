

public class Mango {
	private String kind;
	private int height;
	private int price;
	
	public Mango(String kind, int height, int price) {
		this.kind = kind;
		this.height = height;
		this.price = price;
	}
	
	public String getKind() {
		return this.kind;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public boolean grow() {
		boolean trimTree = false;
		this.height += (height) * (.05 + Math.random() * .10); 
		if (height > 260) {
			trimTree = true;
			this.height = 150;
		}
		return trimTree;
	}
	
	public void appreciate() {
		this.price += (this.price * .01);
	}
	
	public boolean process() {
	appreciate();
	return grow();
	}
	
	public int getHarvest() {
		int harvest = 0;
		harvest += (int) (height * 2 * this.price);
		return harvest;
	}
}
			