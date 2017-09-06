public class RemoveAll {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(17);
		list.add(4);
		list.add(3);
		list.add(18);
		list.add(2);
		list.add(3);
		removeAll(list, 3);
	}
	public static void removeAll(List<Integer> list, int value) {
		Iterator<Integer> i = list.iterator();
		while (list.contains(value) && i.hasNext()) {
			if (list.next() == value) {
				i.remove();
			}
		}
	}