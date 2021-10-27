package typeandobjectcasting;

public class Master {
	public static void main(String[] args) {
		Student s=new Student();
		Master m=new Master();
		m=s; // implicit casting
		s=(Student)m; // explicit casting
	}
}
