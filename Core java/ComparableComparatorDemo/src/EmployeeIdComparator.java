import java.util.Comparator;


public class EmployeeIdComparator implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		if(o1.getEmployeeId()>o2.getEmployeeId()) {
			return 1;
		}
		if(o1.getEmployeeId()<o2.getEmployeeId()) {
			return -1;		
		}
		return 0;
	}

}
