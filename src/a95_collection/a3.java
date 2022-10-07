package a95_collection;

import java.util.HashMap;
import java.util.Map;

public class a3 {

	public static void main(String[] args) {

		// map store value in key and value pair
		
			Map map=new HashMap();
			
			map.put("name", "mangesh");
			map.put("marks", 98);
			map.put("RollNo", 102);
			map.put("div", "A");
			
			map.put("url", "www.oracle.javadownload.com");
			
			System.out.println(map.get("name"));
			
			System.out.println(map.get("marks"));
			
			System.out.println(map.get("RollNo"));
		
			System.out.println(map.get("url"));
	}

}
