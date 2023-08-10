// 제네릭 기법 등장 배경
package Day12.Ex03_Generic;

class Student { }
class Developer { }

class Person {
	
	private Object object = new Object();
	
	// getter, setter
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class ObjectProduct {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setObject(new Student());
		person1.setObject(new Developer());
		
		Student student = (Student) person1.getObject();
		
		// 다양한 타입을 사용하기 위해서
		// Object 타입으로 인스턴스를 저장할 수는 있지만, 
		// 타입 변환이 불가한 상황이 발생할 수 있다.
		// ClassCastException 이 발생할 수 있다.
	}
}
