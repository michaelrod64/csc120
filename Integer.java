import java.util.*;

public class Integer {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter an integer to be doubled: ");
		int integer = user.nextInt();
		multiplyInteger(integer);
	}
		public static void multiplyInteger(int integer) {
			System.out.println(integer + " times two = " + integer * 2);
		}
	
}
		