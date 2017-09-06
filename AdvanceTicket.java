public class AdvanceTicket extends Ticket {
	
	private double price;
	
	public AdvanceTicket(int number, int days) {
		super(number);
		if (days >= 10) {
			this.price = 30.00;
		}
		else {
			this.price = 40.00;
		}
	}
	
	
	