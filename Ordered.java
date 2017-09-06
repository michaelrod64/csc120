public class Ordered {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Whiskey");
		list.add("Tango");
		list.add("Foxtrot");
		list.add("Baker");
		list.add("Alpha");
		ordered(list, "Charlie");
	}
	public static void ordered(List<String> list, String value) {
		Iterator<String> i = list.iterator();
		int count = 0;
		String next = i.next();
		while (i.hasNext() && next.compareTo(value) < 0) {
			next = i.next;
			count++;
		}
		list.add(count, value);
	}
			
			