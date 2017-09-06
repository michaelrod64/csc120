public class Reverse {
	public static void main(String[] args) {
		stutterReverse("hello");
	}
	public static void stutterReverse(String s) {
		if (s.length() == 0) {
			return s;
		} else {
			char last = s.charAt(s.length() - 1);
			System.out.print(last);
			System.out.print(last);
			stutterReerse(s.substring(0, s.length() - 1));
		}
	}
}