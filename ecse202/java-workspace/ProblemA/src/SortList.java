import acm.program.ConsoleProgram;

/**
 * Program that uses the TinyArrayList data structure to
 * store strings and sort an array.
 * @author kpoulin
 *
 */
public class SortList extends ConsoleProgram {
	
	/**
	 * Main entry point of the program.
	 */
	public void run() {
		TinyArrayList list = new TinyArrayList();
		list.add("Hello to all 202 students!");
		list.add("Enter the classroom and grab a seat.");
		list.add("Katrina is about to start.");
		list.add("Hopefully, you will learn something today.");
		String[] out = selectionSort(list);
		for(int i = 0; i < out.length; i++) {
			println(out[i]);
		}
	}
	
	/**
	 * Uses the selection sort algorithm to store the contents
	 * of the TinyArrayList data structure.
	 * @param in Data structure to sort.
	 * @return Sorted array of strings.
	 */
	public String[] selectionSort (TinyArrayList in) {
		String[] listArray = in.toArray();
		for (int i = 0; i < in.size; i++) {
			int smallest = i;
			for (int j = i + 1; j < in.size; j++) {
				if (listArray[j].compareTo(listArray[smallest]) < 0) {
					smallest = j;
				}
			}
			String temp = listArray[i];
			listArray[i] = listArray[smallest];
			listArray[smallest] = temp;
		}
		return listArray;
	}

}
