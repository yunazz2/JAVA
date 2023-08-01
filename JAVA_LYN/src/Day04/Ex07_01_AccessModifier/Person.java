package Day04.Ex07_01_AccessModifier;

public class Person {
	
	// 사람을 정의해보자.
	// 사람의 특성 : 이름, 키, 나이, 체중
	public String name; // => 가장 공개적인 이름을 퍼블릭으로,
	protected int height;
	int age;
	private int weight; // => 가장 보호하고 싶은 몸무게를 프라이빗으로
	
//	// 기본 생성자(shift + alt + S -> Generate 어쩌고 저쩌고 슈퍼 클래스)
	public Person() {		
	}
	

//	// 매개변수 생성자	
	
	public String getName() {
		return name;
	}
	public Person(String name, int height, int age, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}

//	// getter, setter

	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
//	// toString

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", weight=" + weight + "]";
	}
	
}




