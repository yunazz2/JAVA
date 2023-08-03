// 5개의 정수를 입력받아 양수만 합계를 구하세요.
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
				
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
						
			if (a < 0) {
				continue;
			}
			sum += a;
		}
		
		System.out.println("양수의 합은 : " + sum);
		
		sc.close();
	}
}