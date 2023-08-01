package Day01;

public class Ex05_Variable {

	public static void main(String[] args) {
		// 변수 선언 => 자료형 변수명;
		
		// 변수 선언 및 초기화 => 자료형 변수명 = 값;
		
		int x; // int형 변수 x 선언
		int y; // int형 변수 y 선언
		// 같은 자료형이라면 옆으로 나열해서 써도 됨(ex. int x, y -> 이런식으로)
		
		// = (대입 연산자)
		// A = B : B라는 값을 변수 A에 대입하는 연산자
		
		x = 10;
		y = 20;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("x + y = " + (x+y)); // 합계
		System.out.println("(x + y) / 2 = " + (x+y) / 2); // 평균
		
	}
}