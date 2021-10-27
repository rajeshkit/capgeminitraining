package exceptionhandlingdemo;

public class Demo1 {
	public static void main(String[] args) {
		try {
			//int i=10/0;// jvm it will generate implicitly an object of ArithmeticException and it will throw that exception 
			// into the catch block attached with that try
			throw new NumberFormatException();
			//throw new ArithmeticException();// jvm it will generate implicitly an object of ArithmeticException and it will throw that exception 
			// into the catch block attached with that try
		}
		catch(ArithmeticException w){
			System.out.println(w.getMessage());
			System.out.println(w.getClass());
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getClass());
		}
		
		
	}
}
