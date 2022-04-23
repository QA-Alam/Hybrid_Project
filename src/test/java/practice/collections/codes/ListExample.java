package practice.collections.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ListExample {
	// What is a Collection?
	/*
	 * The Collection in Java is a framework that provides an architecture to store
	 * and manipulate the group of objects.
	 */

	// Differences between Collection, Collections & Collectors?
	/*
	 * collection -> The Collection is an interface, to store and manipulate the
	 * group of objects.
	 */
	/*
	 * Collections -> Collections is a utility class in Java, Help with collections
	 * we can Reveres the string/number of value, find out max value & min value
	 */
	/*
	 * Collectors -> Collectors is a final class that extends the Object class, Help
	 * of collectors We can remove the duplicate value & many more
	 */

	// What is a List in Collection?
	// List is a interface, Interface implemented multiple class like
	// a.ArrayList, LinkedList, Vector & Stack

	// ArrayList advantage?
	// ArrayList supports dynamic arrays that can grow as needed
	// ArrayList allows duplicate elements and null values
	// ArrayList class maintains the insertion order and is non-synchronized
	// ArrayList flowing the index theory java
	// ArrayList when add the new value increases the size 50%
	// ArrayList faster then vector 
	// ArrayList slower then array

	// How to declare Integer ArrayList with values in Java? Examples
	// Integer is a wrapper class

	public static void ArrayListTest() {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
	
		// How to reverse an array list java
		Collections.reverse(num);
		System.out.println(num);

		// How to do basic loop in java
		for (int i = 0; i < num.size(); i++) { // i j k
			System.out.println(num.get(i));
		}

	}

	public static void ArrayListStringTest() {
		// How to declare String ArrayList with values in Java? Examples
		// String not a wrapper class
		List<String> num = new ArrayList<>();
		num.add("Selenium");
		num.add("Java");
		num.add("Maven");
		num.add("Cucumber");
		num.add("TestNG");
		num.add("GitHub");
		num.add("Jenkins");
		num.add("JDBC");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add(null);
		num.add(null);
		num.add(null);
		num.add(null);

		// How to remove specific value 
		num.remove("Java");
		System.out.println(num);

		// How to remove duplicate value
		num = num.stream().distinct().collect(Collectors.toList());
		System.out.println(num);

		// How to know size of length
		System.out.println(num.size());

		// How to know specific value
		System.out.println(num.get(3)); //num[1]

		for (int i = 0; i < num.size(); i++) { // i j k
			System.out.println(num.get(i));
		}

	}

	// How to find out maximum & minimum value in ArrayList
	public static void maxandminvalue() {
		List<Integer> number = Arrays.asList(100, 30, 4, 45, 67, 576, 476);
		int max = Collections.max(number);
		System.out.println("This is my maximum value :" + max);

		int Secmax = Collections.max(number);
		System.out.println("This is my maximum value :" + Secmax);
		
		int min = Collections.min(number);
		System.out.println("This is my minimum value :" + min);
	}

	// How to declare Vector with values in Java? Examples
	// Vector when we add the values increases the size 100%
	public static void vectorTest() {
		List<String> num = new Vector<>();
		num.add("Selenium");
		num.add("Java");
		num.add("Maven");
		num.add("Cucumber");
		num.add("TestNG");
		num.add("GitHub");
		num.add("Jenkins");
		num.add("JDBC");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI"); // Increases size 100%

		// How to know number of index from value
		System.out.println("Index of jenkins " + num.indexOf("Jenkins"));

		// How to verify the value from list of data
		if (num.contains("Jenkins"))
			System.out.println("Jenkins is exists");
		else
			System.out.println("Jenkins is not exists");
		// How to cleared all the value from list of data
		//num.clear();
		System.out.println(num);
		for (int i = 0; i < num.size(); i++) { // i j k
			System.out.println(num.get(i));
		}
	}

	// Similar to arrays in Java, LinkedList is a linear data structure.
	// LinkedList elements are not stored in contiguous locations like arrays,
	// they are linked with each other using pointers. Each element of the
	// LinkedList has the reference(address/pointer) to the next element of the
	// LinkedList.
	
	@Test
	public static void linkListTest() {
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add(0, "Appale");
		linklist.add(1, "Banana");
		linklist.add(2, "Orenge");
		linklist.add(3, "Milk");
		linklist.add(4, "Milk");
        // Null Apple -> Banana -> Orange Null
		// Adding an element to the first position
		linklist.addFirst("Java");

		// Adding an element to the last position
		linklist.addLast("Selenium");

		// Removing first element
		linklist.removeFirst();

		// Removing Last element
		linklist.removeLast();

		System.out.println(linklist);

		// Iterating LinkedList
		Iterator<String> iterator = linklist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
    //How to sort ArrayList in Java
	public static void listSorting() {
		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("Bangladesh");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}
	}
	//@Test
// How to remove duplicate value from list
	public static void removeDuplicate() {
		List<Integer> number = Arrays.asList(100, 30, 30, 4, 45, 67, 576, 476);
		List<Integer> deduped = number.stream().distinct().collect(Collectors.toList());
		System.out.println(deduped);
	}
	
	//@Test
    public static void findDuplicateValue() {   

        List<Integer> listOf = new ArrayList<Integer>();
        listOf.add(3);
        listOf.add(9);
        listOf.add(2);
        listOf.add(8);
        listOf.add(6);
        listOf.add(4);
        listOf.add(1);
        listOf.add(1);

        List<Integer> tempList = new ArrayList<Integer>();
        for(Integer obj:listOf){
             if(!tempList.contains(obj)){
                 tempList.add(obj);

             }
         }
         System.out.println(tempList);

 }


	
	public static void main(String[] args) {
		// vectorTest();
		// ArrayListStringTest();
		// ArrayListTest();
		// ArrayListTest();
		 maxandminvalue();
		//linkListTest();
		//listSorting();
		 //vectorTest();
	}
}
