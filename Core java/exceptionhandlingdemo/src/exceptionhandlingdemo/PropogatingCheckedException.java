package exceptionhandlingdemo;

public class PropogatingCheckedException {
	public void subtract() throws ClassNotFoundException { // rajesh
		System.out.println("subtract method called");
		throw new ClassNotFoundException();// checked exception
	}
	public void multiply() throws ClassNotFoundException { //sanket
		System.out.println("multiply method called");
		subtract();
		System.out.println("multiply method End");
		
	}
	public void add() throws ClassNotFoundException { // shivanisree
		System.out.println("add method called");
		multiply();
		System.out.println("add method End");
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		PropogatingCheckedException p=new PropogatingCheckedException();
		p.add();
	}
}
