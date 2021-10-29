package collectiondemo;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		EmployeeIdComparator eic=new EmployeeIdComparator();
		TreeSet<Employee> ts=new TreeSet<Employee>(eic);
		Employee e1=new Employee(1007, "rajesh", 4545);
		Employee e2=new Employee(1004, "vishal", 2323);
		Employee e3=new Employee(1000, "abhisek", 5656);
		Employee e4=new Employee(1010, "arjun", 24554);
		ts.add(e1);ts.add(e2);ts.add(e3);ts.add(e4);
		for(Employee e:ts) {
				System.out.println(e);
		}
		
//		TreeSet<Integer> hs=new TreeSet<Integer>();
// 		hs.add(454);
// 		hs.add(788);
// 		hs.add(899);
// 		hs.add(233);
// 		hs.add(788);
// 		hs.add(812);
// 		hs.add(788);
// 		
// 		//iterator
// 				Iterator<Integer> itr=hs.iterator();
// 				while(itr.hasNext()) {
// 					Integer i = itr.next();
// 					System.out.println(i);
// 				}
// 				
// 				for(int i=0;i<hs.size();i++) {
// 						System.out.println(hs.pollFirst());
// 					
// 				}
// 				for(Integer i:hs) {
// 					System.out.println(i);
// 				}
// 				
// 				hs.forEach(e->System.out.println(e));
//		
//		
//		
//		
//		
//		
		
		
		
	}
}
