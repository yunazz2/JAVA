package Day13.Ex02_Comparable;

public class Person implements Comparable<Person> {

	// 변수
	String name;
	int age;
	
	// 생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
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

	
	// 컬렉션의 객체에 대한 비교 기준을 지정하는 메소드
	@Override
	public int compareTo(Person o) {
		// this : 해당 객체
		// o	: 비교 객체
		// 나이순으로 오름차순 정렬
		
		int thisAge = this.getAge();	// 해당 객체의 나이
		int comAge = o.getAge();		// 비교 객체의 나이
		
		// 방법 1
//		if(thisAge > comAge) {
//			// 나이가 큰 사람이 큰 객체다 라고 우리가 정의
//			return 1; // 1이든 2든 상관은 없다. 양수면 됨
//		}
//		if(thisAge == comAge) {
//			// 나이가 같으면 같은 크기의 객체다
//			return 0;
//		}
//		if(thisAge < comAge) {
//			// 나이가 작은 사람이 작은 객체다
//			return -1; // -1이든 -2든 상관은 없다. 음수면 됨
//		}
//		return 0;
		
		// 방법 2 방법 1의 내용을 이렇게 한 줄로 쓸 수도 있다.
		int gap = thisAge - comAge; // 오름차순
//		int gap2 = comAge - thisAge; // 내림차순
		return gap;
//		return gap2;
		
	}
	
}