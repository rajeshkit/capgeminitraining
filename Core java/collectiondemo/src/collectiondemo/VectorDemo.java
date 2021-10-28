package collectiondemo;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> list=new Vector<Integer>();//generics store only the object
		
		list.add(300);
		list.add(45);
		list.add(null);
		list.add(898);
		list.add(3434);
		list.add(45);
		list.add(null);
		list.add(898);
		
		System.out.println(list);
	
		
		
	}
}
