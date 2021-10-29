package jdkfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Train { 
		public int travel(int a,int b);
		
}
public class TrainDetails {
	public static void main(String[] args) {
		Train t = (a,b) -> a+b;
		System.out.println(t.travel(34, 56));
		
		Runnable r=() -> {
			System.out.println("thread"+Thread.currentThread().getName());
		};
		r.run();
		
		Comparator<Integer> c=(o1,o2)->o1-o2;
		int result = c.compare(65, 24);
		System.out.println(result);
		
		Consumer<String> c1=(e)->{System.out.println(e);};
		c1.accept("rajesh");
		
		Predicate p=(e)->e.equals("rajesh");
		System.out.println(p.test("rajesh"));
		
		Function<Integer,Integer> f=(e)-> e*e;
		System.out.println(f.apply(3));
		
		Integer[] i= {65,45,78,34,90};
		List<Integer> list = Arrays.asList(i);
		for(int v:list) {
			System.out.println(v);
		}
		System.out.println("************************");
	//	Consumer<Integer> cc=
		
		list.forEach((e)->System.out.println(e));
		
	}

	
	

	
	
}

//Train t=()->  System.out.println("welcome to lamda");
//t.travel();
//
//Train t1=()->{
//	System.out.println("hi");
//	System.out.println("cpagemini");
//};
//t1.travel();