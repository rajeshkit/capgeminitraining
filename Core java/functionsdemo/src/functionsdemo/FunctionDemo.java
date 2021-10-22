package functionsdemo;
public class FunctionDemo {
	public void add(int a,int b) { //perform task or logic
		int c=a+b;// logic
		System.out.println(c);
	}
	public void multiply() {//perform task or logic
		int a=29;
		int b=45;
		int c=a*b;
		System.out.println(c);
	}
	public int sub() {//perform task or logic
		int a=29;
		int b=45;
		int c=a-b;
		return c;
	}
	public int division(int a, int b) {//perform task or logic
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		FunctionDemo fd=new FunctionDemo();
		fd.add(456,888);
		fd.multiply();
		int result = fd.sub();
		int sum = result * 34 /100;
		int value=fd.division(34, 46);
		AreaCalculation area=new AreaCalculation();
		double sphere = 4 * area.circleArea(45);
		System.out.println(sphere);
		
		double answer=Math.exp(34.5);
		System.out.println(answer*45);
	}	
	
	
	
}
