package Day13.Ex02_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student("이유나", 28);
		Student s2 = new Student("김유나", 20);
		Student s3 = new Student("최유나", 18);
		Student s4 = new Student("강유나", 34);
		Student s5 = new Student("박유나", 12);
		Student s6 = new Student("정유나", 21);
		Student s7 = new Student("한유나", 23);
		Student s8 = new Student("윤유나", 29);
		Student s9 = new Student("이구나", 38);
		Student s10 = new Student("한유나", 26);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		
		// 이름순
		Collections.sort(studentList);
		
		for (Student student : studentList) {
			System.out.println(student.name + " : " + student.age);
		}
	}
}
