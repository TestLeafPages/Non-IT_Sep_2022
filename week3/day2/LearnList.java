package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		// declaration

		// List listName=new implementationclass();

		List listName = new ArrayList();

		listName.add(1);
		listName.add("Vidya");
		listName.add(3.14f);
		listName.add(3, 'R');

		System.out.println(listName);

		// using Wrapperclass
		List<Integer> lname = new ArrayList<Integer>();
		List<String> sname = new LinkedList<String>();

		// listmethods
		lname.add(1);// index starts with zero
		lname.add(2);
		lname.add(2, 8); // index based addtion of elements to the list
		lname.add(4);
		lname.add(6);
		lname.add(6);
		lname.add(2);

		System.out.println(lname);

		// set->replace the element in the particular index
		lname.set(0, 23);
		System.out.println(lname);

		// remove element from the list
		lname.remove(2);
		System.out.println(lname);

		// to get the data/value from the particular index
		System.out.println(lname.get(1));

		// Integer integer = lname.get(1);

		// to check any values in the list
		boolean contains = lname.contains(2);
		System.out.println(lname.contains(2));

		// list size
		int size = lname.size();
		System.out.println(size + "size of the list ");

		// to check the list is with values or empty
		boolean empty = lname.isEmpty();
		System.out.println(empty);

		/*
		 * lname.clear(); System.out.println(lname);
		 * 
		 * System.out.println(lname.isEmpty());
		 */

		Collections.sort(lname);
		System.out.println(lname);

		Integer max = Collections.max(lname);
		System.out.println(max);

		int frequency = Collections.frequency(lname, 4);
		System.out.println(frequency);

		int count = 0;
		for (int i = 0; i < size; i++) {
			// if(arr[i]==3) array
			if (lname.get(i) == 3) {
				count++;
			}

		}
		System.out.println(count);

	}

}
