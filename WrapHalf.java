public class WrapHalf {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		wrapHalf(list)
	}
	wrapHalf(List<Integer> list) {
		middle = (list.size() + 1) / 2;
		for (i = 0; i < middle; i++) {
			int element = list.remove(list.size() - 1);
			list.add(0, element);
		}