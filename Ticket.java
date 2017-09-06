public abstract class Ticket {
	private int number;
	
	public Ticket (int number) {
		this.number = number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + number + " Price: " + price;
	}
}
		