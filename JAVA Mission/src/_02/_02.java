/** 완료
 * 정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고,
 * 정수 1부터 N까지 홀수의 합계와 짝수의 합계
 * 그리고 정수 N의 약수를 구하여 예시 <출력>과 같이 출력하는 프로그램을 작성하시오. ( 1 ≤ N ≤ 100 )
 */
package _02;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요(1 <= 정수 <= 100) : ");
		
		int N = sc.nextInt();

		System.out.println();
		
		int evenSum = 0; // 1~N까지의 정수 중 짝수의 합
		int oddSum = 0; // 1~N까지의 정수 중 홀수의 합
		int factor = 0; // 정수 N의 약수
		
		for (int i = 1; i <= N; i++) {
			// 홀수일 때
			if(i % 2 == 1 && i != N-1) {
				oddSum += i;
				System.out.print(i + "+");
			}
			else if(i % 2 == 1 && i == N-1) {
				oddSum += i;
				System.out.println(i + "=");
			}
			else if(i % 2 == 0 && i != N) {
				evenSum += i;
				System.out.print(i + "+");
			}
			else {
				evenSum += i;
				System.out.print(i + "=");
			}
		}
		System.out.println();
		
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
		
		for (int j = 1; j <= N; j++) {
			if(N % j == 0) {
				System.out.print(j+" ");
			}
		}

		sc.close();
	}	
		
		
}
