package Day10.Ex02_Object;

class Student{
	
	int studentId;			// 학번
	String studentName;		// 이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// obj가 Student 클래스가 아니면, 다른 객체
		if(!(obj instanceof Student)) {
			return false;
		}
			
		Student student2 = (Student) obj;
		// 학번이 같으면 같은 학생
		if(this.studentId == student2.studentId) {
			return true;			
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	
}

public class StudentEquals {

	public static void main(String[] args) {
		Student student = new Student(1001, "이유나");
		Student student2 = student;
		Student student3 = new Student(1001, "이유나");
		
		if(student == student2) {
			System.out.println("student와 student2의 주소가 같습니다.");
		}
		else {
			System.out.println("student와 student2의 주소가 다릅니다.");
		}
		
		
		if(student.equals(student2)) {
			System.out.println("student와 student2는 같은 학생입니다.");
		}
		else {
			System.out.println("student와 student2는 다른 학생입니다.");
		}
		
		// ----------------------------------------------------------
		
		if(student == student3) {
			System.out.println("student와 student3의 주소가 같습니다.");
		}
		else {
			System.out.println("student와 student3의 주소가 다릅니다.");
		}
		
		
		if(student.equals(student3)) {
			System.out.println("student와 student3은 같은 학생입니다.");
		}
		else {
			System.out.println("student와 student3은 다른 학생입니다.");
		}
		
	}
}
