public class Duplicates {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(11);
		countDuplicates(list);
	}
	
	public static int countDuplicates(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>(list);
		return list.size() - set.size;
	}
	