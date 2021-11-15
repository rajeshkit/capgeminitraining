import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Portal {
	ArrayList<Student> studentList;

	void assignScholarship() {
		for (Student s : studentList) {
			if (s.getPercentage() >= 91 && s.getScholarship() <= 100) {
				s.setScholarship(10000);
			}
			if (s.getPercentage() >= 81 && s.getPercentage() <= 90) {
				s.setScholarship(5000);
			}
			if (s.getPercentage() <= 80) {
				s.setScholarship(0);
			}
		}
	}

	float totalScholarship() {
		float total = 0;
		for (Student s : studentList) {
			total = total + s.getScholarship();
		}
		return total;
	}

	String totalScholarshipOfCollege() {

		ArrayList<String> cName = new ArrayList<String>();
		for (Student s : studentList) {
			cName.add(s.getCollegeName());
		}
		Map<String, Float> map = new HashMap<String, Float>();
		for (String name : cName) {
			float total = 0;
			for (Student stu : studentList) {
				if (name.equals(stu.getCollegeName())) {
					total = total + stu.getScholarship();
				}
			}
			map.put(name, total);

		}

		Optional<Float> max = map.values().stream().max((e1, e2) -> Float.compare(e1, e2));
		String maxCollegeName = null;
		for (Entry<String, Float> es : map.entrySet()) {
			if (es.getValue() == max.get()) {
				maxCollegeName = es.getKey();
			}
		}
		return maxCollegeName;

	}

	public static void main(String[] args) {

		Portal p = new Portal();
		p.studentList = new ArrayList<Student>();
		p.studentList.add(new Student("Steve", "NIT", 89, 0));
		p.studentList.add(new Student("Bob", "NIT", 94, 0));
		p.studentList.add(new Student("Alice", "Abcd", 99, 0));

		p.assignScholarship();
		System.out.println(p.totalScholarship());
		System.out.println(p.totalScholarshipOfCollege());

	}
}
