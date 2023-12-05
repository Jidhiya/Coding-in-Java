package javaCollections;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		String student[] = {"Stu1", "Stu2", "Stu3", "Stu4", "Stu5"};
		System.out.println("Array :" + Arrays.toString(student));
		List studentlist = Arrays.asList(student);
		System.out.println("Array to List :" + studentlist);
		

	}

}
