package basicconcepts;
public class Sample{
	
	String name;
	StringBuffer sb;
	byte mark1;
	short mark2;
	int mark3;
	long mark4;
	float cgpa;
	double cgpa1;
	boolean status;
	char grade;
	void show() {
		System.out.println("mark1:"+mark1);
		System.out.println("mark2:"+mark2);
		System.out.println("mark3:"+mark3);
		System.out.println("mark4:"+mark4);
		System.out.println("cgpa1:"+cgpa);
		System.out.println("cgpa1:"+cgpa1);
		System.out.println("status:"+status);
		System.out.println(grade);
		
	}
	public static void main(String args[]){
		System.out.println(Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE+" "+Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE+" "+Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE+" "+Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE+" "+Double.MIN_VALUE);
		
		System.out.println(Character.MAX_VALUE+" "+Character.MIN_VALUE);
		System.out.println("***************************");
		Sample s=new Sample();
		s.show();
		
	}
	
}	