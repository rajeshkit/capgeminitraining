
public class StringDemo1 {
	public static void main(String[] args) {
		String name=new String("capgemini");//string one arg constructor of string
		System.out.println(name);// capgemini
		
		String cName=new String("capgemini india");
		System.out.println(cName);
	
		System.out.println(name.hashCode()+"  "+cName.hashCode());
	}
}
