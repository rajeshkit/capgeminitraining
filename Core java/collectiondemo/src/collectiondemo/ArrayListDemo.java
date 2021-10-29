package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerId(7);
		p1.setCountryName("India");
		p1.setPlayerName("Dhoni");
		Player p2 = new Player();
		p2.setPlayerId(12);
		p2.setCountryName("Aus");
		p2.setPlayerName("yuvraj");
		Player p3 = new Player();
		p3.setPlayerId(15);
		p3.setCountryName("India");
		p3.setPlayerName("Kholi");

		ArrayList<Player> list = new ArrayList<Player>();
		list.add(p2);
		list.add(p1);
		list.add(p3);

		for (Player p : list) {
			System.out.println(p);
		}
		Collections.sort(list); // how to sort the arraylist is having user defined obj
		//1. Comparable Interface
		//2. Comparator Interface
		for (Player p : list) {
			System.out.println(p);
		}
	}
}
//Iterator<Player> itr= players.iterator();
//while(itr.hasNext()) {
//	Player pla = itr.next();
//	if(pla.getCountryName().equals("India")) {
//		System.out.println(pla);
//	}
//}
//
//for(int i=0;i<players.size();i++) {
//	Player p = players.get(i);
//	if(p.getCountryName().equals("Aus")) {
//		System.out.println(p);
//	}
//}
