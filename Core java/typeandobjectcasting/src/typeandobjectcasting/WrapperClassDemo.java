package typeandobjectcasting;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		String mark="49";
		Integer iMark = Integer.valueOf(mark); // String to Integer wrapper object 
		int kk = Integer.parseInt(mark); // String to primitive integer object
		
		String ft="343.34";
		
		Float ft1 = Float.valueOf(ft);// String to Integer wrapper object 
		float val = Float.parseFloat(ft);// String to primitive integer object
		
		
		int salary = 10;
		
		// Way 1:// convert primitive int type to the ref type
		Integer iSalary = new Integer(salary);
		System.out.println(iSalary);
		
		
		
		//Way 2:// convert primitive int type to the ref type
		Integer i1=Integer.valueOf(10); // static method then we used to call the method using classname
		System.out.println(i1);
		
		int cSalary=i1.intValue();// converting reference Integer object into primitive int type 
		int icSalary = iSalary.intValue();
		
		
		
		Integer ii=3456;// Autoboxing - automatically converts primitive value to reference type
		
		int cc = ii; // autounboxing - automatically converts reference type into primitive type
		
		
		
		float f=34.34f;
		Float f1=Float.valueOf(f);
		
		float f3 = f1.floatValue();
		
		char ch='4';
		Character c = Character.valueOf(ch);
		
		char c1 = c.charValue();
		
		
		
		
		
	}


}
