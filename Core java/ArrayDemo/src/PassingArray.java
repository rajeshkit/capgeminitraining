public class PassingArray {
	
	public float caulcuatePercentage(byte[] m) { // logic of this method
		int totalMarks=0;
		for(int i=0;i<m.length;i++) {
			totalMarks=totalMarks+m[i];
		}
		float percentage = (totalMarks / m.length) ;
		return percentage;
	}
	public static void main(String[] args) {
		byte[] mark= {67,56,89,90,56,45,90,56};// local array variable
		char[] gender=new char[]{'m','f','t'};// a-z A-Z 0-9, any special characters
		String name="ajay";
		PassingArray passPercentage=new PassingArray();
		System.out.println("Your perventage: "+passPercentage.caulcuatePercentage(mark));
	}
}
