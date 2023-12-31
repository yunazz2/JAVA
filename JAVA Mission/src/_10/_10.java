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

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		
		String title[] = {"성명", "출장비", "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "오원", "일원"};
		String name = "";
		int money = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		name = sc.next();
		System.out.print("얼마를 지급할까요? : ");
		money = sc.nextInt();
		
		
		int a1 = money / 50000; // => 지급액의 5만원권 개수
		int a11 = money % 50000; // => 지급액을 5만원으로 나누고 남은 나머지 금액
		
		int a2 = a11 / 10000; // => 지급액의 1만원권 개수
		int a22 = a11 % 10000;
		
		int a3 = a22 / 5000; // => 지급액의 5천원권 개수
		int a33 = a22 % 5000;
		
		int a4 = a33 / 1000; // => 지급액의 1천원권 개수
		int a44 = a33 % 1000;
		
		int a5 = a44 / 500; // => 지급액의 500원권 개수
		int a55 = a44 % 500;
		
		int a6 = a55 / 100; // => 지급액의 100원권 개수
		int a66 = a55 % 100;
		
		int a7 = a66 / 50; // => 지급액의 50권 개수
		int a77 = a66 % 50;
		
		int a8 = a77 / 10; // => 지급액의 10원권 개수
		int a88 = a77 % 10;
		
		int a9 = a88 / 5; // => 지급액의 5원권 개수
		int a99 = a88 % 5;
		
		int a0 = a99 / 1; // => 지급액의 1원권 개수
		int a00 = a99 % 1;
				
		int arr[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a0};
		
		// 타이틀 출력
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.print(name +  "\t" + money +  "\t");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		
		
		sc.close();
	}

}