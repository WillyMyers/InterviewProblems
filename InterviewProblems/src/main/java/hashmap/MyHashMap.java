package main.java.hashmap;

/**
 * Basic implementation of a HashMap.
 * 
 * @author willy
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap<K, V> {

	private int CAPACITY = 4;
	private Entry<K, V>[] table;

	@SuppressWarnings("unchecked")
	public MyHashMap() {
		table = new Entry[CAPACITY];
	}

	@SuppressWarnings("unchecked")
	public MyHashMap(int capacity) {
		table = new Entry[capacity];
	}

	public class Entry<T, S> {
		private T key;
		private S value;
		private Entry<T, S> next;

		public Entry(T key, S value, Entry<T, S> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public S getValue() {
			return value;
		}

		public void setValue(S value) {
			this.value = value;
		}

		public T getKey() {
			return key;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + ", next=" + next + "]";
		}
	}

	private int hash(K key) {
		// this is not great, this is what Java used to do but is reasonably
		// simple and works if the key hash had the hash code function overridden properly
		return key.hashCode() % CAPACITY;
	}

	public V get(K key) {
		if (key == null) {
			return null;
		}
		int hashKey = hash(key);
		if (table[hashKey] != null) {
			Entry<K, V> entry = table[hashKey];
			while (entry != null) {
				if (entry.key == key) {
					return entry.value;
				} else {
					entry = entry.next;
				}
			}
		}
		return null;
	}

	public V put(K key, V value) {
		if (key == null) {
			return null;
		}
		int hashKey = hash(key);
		Entry<K, V> entry = new Entry<K, V>(key, value, null);

		if (table[hashKey] == null) {
			table[hashKey] = entry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hashKey];

			while (current != null) {
				if (current.key.equals(key)) {
					if (previous == null) {

						entry.next = current.next;
						table[hashKey] = entry;
						return value;
					} else {
						entry.next = current.next;
						previous.next = entry;
						return value;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = entry;
		}
		return value;
	}

	public void printMap() {
		for (int i = 0; i < table.length; i++) {
			Entry<K, V> entry = table[i];
			printEntry(i, entry);
		}
	}

	private void printEntry(int i, MyHashMap<K, V>.Entry<K, V> entry) {
		if (entry == null) {
			System.out.println("Bucket " + i + " is empty");
		} else {
			System.out.println("Bucket " + i + ", " + entry.toString());
		}
	}
}
