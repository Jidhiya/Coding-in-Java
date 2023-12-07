package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		//array of length 3 with integers
		int arr[] = {10, 20, 30};
		
		//ArrayList of integers
		ArrayList<Integer> arrList = new ArrayList<Integer> ();
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		
		
		System.out.println("Printing Array elements :" + Arrays.toString(arr));
		System.out.println("Printing Array List elements :" + arrList);
			
		

	}

}
