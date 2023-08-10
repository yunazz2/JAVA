// 제네릭 기법
package Day12.Ex03_Generic;

/**
 * 제네릭 기법으로 클래스 정의하기
 * - 클래스명 뒤에 타입 매개변수 <E>, <T>, <K>, <V> 등을 작성한다.
 */

public class Box<T> {
	
	private T t;

	// getter, setter
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

	
}
