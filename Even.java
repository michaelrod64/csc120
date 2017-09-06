import java.util.*;

public class Even{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number: ");
		int number = console.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}
	}
}
		