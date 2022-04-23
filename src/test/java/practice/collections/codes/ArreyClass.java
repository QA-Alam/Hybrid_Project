package practice.collections.codes;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArreyClass {

	// What are Arrays in Java?
	// Normally, an array is a collection of similar type of elements which has
	// contiguous memory location.
	// Java array is an object which contains elements of a similar data type. 
	// Additionally,The elements of an array are stored in a contiguous memory location. It is a
	// data structure where we store similar elements.
	// We can store only a fixed set of elements in a Java array.
	// Array in Java is index-based, the first element of the array is stored at the 0th index,
	// 2nd element is stored on 1st index and so on.
	// The array length is fixed.

	// Types of Array in java
	// There are two types of array.

	// Single Dimensional Array
	// Multidimensional Array

	// Java Program to illustrate how to declare, instantiate, initialize
	// and traverse the Java array.
	   // @Test
	    public static void oldArrayDeclaration() {
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		System.out.println(Arrays.asList(a));
		System.out.println(a);
		// traversing array
		// Basic for loop
		   for(int i = 0; i < a.length; i++) { // i j k
				System.out.println(i);
			}
				
			// Advance for loop/ Enhance for loop	
			for (int j : a) {
				System.out.println(j);
			} 
		
		
	}
	//@Test
	public static void newArreyDeclaration(String args[]){  
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
	
	} 
	//@Test
	public static void StringArreyDeclaration(){ 
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
	System.out.println(cars[0]); //Specific data from list of array
	
	System.out.println(Arrays.asList(cars));
		
	System.out.println(cars.length);
	
	for (String element : cars) {
		System.out.println(element);
		
		//System.out.println(names[0][0] + names[1][2]);
        //System.out.println(names[0][1] + names[1][1]);
		
		
		
	}
	}

	//@Test
	public static void doubleDataType() {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		System.out.println(myList);

		// Print all the array elements
		for (double element : myList) {
			System.out.println(element);
		}
	}
	//@Test
	public static void MultidimensionalArreys(){  
		//declaring and initializing 2D array  
		int arr[][]={{1,2,3,4}, 
				     {2,4,0,6},
				     {4,4,5,8}};  
		// First count the value as row
		// Second count as column 
		int x = arr[1][2];
		System.out.println(x); // Outputs 0
		
		
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		System.out.println();  
		}  
		}  
	//@Test
	public static void loopIncreaseValue() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	//@Test
	public static void loopDecreaseValue() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);

		}
	}
	@Test
	// How to sort Array in Java
		public static void sorting() {
			int[] array = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };		
			Arrays.sort(array);
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			};
		}
}
