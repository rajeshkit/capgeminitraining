package ploymorphismdemo;


public class ABCCollege extends AnnaUniversity {
	@Override
	public void internalMarks() {
		System.out.println("Keep the test");
		System.out.println("unit test");
	}
	public static void main(String[] args) {
		AnnaUniversity abc=new ABCCollege();
		abc.internalMarks();
	}
}
