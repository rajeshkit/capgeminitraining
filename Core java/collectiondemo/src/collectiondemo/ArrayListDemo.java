package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		Player p1=new Player();
		p1.setPlayerId(7);
		p1.setCountryName("India");
		p1.setPlayerName("Dhoni");
		Player p2=new Player();
		p2.setPlayerId(12);
		p2.setCountryName("Aus");
		p2.setPlayerName("yuvraj");
		Player p3=new Player();
		p3.setPlayerId(15);
		p3.setCountryName("India");
		p3.setPlayerName("Kholi");
		
		
		ArrayList<Player> players=new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		Iterator<Player> itr= players.iterator();
		while(itr.hasNext()) {
			Player pla = itr.next();
			if(pla.getCountryName().equals("India")) {
				System.out.println(pla);
			}
		}
		
		for(int i=0;i<players.size();i++) {
			Player p = players.get(i);
			if(p.getCountryName().equals("Aus")) {
				System.out.println(p);
			}
		}
 		
		for(Player p:players) {
			if(p.getCountryName().equals("Aus")) {
				System.out.println(p);
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
