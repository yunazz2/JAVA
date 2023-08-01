package Day04.Ex01_Student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기

	
	// 변수(학생의 속성을 변수로)
	String name;
	int age;
	String stdNo;
	String major;
	
	
	// 생성자
	// - 기본 생성자
	public Student() {
		this("이름 없음", 1, "00000000", "없음");
	}
	
	// - 모든 매개변수를 포함하는 생성자(직접 작성 안 해도 alt + shift + S -> O로 바로 생성 가능)
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	
	// 메소드(학생의 행동을 메소드로)
	// - 공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// * 반환 타입이 void이면, return을 생략해도 된다.
	}
	
	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2;
		// average = (score1 + score2) / 2; // 내가 적은 식 => 틀림 => 점수를 int로 받기 때문에 double로 바꿔주는 형 변환 필요. 
		return average;
	}
	
	// 메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}
	
	public double getAverage(int[] scores) {
		double average = 0.0;
		
		// x개의 성적의 평균을 구해라.
		int sum = 0;
		
		// 합계
		for (int score : scores) {
			sum += score;
		}
			
		// 평균
		average = (double) sum / scores.length;
				return average;
		
	}
}