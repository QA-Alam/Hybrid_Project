package practice.collections.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class DuplicatesInArray {
	
	public static void main(String args[]) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		// First solution : finding duplicates using brute force method
		System.out.println("Finding duplicate elements in array using brute force method");
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) { // got the duplicate element
				}
			}
		}

		// Second solution : use HashSet data structure to find duplicates
		String[] value = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		System.out.println("Duplicate elements from array using HashSet data structure");
		Set<String> store = new HashSet<>();
		for (String name : value) {
			if (store.add(name) == false) {
				System.out.println("found a duplicate element in array : " + name);
			}
		}
/*
		// Third solution : using Hash table data structure to find duplicates
		System.out.println("Duplicate elements from array using hash table");
		Map<String, Integer> nameAndCount = new HashMap<>();
		// build hash table with count
		for (String name : names) {
			Integer count = nameAndCount.get(name);
			if (count == null) {
				nameAndCount.put(name, 1);
			} else {
				nameAndCount.put(name, ++count);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element from array : " + entry.getKey());
			}
		}
	}*/
	}	
	@Test
		public static void getIndexElements() {
			Collectors.toSet(); //example
			// ArrayList with duplicate elements
			ArrayList<Integer> numbersList 
			    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
			  
			Map<Integer, Long> elementCountMap = numbersList.stream()
			            .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
			     
			System.out.println(elementCountMap);
		}

}
