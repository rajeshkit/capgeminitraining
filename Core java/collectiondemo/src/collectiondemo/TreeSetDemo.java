package collectiondemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
 		hs.add(454);
 		hs.add(788);
 		hs.add(899);
 		hs.add(233);
 		hs.add(788);
 		hs.add(812);
 		hs.add(788);
 		
 		//iterator
 				Iterator<Integer> itr=hs.iterator();
 				while(itr.hasNext()) {
 					Integer i = itr.next();
 					System.out.println(i);
 				}
 				
 				for(int i=0;i<hs.size();i++) {
 						System.out.println(hs.pollFirst());
 					
 				}
 				for(Integer i:hs) {
 					System.out.println(i);
 				}
 				
 				hs.forEach(e->System.out.println(e));
		
		
		
		
		
		
		
		
		
	}
}
