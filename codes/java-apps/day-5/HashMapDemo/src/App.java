import java.util.HashMap;
import java.util.Iterator;
//import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		//hashMapDemo();
		treeMapDemo();
	}

	static void treeMapDemo() {
		/*
		 * Map<Integer, String> treeMap = new TreeMap<Integer, String>(); treeMap.put(3,
		 * "Outer ring Road"); treeMap.put(1, "oracle"); treeMap.put(1, "Oracle Inc.");
		 * treeMap.put(0, "Bangalore"); treeMap.put(2, "India"); Set<Map.Entry<Integer,
		 * String>> setOfKeyValuePair = treeMap.entrySet();
		 * 
		 * for (Map.Entry<Integer, String> keyValuePair : setOfKeyValuePair) {
		 * System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue()); }
		 */

		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("Three", "Outer ring Road");
		treeMap.put("One", "oracle");
		treeMap.put("One", "Oracle Inc.");
		treeMap.put("Zero", "Bangalore");
		treeMap.put("Two", "India");

		if (treeMap.containsKey("Zero")) {
			treeMap.replace("Zero", "Bengaluru");
		}
		System.out.println(treeMap.get("Zero"));

		/*
		 * Set<Map.Entry<String, String>> setOfKeyValuePair = treeMap.entrySet(); 
		 * for(Map.Entry<String, String> keyValuePair : setOfKeyValuePair) {
		 * 	System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue()); 
		 * }
		 */

		Set<Map.Entry<String, String>> setOfKeyValuePair = treeMap.entrySet();
		Iterator<Map.Entry<String, String>> setIterator = setOfKeyValuePair.iterator();
		while (setIterator.hasNext()) {
			Map.Entry<String, String> keyValuePair = setIterator.next();
			System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue());
		}
	}

	static void hashMapDemo() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Three", "Outer ring Road");
		hashMap.put("One", "oracle");
		hashMap.put("One", "Oracle Inc.");
		hashMap.put("Zero", "Bangalore");
		hashMap.put("Two", "India");

		if (hashMap.containsKey("Zero")) {
			hashMap.replace("Zero", "Bengaluru");
		}
		System.out.println(hashMap.get("Zero"));
		Set<Map.Entry<String, String>> setOfKeyValuePair = hashMap.entrySet();

		for (Map.Entry<String, String> keyValuePair : setOfKeyValuePair) {
			System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue());
		}
	}
}

/*
 * class MyHashMap<K, V> { public class Entry<K,V> { private K key; private V
 * value;
 * 
 * public Entry(K key, V value) { this.key = key; this.value = value; }
 * 
 * public K getKey() { return key; }
 * 
 * public void setKey(K key) { this.key = key; }
 * 
 * public V getValue() { return value; }
 * 
 * public void setValue(V value) { this.value = value; } }
 * 
 * private Set<Entry<K,V>> set = new HashSet<Entry<K,V>>();
 * 
 * public Set<Entry<K,V>> entrySet() { return set; }
 * 
 * public void put(K key, V value) { set.add(new Entry<K,V>(key, value)); } }
 */
