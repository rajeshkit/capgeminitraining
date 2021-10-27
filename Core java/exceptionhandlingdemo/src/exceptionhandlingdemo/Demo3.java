package exceptionhandlingdemo;

public class Demo3{

	public void add() {
		try {
			throw new ArithmeticException("/ by zero is not accepted");
		}catch(ArithmeticException e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		try {
		d3.add();
		}catch (ArithmeticException e) {
			System.out.println("exceptionn recieved from catch block of add method");
		}
	}
	

}
