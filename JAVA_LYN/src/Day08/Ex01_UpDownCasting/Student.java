package Day08.Ex01_UpDownCasting;

// Person 클래스를 Student 클래스에 상속
public class Student extends Person {

	int grade;
	String major;
	
	
	// 생성자
	public Student() {
		this("이름 없음", 0, 0, "없음");
	}
	
	
	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}
	
	
	// 직접 썼지만 이것도 Override임.
	public String work() {
		return "공부를 합니다.";
	}
	
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
	
	
}
