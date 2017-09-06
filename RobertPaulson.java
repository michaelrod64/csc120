import java.util.*;

public class RobertPaulson {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = console.nextLine();
		System.out.println();
		System.out.print("How many times should I repeat the phrase? ");
		int number = console.nextInt();
		System.out.println();
		for (int i = 1; i <= number; i++) {
			System.out.println(phrase);
		}
	}
}
		