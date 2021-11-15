public class Student {
	private String name;
	private String collegeName;
	private float percentage;
	private float scholarship;
	public Student(String name, String collegeName, float percentage, float scholarship) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.percentage = percentage;
		this.scholarship = scholarship;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	
	
}
