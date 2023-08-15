/**
 * 다음의 <조건> 에 따라 화폐매수를 구하는 프로그램을 작성하시오.
 * <조건>
(1) 화폐는 고액권을 우선으로 지급, 나머지 금액은 그 다음 단위의 화폐 순서로 지급한다.
(2) 화폐 단위는 50000원, 10000원 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원의 10가지 종류가 있다.
(3) 입력데이터는 성명, 간식비 지급액이며, 성명의 입력이 "QUIT" 이면 입력의 끝으로 간주한다.
(4) 출력은 성명, 간식비 지급액, 개인별 각 화폐 매수, 마지막에 전체 화폐 매수를 출력한다.

[입력]
솔라 623,843원
문별 728,394원
휘인 432,942원
화사 942,783원

[출력]
성명			  출장비 오만원 만원 오천원  천원 오백원 백원 오십원 십원 오원  일원
솔라 			623843  12   2   0    3    1   3    0   4   0   3
문별 			728394  14   2   1    3    0   3    1   4   0   4
휘인 			432942   8   3   0    2    1   4    0   4   0   2
화사 			942783  18   4   0    2    1   2    1   3   0   3
전체 화폐매수 :			52  13   1   10    3   12   2   15  0   12
 */
package _10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class _10_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명의 데이터를 입력할까요? : ");
		
		int 몇명 = sc.nextInt();
		
		int count;
		int money = 50000;
		boolean sw = true; // 화폐 단위 변환을 위한 스위치
		
		String[] name = new String[몇명];
		int[] inputMoney = new int[몇명];
		
		int a = 0;
		while (a < 몇명) {
			System.out.print("이름을 입력하세요. : ");
			name[a] = sc.next();
			
			if(name.equals("QUIT") || name.equals("quit")) {
				break;
			}
			
			System.out.print("간식비 지급액을 입력하세요. : ");
			inputMoney[a] = sc.nextInt();
			
			a++;
		} // 여기까지 이름, 간식비 지급액 입력 받아 각각 name, money 배열로 저장 함
		
		
		while(money >= 1) { // 화폐 최고 단위인 50000원권부터 시작해 1원이 될 때까지 반복
			
			for (int i = 0; i < 몇명; i++) {
				System.out.print("=> " + name[i] + "은 / 는");
				for (int j = 0; j < 몇명; j++) {
					count = inputMoney[j] / money;
					System.out.println(money + "원권 : " + count + "개");
					
					inputMoney[j] = inputMoney[j] - (money * count);
				}
				if(sw) {
					money = money / 5;
				}
				else {
					money = money / 2;
				}
				sw = !sw;
					
			}
		}
		
		sc.close();
	}
}





//for (int i = 0; i < 몇명; i++) {
//	count = inputMoney[i] / money;
//	System.out.println("=> " + name[i] + " 은/는 ");
//	System.out.println(money + "원권 : " + count + "개");
//	
//	inputMoney[i] = inputMoney[i] - (money * count);
//}
//if(sw) {
//	money = money / 5;
//}
//else {
//	money = money / 2;
//}
//sw = !sw;