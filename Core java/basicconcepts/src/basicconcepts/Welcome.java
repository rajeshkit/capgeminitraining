package basicconcepts;

public class Welcome {
	public static final int mark=100;// primitive instance variable
	String name; // Reference instance variable
	static float cgpa; // primitive static variable
	static String collegeName;//reference static variable
	public void show() { // instance method
		System.out.println("Show function is called");
	}
	public synchronized void display() { // instance method
		System.out.println("Display function is called");
	}
	public static void sum() { // instance method
		int price=2000; // primitive local variable
		String officeName="Amazon"; // reference local variable
		System.out.println("Hello"+price+"  "+officeName);
	}
	public static void main(String[] args) { // static method
		Welcome w=new Welcome();
		w.show();
		w.display();
	}
}
