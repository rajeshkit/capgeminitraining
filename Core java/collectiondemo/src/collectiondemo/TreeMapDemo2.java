package collectiondemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		//put, get
		hm.put(600069, "Chennai");
		hm.put(763008, "Odisa");
		hm.put(441080, "Nasik");
		hm.put(422009, "Nagpur");
		hm.put(346435, "Bangalore");
		hm.put(422009, "kerala");
		
		
		
		for(Entry<Integer,String> e:hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println("**********************");
		for(Integer key :hm.keySet()) {
			System.out.println(key);
		}
		System.out.println("**********************");
		for(String city:hm.values()) {
			System.out.println(city);
		}

	}
}
