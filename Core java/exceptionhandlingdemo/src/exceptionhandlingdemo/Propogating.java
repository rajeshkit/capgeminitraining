package exceptionhandlingdemo;

public class Propogating {
	public void subtract() throws ArithmeticException { // rajesh
		System.out.println("subtract method called");
		int t=10/0;// unchecked exception
		System.out.println("subtract method End");
		
	}
	public void multiply(){ //sanket
		System.out.println("multiply method called");
		subtract();
		System.out.println("multiply method End");
		
	}
	public void add() { // shivanisree
		System.out.println("add method called");
		multiply();
		System.out.println("add method End");
		
	}
	public static void main(String[] args) {
		Propogating p=new Propogating();
		p.add();
	}
}
