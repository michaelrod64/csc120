public class Stutter {
	public static void main (String[] args) {
		System.out.println(stutter(348));
	}
	public static int stutter(int n) {
		if (n != 0) {
			return 100 * stutter(n / 10) + n % 10 * 11;
		}
		return 0;
	}
}