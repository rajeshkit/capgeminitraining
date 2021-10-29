import java.util.ArrayList;
import java.util.Collections;

public class ComparableMainDemo {
	public static void main(String[] args) {
		
		Employee e1=new Employee(1007, "rajesh", 4545);
		Employee e2=new Employee(1004, "vishal", 2323);
		Employee e3=new Employee(1000, "abhisek", 5656);
		Employee e4=new Employee(1010, "arjun", 24554);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("********************");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("*******************");
		
	}

} 
