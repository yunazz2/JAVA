// for문 연습하기

// for( 1초기식 ; 2조건식 ; 4증감식 )
//		{ 3실행문; }
// 실행 순서 : 1 -> 반복(2 -> 3 -> 4)

package practice.pDay02;

public class pDay02_Ex17 {

	public static void main(String[] args) {
		
		
		// 1. 1~10까지의 정수를 출력하세요.
		System.out.print("1~10까지의 정수 : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 2. 50~100까지의 정수를 출력하세요.
		System.out.print("50~100까지의 정수 : ");
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 3. 1~20까지의 정수 중 짝수만 출력하세요.
		System.out.print("1~20까지의 정수 중 짝수 : ");
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		// 4. 1~20까지의 정수 중 홀수만 출력하세요.
		System.out.print("1~20까지의 정수 중 홀수 : ");
		for (int i = 1; i <= 20; i+=2) {
			System.out.print(i + " ");
			
		}
	}
}
