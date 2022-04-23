package practice.collections.codes;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class loopConcept {

	public static void basicLoop() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}

	public static void whileLoop() {

		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
		}
	}

	// @Test
	public static void doWhileLoop() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
	}

	//@Test
	public static void AdvancedLoop() {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String element : cars) {
			System.out.println(element);

		}
	}

	//@Test
	// Import the ArrayList class and the Iterator class
	// Iterator is a interface
	public static void IteratorTest() {

		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Get the iterator
		Iterator<String> it = cars.iterator();
		while (it.hasNext())
			;

		String next = it.next();
		// Print the first item
		System.out.println(next);
	}
	@Test
	 public static void forEachLoop() {
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach((n)->{System.out.println(n);});
		  }
	 
	 
	 
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i < 13) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
