package basicconcepts;

import java.util.Scanner;

public class Student {
	String name;
	int rollNo;
	static String collegeName="IIT";
	public void setStudentData() {
		Scanner s=new Scanner(System.in);
		name = s.nextLine();//Rajesh
		rollNo = s.nextInt();//364
		
	}
	public void getStudentData() {
		System.out.println(name+"  "+rollNo+"  "+collegeName);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentData();
		s1.getStudentData();
		Student s2=new Student();
		s2.setStudentData();
		s2.getStudentData();
	}
}
