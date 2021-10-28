package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();//generics store only the object
		
		list.add(300); // autoboxing - int - Integer
		list.add(45);// autoboxing -  float - Float
		list.add(898);
		list.add(3434);
		list.add(45);
		list.add(898);
		
		//iterator
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<800) {
				System.out.println(list.get(i));
			}
			
		}
		for(Integer i:list) {
			System.out.println(i);
		}
		
		list.forEach(e->System.out.println(e));
		
		
	}
}
