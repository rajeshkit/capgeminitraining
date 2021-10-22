import java.util.Scanner;

public class ArrayDemo {

	
	int[] mark=new int[10];// size 10
	
	float[] cgpa=new float[] {5.6f,7.7f,8.9f,3.4f,5.6f};// size ?
	
	float[] cgpa1={5.6f,7.7f,8.9f,3.4f,5.6f}; // size? works or not?
	
	public void setMarks() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mark of subject");
		for(int i=0;i<10;i++) {
			mark[i]=s.nextInt();
		}
		s.close();
	}
	public void getMarks() {
		System.out.println("Your Data is:");
		for(int i=0;i<5;i++) {
			System.out.println(cgpa1[i]);
		}
	}
	public static void main(String[] args) {
		String[] city=new String[]{"chennai","Bangalore","Mumbai","Pune","Delhi"};
		int[] mark=new int[] {46,34,67,23,78,89};
		
		// city -> group of string values - array holding group of reference values
		// mark -> group of integer values - array holding group of primitive integer values
		// java array can primitive values, reference values
		
		ArrayDemo ad=new ArrayDemo();
		//ad.setMarks();
		//ad.getMarks();
		float salesPercentage=64.4f; // decimal literal values in java by default double 
		System.out.println(salesPercentage);
		
		
	}

}
