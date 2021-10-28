package collectiondemo;

import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Player p1=new Player();
		p1.setPlayerId(7);
		p1.setCountryName("India");
		p1.setPlayerName("Dhoni");
		Player p2=new Player();
		p2.setPlayerId(12);
		p2.setCountryName("India");
		p2.setPlayerName("yuvraj");
		Player p3=new Player();
		p3.setPlayerId(15);
		p3.setCountryName("India");
		p3.setPlayerName("Kholi");
		
		LinkedHashSet<Player> hsp=new LinkedHashSet<Player>();
		hsp.add(p3);
		hsp.add(p1);
		hsp.add(p2);
		System.out.println(hsp);
		
//		HashSet<Integer> hs=new HashSet<Integer>();
// 		hs.add(454);
// 		hs.add(788);
// 		hs.add(899);
// 		hs.add(null);
// 		hs.add(244);
// 		hs.add(233);
// 		hs.add(812);
// 		hs.add(null);
// 		hs.add(244);
// 		hs.add(899);
// 		hs.add(899);
// 		System.out.println(hs);
		
		
		
		
		
		
		
		
		
	}
}
