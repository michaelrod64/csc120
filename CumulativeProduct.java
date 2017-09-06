import java.util.*;

public class CumulativeProduct{
	public static void main(String[] args) {
	user();	
	}
	
	public static void user() {
		Scanner console = new Scanner(System.in);
		int numberMultiplied = 1;
		int product = 1;
		
		while (numberMultiplied > 0) {
				System.out.print("Type in a number to be multiplied ");
				numberMultiplied = console.nextInt();
				if (numberMultiplied > 0) {
				product *= numberMultiplied;
			}
		}
		System.out.println("the product is: " + product);
		
	}
}