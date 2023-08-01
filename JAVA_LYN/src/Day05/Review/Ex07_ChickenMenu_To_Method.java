// 치킨 메뉴판 만들기 - 선생님 ver, 메뉴판 부분과 메뉴 이름 부분은 바뀌지 않을 값들이니까 이 값들을 메소드로 표현해보기
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

public class Ex07_ChickenMenu_To_Method {
	
	// 메뉴 출력 메소드
	// * static이 없으면 main 메소드 안에서 직접 치킨 메뉴 객체를 만들어줘야 하는데 안 만들고 메뉴판을 사용하기 위해.
	public static void printMenu() {
		System.out.println("########## 메 뉴 판 ##########");
		System.out.println("1. 굽네 치킨 - 볼케이노 치킨");
		System.out.println("2. BBQ - 황금 올리브 반반 치킨");
		System.out.println("3. 교촌치킨 - 허니 콤보");
		System.out.println("4. BHC - 뿌링클 치킨");
		System.out.println("5. 레드락 치킨 - 양념 치킨");
		System.out.println("0. 종료");
		System.out.print(">> 입력 : ");
		
	}
	
	public static String selectMenu(int menuNo) {
		String menuName = "";
		
		switch (menuNo) {
		case 1: menuName = "굽네 치킨 - 볼케이노"; break;
		case 2: menuName = "BBQ - 황금 올리브 반반 치킨"; break;
		case 3: menuName = "교촌치킨 - 허니 콤보"; break;
		case 4: menuName = "BHC - 뿌링클 치킨"; break;
		case 5: menuName = "레드락 치킨 - 양념 치킨"; break;
		}
		return menuName;
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		// 종료 시 ?개의 주문을 완료합니다 라고 출력하기 위한 ? 개수가 들어갈 변수 생성
		int count = 0;
		
		
		do {
			// 위에서 만든 메뉴판 메소드를 출력
			printMenu();
			
			menuNo = sc.nextInt();
			
			// 종료 조건(0인게 확정이 났을 때는 굳이 다음 코드를 계속 실행할 필요가 없으니까 미리 쓴다.)
			if (menuNo == 0) break;
			
			
			// 메뉴 선택
			menuName = selectMenu(menuNo);
			
			// 유효성 검사
			if (menuNo >= 1 && menuNo <= 5) {
				System.out.println("=> " + menuName + "(이)가 주문 되었습니다.");
				count++;
			}
			else {
				System.out.println("0~5 사이의 숫자를 입력해주세요.");
			}
			System.out.println();
			
		} while (true);
		
		System.out.println(count + "개의 주문을 완료합니다.");
		
		sc.close();
	}

}
