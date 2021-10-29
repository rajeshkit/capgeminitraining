import java.util.Comparator;


public class EmployeeSalaryComparator implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		if(o1.getEmployeeSalary()>o2.getEmployeeSalary()) {
			return 1;
		}
		if(o1.getEmployeeSalary()<o2.getEmployeeSalary()) {
			return -1;
		}
		return 0;
	}

}
