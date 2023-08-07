package Day10.Ex01_Object;


class Student{
	
	int studentId;			// 학번
	String studentName;		// 이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}

public class ObjectEquals {

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
			System.out.println("student와 student2는 같습니다.");
		}
		else {
			System.out.println("student와 student2는 다릅니다.");
		}
		
		// ----------------------------------------------------------
		
		if(student == student3) {
			System.out.println("student와 student3의 주소가 같습니다.");
		}
		else {
			System.out.println("student와 student3의 주소가 다릅니다.");
		}
		
		
		if(student.equals(student3)) {
			System.out.println("student와 student3은 같습니다.");
		}
		else {
			System.out.println("student와 student3은 다릅니다.");
		}
		
	}
}
