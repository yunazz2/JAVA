package Day05.Review;

import java.util.Scanner;

public class Ex08_Method {
	
	// plus 공식 메소드
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// minus 공식 메소드
	public static int minus(int a, int b) {
		int result = a - b;
		// return (값);
		// 1. (값)을 메소드 호출한 차지로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메소드 호출 : 메소드명( 인자1, 인자2 );
		// - 전달 인자(argument)
		
		System.out.println(plus(a, b));
		System.out.println(minus(a, b));
		
		
		sc.close();
	}
}
