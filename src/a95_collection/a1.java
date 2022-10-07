package a95_collection;

import java.util.ArrayList;
import java.util.List;

public class a1 {

	public static void main(String[] args) {

		// arrayList
		
		// 1. allow duplicate values
		// 2. we can handle by index
		
		List list=new ArrayList();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("hello");
		list.add("z");
		list.add(30);
				
	   System.out.println(list);
		
		int a=list.size();
		
		System.out.println(a);

		System.out.println(list.get(3));    //hello
		
        list.remove(5);
        
        System.out.println(list);
        
        list.clear();
        
        System.out.println(list);
		
		
		
		
	
	}

}
