// do while문을 사용하여 메뉴판 만들기
// while문은 조건이 참이면 반복하지만,
// do while문은 조건이 참이든 거짓이든 무조건 한 번은 실행 함.
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex16 {

	public static void main(String[] args) {
		int user = 0;
		String menuname = "";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("[메뉴판]");
			System.out.println("1. 떡볶이");
			System.out.println("2. 감자탕");
			System.out.println("3. 명란 바게트");
			System.out.println("4. 아무거나 주세용 사장님");
			
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			user = sc.nextInt();
			
			switch (user) {
			case 1: menuname = "떡볶이";
				break;
			case 2: menuname = "감자탕";
				break;
			case 3: menuname = "명란 바게트";
				break;
			case 4: menuname = "아무거나 주세용";
				break;
			
			}
			if (user >= 1 && user <= 4);
			System.out.print(menuname + " (을/를) 주문합니다.");
			System.out.println();
			
		} while (user != 0);
		System.out.println("메뉴판을 종료합니다.");
		System.out.println();
	}
}
