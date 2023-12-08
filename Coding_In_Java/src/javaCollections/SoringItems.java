package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoringItems {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String> ();
		list.add("Apple");
		list.add("Orange");
		
		//to add one or more items to list
		
		Collections.addAll(list, "Banana", "Blueberries");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		System.out.println(list);
		
	

	}

}
