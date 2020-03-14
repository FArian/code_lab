package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 *
 * 5 best ways to Iterate Over HashMap in Java
 * 
 * @author Farhad Arian
 *
 */
public class IterateHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> coursesMap = new HashMap<Integer, String>();
		coursesMap.put(1, "C");
		coursesMap.put(2, "C++");
		coursesMap.put(3, "Java");
		coursesMap.put(4, "Spring Framework");
		coursesMap.put(5, "Hibernate ORM framework");

		// 2. Iterate through HashMap KeySet using Iterator
		Iterator<Integer> iterator = coursesMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key);
			System.out.println(coursesMap.get(key));
		}

	}

}
