package practice.collections.codes;

import java.util.HashSet;
import java.util.Set;

public class SetInterFace {

	// Set is an interface
	// Set interface implemented Hash set, LikedHashset, tree set
	// Set dose not allow duplicate value
	// Set dose not maintains the insertion order
	// Set allow only one null value
	// Set you cannot find the index value

	public static void setTest() {

		Set<String> name = new HashSet<>();
		name.add("Selenium");
		name.add("Java");
		name.add("Maven");
		name.add("Cucumber");
		name.add("TestNG");
		name.add("Jenkins");
		name.add("Git-Hub");
		name.add("Selenium"); // ny , ny squer,
		name.add(null);
		name.add(null);
		name.add(null);
		System.out.println(name);
		System.out.println("Contains : "+name.contains("Cucumber"));

	}

	public static void duplicateValue() {
		String[] duplicate = { "Selenium", "Java", "Maven", "Cucumber", "TestNG", "Java" };
		Set<String> name = new HashSet<>(); //
		
		for (String value : duplicate) {
			if(name.add(value) == false) {
				System.out.println("Duplicate value is a : " + value);
			}
		}
	}

	public static void main(String[] args) {
		SetInterFace.duplicateValue();
	}
}