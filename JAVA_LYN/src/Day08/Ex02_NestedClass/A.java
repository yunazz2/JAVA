// 중첩 클래스 => 비트 연산자처럼 자주 쓰이진 않는다.
package Day08.Ex02_NestedClass;

/**
 * 중첩 클래스
 */
// 아우터 클래스
public class A {
	
	int a, b;
	
	// 이너 클래스
	class B{
		int x, y;

		public void bMethod() {
			System.out.println("이너 클래스에서의 아우터 클래스의 멤버에 접근 가능");
			System.out.println("A의 a : " + a);
			System.out.println("A의 b : " + b);
		}
	
	}
	
	public void aMethod() {
		System.out.println("아우터의 클래스에서 이너 클래스의 멤버에 접근 불가");
		// (에러) System.out.println("B의 x : " + x);
		// (에러) System.out.println("B의 y : " + y);
	}

}
