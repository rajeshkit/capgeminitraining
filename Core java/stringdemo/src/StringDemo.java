
public class StringDemo {
	public static void main(String[] args) {
		
		//String cName=new String("capgemini"); // by creating string class object
		
		String name="capgemini"; //String literal
		System.out.println(name.hashCode());
		name = name.concat(" india");
		System.out.println(name.hashCode());
		name = name.concat(" chennai");
		System.out.println(name.hashCode());
		
		String cName="capgemini";
		System.out.println(cName.hashCode());
		String finalName="capgemini";
		
	}
}
