// 치킨 메뉴판 만들기 - 그냥 전에 do-while문 때 만들었던 메뉴판 따라서 만든 코드.. 뭣도 모름... 에후
/*
	########## 메 뉴 판 ##########
	1. 굽네 치킨 - 볼케이노 치킨
	2. BBQ - 황금 올리브 반반 치킨
	3. 교촌치킨 - 허니 콤보
	4. BHC - 뿌링클 치킨
	5. 레드락 치킨 - 양념 치킨
	0. 종료
	########## 입력 : 
	
	메뉴 번호에 따라 메뉴 변수에 해당 메뉴를 저장해주고,
	"(해당 메뉴) 이/가 주문 되었습니다." 라고 출력하시오.
	0을 입력하기 전까지 반복하고,
	0을 입력하면 반복을 종료합니다.
	종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
 */
package Day05.Review;

import java.util.Scanner;

public class Ex07_ChickenMenu {
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("########## 메 뉴 판 ##########");
			System.out.println("1. 굽네 치킨 - 볼케이노 치킨");
			System.out.println("2. BBQ - 황금 올리브 반반 치킨");
			System.out.println("3. 교촌치킨 - 허니 콤보");
			System.out.println("4. BHC - 뿌링클 치킨");
			System.out.println("5. 레드락 치킨 - 양념 치킨");
			System.out.println("0. 종료");
			System.out.print(">> 입력 : ");

			menuNo = sc.nextInt();

			switch (menuNo) {
			case 1: menuName = "굽네 치킨 - 볼케이노"; break;
			case 2: menuName = "BBQ - 황금 올리브 반반 치킨"; break;
			case 3: menuName = "교촌치킨 - 허니 콤보"; break;
			case 4: menuName = "BHC - 뿌링클 치킨"; break;
			case 5: menuName = "레드락 치킨 - 양념 치킨"; break;
			}
			
			
			if (menuNo >= 1 && menuNo <= 5) {
				System.out.println("=> " + menuName + "(이)가 주문 되었습니다.");
			}
			System.out.println();
			
		} while (menuNo != 0);
		System.out.print("메뉴판을 종료합니다.");
		
		
		sc.close();
	}

}
