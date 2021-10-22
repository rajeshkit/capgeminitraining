
public class Sales {
	
	public Salary getEmployeeSales(Employee employee) {
		System.out.println("Sales Team");
		System.out.println(employee);
//		System.out.println(employee.getAddress());
//		System.out.println(employee.getDepartment());
//		System.out.println(employee.getEmail());
//		System.out.println(employee.getEmployeeId());
//		System.out.println(employee.getEmployeeName());
//		System.out.println(employee.getSalary());
//		System.out.println(employee.getPhone());
		System.out.println("*************************");
		Salary sal=new Salary();
		sal.setEmployeeId(employee.getEmployeeId());
		sal.setSalaryIncrement(employee.getSalary() + 10000);
		return sal;
	}

}
