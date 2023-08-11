package Day13.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;

	// 생성자
	public User() {
	}

	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	// getter, setter
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
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

	
	// toString()
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준 1 : 나이 순으로 오름차순
		// 정렬 기준 2 : 이름 순으로 오름차순
		// * 반대로, 내림차순으로 정렬하려면, 반환값에 (-)음수를 붙여준다.
		
		// o1 나이 > o2 나이 : 양수
		if(o1.age > o2.age ) {
			return 1;
		}
		
		// o1 나이 < o2 나이 : 음수
		if(o1.age < o2.age) {
			return -1;
		}
		
		
		/**
		 o1 나이 == o2 나이
		  i) o1 이름순 > o2 이름순 : 양수
		 ii) o1 이름순 < o2 이름순 : 음수
		 */

		
		
		/**
		 선생님 방법1
		 */
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		String name1 = o1.getName();
		String name2 = o2.getName();
		// o1 객체의 나이를 age1에 저장 해! o2 객체의 나이를 age2에 저장 해! o1 객체의 이름을 name1에 저장 해! o2 객체의 이름을 name2에 저장 해!
		
		int result1 = age1 - age2;
		int result2 = name1.compareTo(name2);
		// result1에 o1 객체의 나이 - o2 객체의 나이를 계산해서 저장 해!
		// result2에 o1 객체의 이름순을 o2 객체의 이름순과 비교해서 나온 값을 저장 해!
		
		return result1 == 0 ? result2 : result1;
		// result1이 0이라는건? 나이가 같다는 거니깐 result2를 반환 해!, 0이 아니면 result1을 반환 해!
		
		/**
		 선생님 방법2
		 */
//		int age1 = o1.getAge();
//		int age2 = o2.getAge();
//		String name1 = o1.getName();
//		String name2 = o2.getName();
//		
//		// 단독 if문으로 쓰는 경우, 첫 번째 조건에서 만족할 시 메소드가 리턴하며 끝나버리기 때문에.
//		if(age1 > age2) return 1;
//		if(age1 < age2) return -1;
//		if(age1 == age2) {
//			// 해당문자열.compareTo(비교할 문자열) - String 클래스의 compareTo()
//			// - 해당문자열 > 비교문자열 : 해당 문자열이 비교 문자열보다 사전순으로 더 뒤에 있는 경우  => 양수 반환
//			// - 해당문자열 = 비교문자열 : 해당 문자열이 비교 문자열과 같은 위치에 있는 경우 		=> 0 반환
//			// - 해당문자열 < 비교문자열 : 해당 문자열이 비교 문자열보다 사전순으로 더 앞에 있는 경우  => 음수 반환
//			int gap = name1.compareTo(name2);
////			if(gap > 0) return 1;
////			if(gap == 0) return 0;
////			if(gap < 0) return -1;
//			return gap;
//		}
		
		
		/**
		 선생님 방법3
		 */
//		int result1 = age1 - age2;
//		int result2 = name1.compareTo(name2);
//		
//		if(result1 == 0) return result2;
//		return result1;
		
		
		/**
		 선생님 방법 4
		 */
//		int result1 = age1 - age2;
//		int result2 = name1.compareTo(name2)
//		return result1 == 0 ? result2 : result1;
		
		
		
		/**
		 내 방법
		 */
//		String thisName = o1.getName(); // o1 객체 이름
//		String comName = o2.getName(); 	// o2 객체 이름
//		int gap = thisName.compareTo(comName);
//
//		if(o1.age == o2.age && gap > 0) {
//			return 1;
//		}
//		if(o1.age == o2.age && gap < 0) {
//			return -1;
//		}
//					
//		return 0;
	}
}
