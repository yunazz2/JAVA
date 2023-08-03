// 산술 연산자 (+, -, *, /, %)
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값1 과 값2를 공백을 두고 정수로 입력하세요. : ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
		
		sc.close();
	}
}
