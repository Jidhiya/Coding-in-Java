package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchList {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>(); 
		  
        // Adding elements to object 
        // using add() method 
        items.add("Shoes"); 
        items.add("Toys"); 
        items.add("Horse"); 
        items.add("Ball"); 
        items.add("Grapes"); 
        
        //Sort the list
        Collections.sort(items);
        
        System.out.println(items);
        
      //Binary search on list
        System.out.println("The index of Ball in the list is :"+Collections.binarySearch(items, "Ball"));
        
        //Binary search on list
        System.out.println("The index of Horse in the list is :"+Collections.binarySearch(items, "Horse"));
      //Binary search on list
        System.out.println("The index of Dog in the list is :"+Collections.binarySearch(items, "Dog"));

	}

}
