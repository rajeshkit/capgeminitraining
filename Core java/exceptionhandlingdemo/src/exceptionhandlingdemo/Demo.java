package exceptionhandlingdemo;

public class Demo {
	public static void main(String[] args) {
		int e = 20;
		String input="546";
		int[] e1 = new int[3];
		System.out.println("Hello");
		System.out.println("welcome");
		System.out.println("capgemini");
		try{
			int total = e / 0; // ae
			System.out.println(total);
			System.out.println(e1[1]);
			int myValue = Integer.parseInt(input);//NumberFormatException
			System.out.println(myValue);
		}catch(RuntimeException ex) {
			System.out.println("arithmethic catch block");
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}
//		}catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("outofbounds catch block");
//			System.out.println(ex.getMessage());
//			System.out.println(ex.getClass());
//		}catch(NumberFormatException ex) {
//			System.out.println("numberformat catch block");
//			System.out.println(ex.getMessage());
//			System.out.println(ex.getClass());
//		}
		finally {
			System.out.println("finally block is executed");
		}
		System.out.println("India");
		System.out.println("USA");

	}
}
