package Day09.Ex01_TryCatch;


class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class ClassCast {

	// (부모 클래스)    	(자식 클래스)
	//   Animal	   <-- 	 Dog, Cat
	// Animal을 Cat 으로 업 캐스팅 한 이후에,
	// 다시 Animal을 Dog로 다운 캐스팅 할 수 없다.
	// => Cat을 Dog로 타입 변환할 수 없다.
	
	public static void changeToDog(Animal animal) {
		
		// 예외 메시지 : java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;
			
		} catch (ClassCastException e) {
			System.err.println("Cat을 Dog로 변환할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);
	}
}
