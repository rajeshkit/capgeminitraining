package stringdemo;

public class StringMethodsDemo {
	public static void main(String[] args) {
		
		char[] b= {'f','y','R','c','B'};
		StringBuffer sb=new StringBuffer("capgemini");
		StringBuilder sbb=new StringBuilder("capgemini chennai");
		String str=new String();
		System.out.println(str.length()+" "+str);
//		
//		String collegeName="Indian Institute of Technology Indian Indian";
//		String email = "rajesh.kit@gmail.com";
//		System.out.println(email.contains("@"));
//		System.out.println("**********************************");
//		String joined=String.join("-", email,collegeName,"welcome","hai");
//		System.out.println(joined);
//		
//		String[] str = joined.split("-");
//		for(String s:str) {
//			System.out.println(s);
//		}
//		System.out.println("**********************************");
//		
//		System.out.println(collegeName);
//		System.out.println(collegeName.replace("Indian", "British"));
//		
//		int l=collegeName.length();
//		System.out.println(l);
//		boolean b = collegeName.isEmpty();
//		System.out.println(b);
//		char c = collegeName.charAt(18);// from 16 what is the char value
//		System.out.println(c);
//		int i = collegeName.indexOf('t');
//		System.out.println(i);
//		System.out.println(collegeName.indexOf('n'));
//		System.out.println(collegeName.indexOf("te"));
//		
//		int val = collegeName.codePointAt(18); // index char for the char unicode val
//		System.out.println(val);
//		System.out.println(collegeName.codePointBefore(18));
//		System.out.println(collegeName.codePointCount(0, 4));
//		char[] cName = new char[20];
//		collegeName.getChars(8, 25, cName, 0);
//		
//		for(char m:cName) {
//			System.out.print(m);
//		}
//		
//		String department="CSE";
//		String major="CSE";
//		System.out.println(department.equals(major)); // comparing string with the string
//		System.out.println(department.equalsIgnoreCase(major));
//		
//		System.out.println(department.compareTo(major)); 
//			// department<major  return negative value
//			// department>major  return positive value
//			// department==major return 0
//		System.out.println(department.compareToIgnoreCase(major)); 
//		
//		System.out.println(department.regionMatches(1, major, 1, 1));
	}
}
