package typeandobjectcasting;

public class Demo {
	public static void main(String[] args) {
		long b=345;  //32 bit
		double total = b; //32 bit implicit casting
		System.out.println(total);
		
		double f=343.44f; //32 bit
		long c=(long)f; //32 bit //explicit casting
		System.out.println(c);
		
		char ch='e';
		int m = ch;
		
		System.out.println((char)74);
		
	}
}
