// 다운 캐스팅이란? 강제 형 변환
// * 전제 조건 - 업 캐스팅이 우선 되었어야 한다.
// : 다운 캐스팅은 업 캐스팅 된 부모 객체를 자식 객체로 변환하는 것
// 업 캐스팅 : (자식) -> (부모)
// 다운 캐스팅 : (부모) -> (자식)
package Day08.Ex01_UpDownCasting;

public class UpDownCasting {

	public static void main(String[] args) {
		
		// 업 캐스팅
		Person person = new Student("이유나", 28, 1, "신재생에너지");
		
		System.out.println(person);
		System.out.println(person.work());
		
		// 다운 캐스팅
		Student student = (Student) person; // 부모 클래스인 person을 student로 강제 형 변환
		
		System.out.println(person);
		System.out.println(person.work());
		
		System.out.println("grade : " + student.grade);
		System.out.println("major : " + student.major);
		
	}
}
