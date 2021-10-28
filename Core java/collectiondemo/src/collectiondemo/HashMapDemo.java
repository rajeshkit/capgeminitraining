package collectiondemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//put, get
		hm.put(600069, "Chennai");
		hm.put(null, "kerala");
		hm.put(763008, "Odisa");
		hm.put(441080, "Nasik");
		hm.put(422009, "Nagpur");
		hm.put(346435, "Bangalore");
		hm.put(null, "Delhi");
		
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
