package Day02;

import java.util.Scanner;

public class Ex21_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한 루프 : 반드시 종료 조건을 추가해주어야 한다. (break)
		// while 구문의 조건을 true로 주었기 때문에 무한 루프 할 것이다. 종료 조건을 추가하면 멈출 수 있다.
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			// 대박 문자열은 '참조 자료형'이라 대등 연산자(==)를 사용할 수 없음.. 헐.. 파이썬은 되는데...
			// 그래서 eqauls라는 메소드를 사용해야 함. 아래처럼
			if(str.equals("STOP"))
				break;
			
			System.out.println(">> " + str);
			
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
