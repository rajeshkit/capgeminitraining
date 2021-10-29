package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();//generics store only the object
		list.add(300); // autoboxing - int - Integer
		list.add(898);
		list.add(45);// autoboxing -  float - Float
		list.add(47568786);// autoboxing - int - Integer
		list.add(898);
		list.add(3434);
		list.add(898);
		list.add(45);
		list.add(7988);
		list.add(898);
		System.out.println(list);
		Collections.shuffle(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, 898));
		System.out.println(Collections.frequency(list, 898));
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
//		ArrayList<String> city=new ArrayList<String>();
//		city.add("Chennai");
//		city.add("Bangalore");
//		city.add("Mumbai");
//		city.add("Pune");
//		city.add("Hyd");
//		System.out.println(city);
		
		
 		
		
		
		
		
		
		
		
		
		
	}
}
