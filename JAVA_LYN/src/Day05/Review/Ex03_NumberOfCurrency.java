/**
 * 화폐 매수 구하기 내 풀이
 * 
 * 금액		: 537620
 * 50000	: 10개
 * 10000	: 3개
 * 5000		: 1개
 * 1000		: 2개
 * 500		: 1개
 * 100		: 1개
 * 50		: 0개
 * 10		: 2개
 * 5		: 0개
 * 1		: 0개
 * 
 * 위와 같이 금액을 입력하면,
 * 큰 화폐 단위부터 계산하여, 화폐 단위별로 화폐 매수를 출력하는 프로그램을 작성하시오.
 */
package Day05.Review;

import java.util.Scanner;

public class Ex03_NumberOfCurrency {

	/*
	 * [순서도]
	 * 1. 금액을 입력 받는다.
	 * 2. 입력받은 금액을 가장 큰 단위 화폐인 50000원으로 나눈다.
	 * 3. 2번에서 남은 나머지 금액을 10000원으로 나누어 몫을 출력한다.
	 * 4. 3번에서 남은 나머지 금액을 5000원으로 나누어 몫을 출력한다.
	 * 5. .. 계속해서 1원으로 나누어 몫을 출력한다.
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		
		int N = sc.nextInt();
		
		int a = N / 50000; // 입력받은 금액을 50000원권으로 몇 장?
		int a1 = N % 50000;
		
		int b = a1 / 10000; // 남은 금액을 10000원권으로 몇 장?
		int b1 = a1 % 10000;
		
		int c= b1 / 5000; // 남은 금액을 5000원권으로 몇 장?
		int c1 = b1 % 5000;
		
		int d = c1 / 1000;
		int d1 = c1 % 1000;
		
		int e = d1 / 500;
		int e1 = d1 % 500;
		
		int f = e1 / 100;
		int f1 = e1 % 100;
		
		int g = f1 / 1000;
		int g1 = f1 % 1000;
		
		int h = g1 / 1000;
		int h1 = g1 % 1000;
		
		int i = h1 / 1000;
		int i1 = h1 % 1000;
		
		int j = i1 / 1000;
		int j1 = i1 % 1000;
		
		
		System.out.println("50000원권 : " + a + "장");
		System.out.println("10000원권 : " + b + "장");
		System.out.println("5000원권 : " + c + "장");
		System.out.println("1000원권 : " + d + "장");
		
		
		
		sc.close();
		
	}
	
	
}
