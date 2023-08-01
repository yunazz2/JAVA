package Day02;

import java.util.Scanner;

public class Ex18_9x9 {

	public static void main(String[] args) {
		// 구구단 출력하기 (1~9단)
		// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단? : ");
		int user = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			int result = user * i;
			System.out.println(user + "*" + i + "=" + result);
			
		}
		
		sc.close();
	}
}
