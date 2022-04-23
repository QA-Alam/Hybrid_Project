package practice.collections.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterFace {

		// How to handle the data structure?
		// Ans- Help with Map interface also we can handle with LinkedList

		// Map is an interface
		// Implemented class HashMap, HashTable LinkedHashMap
		// Map store the value key & value pair
		// Map allow only one null key and many null value
		// dose not maintain the insertion order

		// id nyc - Alam
		// id nj- Alam
		// id pa - Alam
		// id dc- Alam
		// id fl - Alam

		@SuppressWarnings("rawtypes")
		public static void main(String[] args) {
			Map<Integer, String> name = new HashMap<>();
			name.put(1, "Alam");
			name.put(2, "Alam");
			name.put(3, "Alam");
			name.put(4, null);// Map allow multiple duplicate value 
			name.put(5, null);
			name.put(5, null);// dose not allow duplicate key
			name.put(null, null);
			name.put(null, null);// dose not allow more than one null key

			for (Entry m : name.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}

		}

	}
