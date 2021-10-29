package collectiondemo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] marks = { 46, 67, 78, 243, 56, 6767, 9 };
		int[] marks1 = { 46, 67, 78, 243, 56, 6767, 9 };
		
		List<int[]> l=Arrays.asList(marks);
		
		
		for (int i : marks) {
			System.out.print(i+" ");
		}
		System.out.println("**************");
		System.out.println(Arrays.compare(marks, marks1));
		System.out.println("**************");
		Arrays.sort(marks);
		System.out.println();
		for (int i : marks) {
			System.out.print(i+" ");
		}
		System.out.println();
		//9 46 56 67 78 243 6767 
		System.out.println(Arrays.binarySearch(marks, 700)); //-1-6 =-7
		// condition sort method then u have binary search method
		
	}
}
