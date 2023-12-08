package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyItems {

	public static void main(String[] args) {
		List<String> destinationList = new ArrayList<String> ();
		Collections.addAll(destinationList, "Shoes","Cars","Laptop");
		
		List<String> sourceList = new ArrayList<String> ();
		
		Collections.addAll(sourceList, "Apples","Toys");
		
		System.out.println("Destination List: "+ destinationList);
		System.out.println("Source List: "+ sourceList);
		
		Collections.copy(destinationList, sourceList);
		
		System.out.println("Destination List: "+ destinationList);
		//System.out.println("Source List: "+ sourceList);
		
		
	}

}
