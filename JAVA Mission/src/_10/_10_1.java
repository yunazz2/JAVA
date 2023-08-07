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

public class _10_1 {
	public static void main(String[] args) {
		
		String title[] = {"성명", "출장비", "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "오원", "일원"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 데이터를 입력할까요? : ");
		int N = sc.nextInt();
		
		String name[] = new String[N];
		int money[] = new int[N];
		
		System.out.println(">> " + N + "명");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("이름과 지급액을 각각 공백을 두고 입력하세요. : ");
		
		// 이유나1 50000 이유나2 40000 이유나3 30000 이유나4 20000 이유나5 10000
		// name[] = {이유나1, 이유나2, 이유나3, 이유나4, 이유나5}
		// money[] = {50000, 40000, 30000, 20000, 10000}
		
		for (int i = 0; i < name.length; i++) {
			name[i] = sc1.next();
			money[i] = sc1.nextInt();
			
		}
		// name, money 배열 출력
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(money));
		
		

		sc.close();
	}

}