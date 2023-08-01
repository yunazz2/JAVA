// 복습 3의 배수이면 O, 아니면 X 출력하기
package Day05.Review;

import java.util.Scanner;

public class Ex01_Multiple {

	public static void main(String[] args) {
		// 정수를 하나 입력 받아서
		// 입력 받은 수가 3의 배수인지 아닌지 판단하고 그 여부를 출력하세요.
		// 3의 배수 O : "3의 배수 입니다."
		// 3의 배수 X : "3의 배수가 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int N = sc.nextInt();
		
		// 3의 배수 : 3, 6, 9, ...
		// 조건 : 3의 배수? -> 3으로 나눴을 때 나머지가 0
		if (N % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
