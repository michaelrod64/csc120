public class StudentAdvanceTicket extends AdvanceTicket {
	
	private double price;
	
	public StudentAdvanceTicket(int number, int days) {
		super(number, days);
		super.price = super.getPrice() / 2;
	}

	public String toString() {
		return super.toString() + " (ID required)";
	}
}