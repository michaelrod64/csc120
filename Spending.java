import java.util.*;

public class Spending {
	public static Scanner console;
	
	public static void main(String[] args) {
		console = new Scanner(System.in);
		
	
		
		int johnBills = spending("John");
		int janeBills = spending("Jane");
		System.out.println("John needs " + johnBills + " bills.");
		System.out.println("Jane needs " + janeBills + " bills.");
	}
	public static int spending(String name) {
		System.out.print ("How much will " + name + " be spending? ");
		double amount = console.nextDouble();
		System.out.println();
		
		int numBills = (int) (amount/ 20.0);
		if (numBills * 20.0 < amount) {
				numBills++;
		}
		return numBills;
	}
}
	