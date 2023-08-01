package Day02;

import java.util.Scanner;

public class Ex16_DoWhile {

	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
				
		
		// do~while문 : 무조건 1회는 실행 후 조건을 검사하여 반복하는 문장
		do {
			System.out.println("#### 점심 메뉴판 #####");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쌀국수");
			System.out.println("4. 라면");
			System.out.println("5. 돈까스");
			System.out.println("6. 버거킹");
			System.out.print("메뉴 번호 : ");
			
			menuNo = sc.nextInt(); // 메뉴 번호 입력
			
			switch (menuNo) {
				case 1:	menuName = "떡볶이"; break;
				case 2:	menuName = "김밥"; break;
				case 3:	menuName = "쌀국수"; break;
				case 4:	menuName = "라면"; break;
				case 5:	menuName = "돈까스"; break;
				case 6:	menuName = "버거킹"; break;
				default: menuName = "(굶음)"; break;
			}
			
			// 메뉴 번호 유효성 검사
			if( menuNo >= 1 && menuNo <=6 ) {
				System.out.println(menuName + "(을/를) 먹었습니다.");
				System.out.println();
			}
			
		} while (menuNo != 0);
		System.out.println("메뉴판을 종료합니다.");
		
		sc.close();
	}
}
