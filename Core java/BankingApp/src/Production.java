
public class Production {
	public static void main(String[] args) {	
		Employee e1=new Employee();//202020
		e1.setEmployeeId(100);
		e1.setEmployeeName("Rajesh");
		e1.setSalary(30000);
		e1.setAddress("chennai");
		e1.setDepartment("CSE");
		e1.setPhone("576898787");
		e1.setEmail("rajesh.kit@gmail.com");
		Sales s=new Sales();//303030
		Salary revisedSalary=s.getEmployeeSales(e1);//404040
		System.out.println(revisedSalary.getEmployeeId()); //100
		System.out.println(revisedSalary.getSalaryIncrement());//40000
		
	}
}
