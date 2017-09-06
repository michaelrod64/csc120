public class Duplicates2 {
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
		int count = 0;
		
		Iterator<Integer> i = list.iterator();
		int prev = i.next();
		
		while (i.hasNext()) {
			int next = i.next();
			if (prev == next) {
				count++
			}
			prev = next;
		}
		return count;
	}
	