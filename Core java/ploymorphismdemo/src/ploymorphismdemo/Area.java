package ploymorphismdemo;

public class Area {  
	//function call resolving or binding of call decision will be made on compile time 
	public void add() {
		System.out.println("add");
	}
	public void findArea(int side) {// find area of square
		System.out.println(side*side);
	}
	public void findArea(int length,int breadth) {// find area for rectangle
		System.out.println(length*breadth);
	}
	public void findArea(float pi,int radius) {// find area circle
		System.out.println(pi*radius*radius);
	}
	public void findArea(float pi,String msg) {// custom area
		System.out.println(pi+msg);
	}
	public static void main(String[] args) {
		Area area=new Area();
		area.add();
		area.findArea(3.14f, 10);
		area.findArea(45, 37);
		area.findArea(23);
		area.findArea(3.14f, "custom area formula");
	}

}
