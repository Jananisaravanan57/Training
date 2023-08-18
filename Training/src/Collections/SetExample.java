package Collections;

import java.util.*;

//Set contains only Unique elements
public class SetExample {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("purple");
		set.add("black");
		set.add("blue");
		set.add("white");
		
		System.out.println("\nAn initial list of elements: " + set);
		
		set.remove("purple");
		System.out.println("\nAfter invoking remove first elemnent: " + set);
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("red");
		set1.add("yellow");
		set.addAll(set1);
		System.out.println("\nUpdated List: " + set);
		
		
		set.removeAll(set1);
		System.out.println("\nAfter invoking removeAll() method: " + set);
		
		set.removeIf(str -> str.contains("blue"));
		System.out.println("\nAfter invoking removeIf() method: " + set);
		
		set.clear();
		System.out.println("\nAfter invoking clear() method: " + set);
	}

}
