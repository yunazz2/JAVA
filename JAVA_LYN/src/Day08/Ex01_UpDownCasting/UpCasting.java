// 업캐스팅이란? 자동 타입 변환
// (부모 클래스) = (자식 클래스)

package Day08.Ex01_UpDownCasting;

public class UpCasting {
	
	public static void main(String[] args) {
		
		/**
		 * 업 캐스팅
		 * (부모 클래스) = (자식 클래스)
		 */
		Person person = new Student("이유나", 28, 1, "신재생에너지"); // (이름, 나이, 학년, 전공)
		
		// Person	: name, age
		// student 	: name, age, grade, major
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);
		
		
		/**
		 *  Person 객체에서는 grade, age 변수를 접근할 수 없다.
		 *  아래를 활성화시키면 에러가 나는 것은, 부모 클래스인 Person에 grade, major 변수가 없기 때문이다.
		 */
//		System.out.println("grade : " + person.grade);
//		System.out.println("major : " + person.major);
		
		
		/**
		 *  클래스를 업캐스팅 하면, 변수는 부모 클래스에 있는 변수만 접근 가능하고,
		 *  메소드는 자식 클레스의 메소드가 우선하여 실행된다.
		 */
		System.out.println(person);
		System.out.println(person.work()); // 오버라이딩 된 것.
		
		
		/**
		 *  여기까지만 작성하고 실행 시 결과 : 
		 */
//		name : 이유나
//		age : 28
//		Student [grade=1, major=신재생에너지]
//		공부를 합니다. => ln25, 26을 보면 person을 호출했는데 왜 student에 있는 '공부를 합니다.'가 출력되는가? 오버라이딩 돼서.
		
		
		/**
		 * 바인딩(Binding) : 프로그램에서 사용되는 요소에 실제 값을 결정 짓는 행위
		 * - 정적 바인딩 : 컴파일 시간에 결정
		 * 	=> 변수 등
		 * 
		 * - 동적 바인딩 : 실행 시간에 결정
		 * 	=> 오버라이딩 등
		 */
	}

}
