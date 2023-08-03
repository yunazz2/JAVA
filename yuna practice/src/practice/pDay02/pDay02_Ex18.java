// 구구단중 유저에게 입력받은 단 출력하기
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요? : ");
		int user = sc.nextInt();
		
		
		// 아래 for문이 해당 단의 1~9 곱셈을 나타내는 부분
		for (int i = 1; i <= 9; i++) {
			System.out.println(user + "X" + i + "=" + user * i);
		}
				
		sc.close();
	}
}
