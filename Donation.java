import java.util.*;

public class Donation {
	
public static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		int sum = 1000;
		int times;
		int finalSum;
		times = intro ();
		finalSum = donation(sum, times);
		System.out.print("Your total is: " + finalSum);
		
	}	
	public static int intro() {
		System.out.print("Is your money multiplied 1 or 2 times? ");
		
		int times = console.nextInt();
		return times;
	}
		
	public static int donation(int sum, int times) {
		System.out.print("And how much are you contributing? ");
		int donation = console.nextInt();
		sum = sum + times * donation;
		return sum;
	}
}