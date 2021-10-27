package stringdemo;

public class MuttableDemo {
	public static void main(String[] args) {
		StringBuffer sb1; // all methods are synchronized methods
		StringBuilder sbb1; // all methods are non sysnchronized method
		
		StringBuilder sb=new StringBuilder("capgemini"); //muttable
		System.out.println(sb.capacity()+"  "+sb.length() +"  "+sb);
		sb.append(35.677);
		System.out.println(sb);
		sb.replace(0, 8, "rajesh");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
//		StringBuilder sb2 = sb.delete(5, 10);
//		System.out.println(sb2);
//		char[] ch=new char[10];
//		sb.getChars(9, sb.length(), ch, 0);
//		for(char c:ch) {
//		System.out.print(c);
//		}
//		sb.
		
	}
}
