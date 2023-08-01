/**
 * 화폐 매수 구하기 선생님 풀이
 * 
 * 금액		: 537620
 * 50000	: 10개
 * 10000	: 3개
 * 5000		: 1개
 * 1000		: 2개
 * 500		: 1개
 * 100		: 1개
 * 50		: 0개
 * 10		: 2개
 * 5		: 0개
 * 1		: 0개
 * 
 * 위와 같이 금액을 입력하면,
 * 큰 화폐 단위부터 계산하여, 화폐 단위별로 화폐 매수를 출력하는 프로그램을 작성하시오.
 */
package Day05.Review;

import java.util.Scanner;

public class Ex03_NumberOfCurrency_teacher2 {

	/*
	 [순서도]
	 1. 필요한 변수 선언
	 => (입력 금액), (화폐 매수), (화폐 단위)
	  
	 2. (입력 금액) 입력 받기
	  
	 3. 화폐 매수 계산
	 	 - 조건 : 큰 화폐 단위부터 계산한다.
	 
	 3-1. 화폐 매수 계산
	 	  10 = 537620 / 50000
	 	  (화폐 매수) = (입력 금액) / (화폐 단위)
	 
	 3-2. 잔액 계산(방법은 여러가지)
	 	  i)  37620 = 537620 - (50000 * 10) => 잔액 = 입력 금액 - 화폐 단위 * 화폐 매수
	 	  ii) 37620 = 537620 % 50000 		=> 잔액 = 입력 금액 % 화폐 단위
	  
	 3-3. 화폐 단위 변환
	 	  규칙을 보니 번갈아 가면서 /5, /2 연산을 반복한다.		=> 화폐 단위 = 화폐 단위 / 5
	 	  											=> 화폐 단위 = 화폐 단위 / 2
	 	  
	 4. 3번의 과정을 반복
	 	- 반복 조건 : 화폐 단위가 1보다 크거나 같으면 반복
	 	
	 5. 3-1에서 구한 화폐 매수를 출력한다.	  
	 */
	
	
	public static void main(String[] args) {
		
		// 1. 필요한 변수 선언
		int input;				// 입력 금액
		int count;				// 화폐 매수
		int money = 50000;		// 화폐 단위 -> 가장 큰 화폐 단위부터 시작
		boolean sw = true;		// 화폐 단위를 전환하는 변수
		
		// 2. 금액 입력 받아 변수에 저장하기
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		while (money >= 1) {
				
			// 3-1. 화폐 매수 계산
			count = input / money;
			System.out.println(money + "\t 원권 : " + count + "개"); // \t(백슬래시t) : 탭 만큼 공백 생성
			
			// 3-2. 잔액 계산
			input = input - (money * count);
			
			// 3-3. 화폐 단위 변환
			if (sw) {
				money = money / 5;	
//				sw = false;
			}
			else {
				money = money / 2;
//				sw = true;
			}
			sw = !sw; // !는 Not 연산 : true -> false, false -> true로 변환 가능
		
		}
		sc.close();
	}
	
	
}
