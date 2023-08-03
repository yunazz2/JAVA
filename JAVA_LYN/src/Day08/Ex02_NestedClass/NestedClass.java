// 중첩 클래스 => 비트 연산자처럼 자주 쓰이진 않는다.// 중첩 클래스
package Day08.Ex02_NestedClass;

public class NestedClass {

	public static void main(String[] args) {
		// 아우터 클래스 A 객체 생성
		A a = new A();
		a.a = 10;
		a.b = 20;
		System.out.println("A의 a : " + a.a);
		System.out.println("A의 b : " + a.b);
		a.aMethod();
		
		// 이너 클래스인 B 객체 생성
		A.B b = a.new B(); // => A를 통해서 new를 한다.
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x : " + b.x);
		System.out.println("B의 y : " + b.y);
		b.bMethod();
	}
}
