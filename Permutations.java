public class Permutations {
	public static void main(String[] args) {
		System.out.print(permut(5, 2));
	}
	public static int permut(int n, int r) {
		if (n <= (n - r)) {
			return 1;
		}
		else {
			return n * permut(n - 1, r - 1);
		}
	}
}