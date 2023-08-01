package Day04.Ex01_Student;

public class StudentEx {

	public static void main(String[] args) {
		
		// Student 객체 생성
		Student student = new Student();
		student.name = "김조은";
		student.age = 20;
		student.stdNo = "20150001";
		student.major = "영상 디자인과";
		
		// Student2 객체 생성
		Student student2 = new Student("이유나", 28, "20150002", "신재생에너지");
		
		int[] scores1 = {10, 20, 30, 40, 50};	 // 학생 1의 성적
		int[] scores2 = {100, 100, 100, 90, 95}; // 학생 2의 성적
		
		// 학생1의 정보 출력
		System.out.println("############# 학생1 #############");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - 유튜브 편집 실습");
		student.study("유튜브 편집 실습");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20)); // 점수 2개를 받는 getAverage
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30, 40, 50)); // 점수 3개를 받는 getAverage
		System.out.println("학생1 - 최종 점수 : " + student.getAverage(scores1)); // 배열을 받는 getAverage ==> 결국 같은 이름을 갖는 오버로딩임

		System.out.println();
		
		// 학생2의 정보 출력
		System.out.println("############# 학생2 #############");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		System.out.println("학생2 - 플러터 공부하기");
		student2.study("플러터");
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100, 100));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100, 90, 95));
		System.out.println("학생2 - 최종 점수 : " + student2.getAverage(scores2));
	}
}
