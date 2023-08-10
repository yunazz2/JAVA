// 학생을 이름순으로 정렬해보자
package Day13.Ex02_Comparable;

public class Student implements Comparable<Student> {

	String name;
	int age;
	
	// 생성자
	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// getter, setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


	
	@Override
	public int compareTo(Student o) {
		// 학생을 이름순으로 정렬(오름차순) - 가, 나, 다 ...
		String thisName = this.getName();		// 해당 객체 이름
		String comName = o.getName();			// 비교 객체 이름
		int gap = thisName.compareTo(comName);
		
		// String의 compareTo() 메소드로 문자열의 크기 비교
		// 해당 객체명.compareTo(비교 객체명)
		// * 해당 객체 > 비교 객체 : 양수
		//	 해당 객체 = 비교 객체 : 0
		//	 해당 객체 < 비교 객체 : 음수	
				
		
		return gap;
	}	
}
