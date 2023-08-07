/*
 • (조건)
- do~while 문, switch 문, static 메소드 정의 및 호출을 반드시 사용하시오.
- 정수1~3 입력 시, 해당 메뉴 이름과 주문안내 문구를 출력하시오.
- 정수 0~3 이외의 번호를 입력하면, 0~3 사이의 번호를 입력하도록 요청하는 안내문구를 출력하시오.
- 정수 0 입력 시, 주문한 메뉴 개수와 주문완료 메시지를 출력하시오

 *********** 치킨 메뉴판 **********
1. 황금올리브 반반한 치킨
2. 뿌잉클 치킨
3. 처갓집에서 호식이가 만든 치킨
0. 종료
********** 번호 : 2
‘뿌잉클 치킨’이(/가) 주문되었습니다.

********** 치킨 메뉴판 **********
1. 황금올리브 반반한 치킨
2. 뿌잉클 치킨
3. 처갓집에서 호식이가 만든 치킨
0. 종료
********** 번호 : 5
(0~3) 사이의 번호를 입력해주세요.

********** 치킨 메뉴판 **********
1. 황금올리브 반반한 치킨
2. 뿌잉클 치킨
3. 처갓집에서 호식이가 만든 치킨
0. 종료
********** 번호 : 0
총 5 개의 상품이 주문되었습니다.
 */


package _05;

import java.util.Scanner;

public class _05_ChickenMenu {

	public static void main(String[] args) {
		
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		
		do {
			System.out.println("*********** 치킨 메뉴판 **********");
			System.out.println("1. 황금 올리브 반반한 치킨");
			System.out.println("2. 뿌잉클 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("********** 번호 : ");
			
			menuNo = sc.nextInt();
			
			if (menuNo == 0) break;
			
			
			switch (menuNo) {
			case 1: menuName = "황금 올리브 반반한 치킨"; break;
			case 2: menuName = "뿌잉클 치킨"; break;
			case 3: menuName = "처갓집에서 호식이가 만든 치킨"; break;
			}
		
			if (menuNo >= 1 && menuNo <= 3) {
				System.out.println(menuName + "이(/가) 주문되었습니다.");
				count++;
			}
			else {
				System.out.println("0~3 사이의 수를 입력하세요.");
			}
			System.out.println();
			
		} while (true);
		
		// do문 안에서 0번으로 메뉴판 종료시 바로 아래 출력 됨.
		System.out.println(count + "개의 주문을 완료합니다.");
		sc.close();
	}
}
