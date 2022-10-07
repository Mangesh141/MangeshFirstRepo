package a95_collection;

import java.util.HashSet;
import java.util.Set;

public class a2 {

	public static void main(String[] args) {

		// Hashset
		// 1. not allow duplicate
		// 2. not work by index
		
		Set set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println(set);
		
		set.remove(20);
		
		System.out.println(set);
		
		System.out.println(set.contains(20));      //false
		
		System.out.println(set.isEmpty());         //false
		
		System.out.println(set.size());
	}

}
