// 중첩 인터페이스 I를 구현 할 클래스

// 학원 출석 방법중 카드 출결 하는 방법
package Day08.Ex03_NestedInterface;

public class ImplClass implements I.J {

	@Override
	public void method1() {
		System.out.println("중첩 인터페이스 - method1()");
		
	}

	@Override
	public void method2() {
		System.out.println("중첩 인터페이스 - method2()");
		
	}
	

}
