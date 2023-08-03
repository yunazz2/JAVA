// 유저에게 입력받은 값이 홀수인지 짝수인지 판별
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	
		sc.close();
	}
}
