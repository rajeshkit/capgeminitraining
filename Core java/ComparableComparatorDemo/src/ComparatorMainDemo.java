import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMainDemo {
	public static void main(String[] args) {
		
		EmployeeDetails e1=new EmployeeDetails(1007, "rajesh", 4545);
		EmployeeDetails e2=new EmployeeDetails(1004, "vishal", 2323);
		EmployeeDetails e3=new EmployeeDetails(1000, "abhisek", 5656);
		EmployeeDetails e4=new EmployeeDetails(1010, "arjun", 24554);
		ArrayList<EmployeeDetails> list=new ArrayList<EmployeeDetails>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);
		for(EmployeeDetails e:list) {
			System.out.println(e);
		}
		System.out.println("********************");
		EmployeeIdComparator eic=new EmployeeIdComparator();
		Collections.sort(list,eic);
		for(EmployeeDetails e:list) {
			System.out.println(e);
		}
		System.out.println("*******************");
		for(EmployeeDetails e:list) {
			System.out.println(e);
		}
		System.out.println("********************");
		EmployeeSalaryComparator esc=new EmployeeSalaryComparator();
		Collections.sort(list,esc);
		for(EmployeeDetails e:list) {
			System.out.println(e);
		}
	}

} 
