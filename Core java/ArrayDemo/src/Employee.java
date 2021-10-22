import java.util.Scanner;

public class Employee {
	public int employeeId;
	public String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}



	public static void main(String[] args) {
		
		Employee e1=new Employee(100, "Rajesh");
		Employee e2=new Employee(200, "ShivaniSri");	
		Employee e3=new Employee(200, "Saravan");
		Employee e4=new Employee(200, "Krishnan");
		Employee e5=new Employee(200, "Saha");
		Employee e6=new Employee(200, "Sarika");
		float[] marks=new float[6];// primitive array - predefined values
		//String[] cityName=new String[] {"chennai","pune","mumbai","banglore"}; //predefined objects
		Employee[] employeeAll= {e1,e2,e3,e4,e5,e6};// userdefined objects - implement one method toString() method
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<marks.length;i++) {
			marks[i]=s.nextFloat();
		}
		
		
		System.out.println(employeeAll.length);
		System.out.println("**************Regular for loop******************");
		for(int i=0;i<employeeAll.length;i++) {
			System.out.println(employeeAll[i]);
		}
		System.out.println("**************Advanced for loop******************");
		for(Employee m:employeeAll) {
			System.out.println(m);
		}
		
		
		System.out.println("********************************");
		int i=0;
		while(i<employeeAll.length) {
			System.out.println(employeeAll[i]);
			i++;
		}
		System.out.println("********************************");
		int j=0;
		do {
			System.out.println(employeeAll[j]);
			j++;
		}while(j<employeeAll.length);
		System.out.println("********************************");
		
		// advanced for loop
		
		
		
//		String[] city=new String[] {"chennai","mumbai","pune","bangalore","hyd"};// reference type array - String predefined class
//		Employee[] employees=new Employee[] {e1,e2,e3,e4,e5,e6};//reference type array - Employee userdefined class
//		
//		for(int i=0;i<employees.length;i++) {
//			
//		}
	}

}
