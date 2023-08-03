package Day08.Ex01_UpDownCasting;

public class Person {

	String name;
	int age;
	
	
	public Person() {
		this("이름 없음",0);
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드 하나 정의해보자 => 사람은 일을 합니다.
	public String work() {
		return "일을 합니다.";
	}

	
	
	// toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
