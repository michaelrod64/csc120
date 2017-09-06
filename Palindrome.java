import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		String[] frats = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
		if (isPalindrome(frats)) {
			System.out.print("This array is a Palindrome");
		}
		else {
			System.out.println("This array is not a Palindrome");
		}
	}
	public static boolean isPalindrome(String[] frats) {
		for (int i = 0; i < frats.length; i++) {
			if (!frats[i].equals(frats[frats.length - 1 - i])) {
				return false;
			}
		}
		return true;
	}
		
}