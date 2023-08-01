package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		
		int num = sc.nextInt();
		
		// 입력 받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// switch문을 사용하여 작성하세요.
		// ? % 5 : 0 1 2 3 4
		
////////////////////////////////////////////////////////////////////////////////////////
		// 1점짜리 답
//		switch (num % 5) {
//		case 0: System.out.println("*"); break;
//		case 1: System.out.println("*"); break;
//		case 2: System.out.println("**"); break;
//		case 3: System.out.println("**"); break;
//		case 4: System.out.println("**"); break;
//
//		default:
//			break;
//		}
////////////////////////////////////////////////////////////////////////////////////////
		// 5점짜리 답
		switch (num % 5) {
		case 0:
		case 1: System.out.println("*");
				break;
		case 2:
		case 3:
		case 4:
				System.out.println("**");
				break;
		// default 블록은 생략 가능하다.
		default:
				System.out.println("나머지가 4보다 큽니다.");
				break;
		}
		sc.close();
		
	}
}
