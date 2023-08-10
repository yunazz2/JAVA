package Day12.Ex04_WildCard;

public class WildCardEx {
	
	// 수강생들이, 교육과정(Course)에 수강등록을 합니다.
	
	// ? (와일드 카드)
	// : 알 수 없는 타입을 대체하기 위해서 사용하는 기호
	
	// 일반 과정
	public static void joinCourse(Course<?> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	
	// 직장인 과정
	public static void joinCourseWorker(Course<? super Worker> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	
	// 학생 과정
	public static void joinCourseStudent(Course<? extends Student> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	

	public static void main(String[] args) {
		// 일반 과정, 정원 5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add( new Person("일반인") );
		personCourse.add( new Worker("직장인") );
		personCourse.add( new Student("학생") );
		personCourse.add( new HighStudent("고등학생") );
		personCourse.add( new MiddleStudent("중학생") );
		
		// 직장인 과정, 정원 5명
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add( new Worker("직장인") );
		// workerCourse.add( new Student("학생") );
		
		// 학생 과정, 정원 5명
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add( new Student("학생") );
		studentCourse.add( new HighStudent("고등학생") );
		studentCourse.add( new MiddleStudent("중학생") );
		
		// 학생 과정, 정원 5명
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 3);
		highStudentCourse.add( new HighStudent("고등학생") );
		
		// 일반과정에 수강등록
		joinCourse(personCourse);
		joinCourse(workerCourse);
		joinCourse(studentCourse);
		joinCourse(highStudentCourse);
		System.out.println();
		
		// 직장인과정에 수강등록
		joinCourseWorker(personCourse);
		joinCourseWorker(workerCourse);
		// joinCourseWorker(studentCourse);
		// joinCourseWorker(highStudentCourse);
		System.out.println();
		
		// 학생과정에 수강등록
		// joinCourseStudent(personCourse);
		// joinCourseStudent(workerCourse);
		joinCourseStudent(studentCourse);
		joinCourseStudent(highStudentCourse);
		System.out.println();
				
	}
}





