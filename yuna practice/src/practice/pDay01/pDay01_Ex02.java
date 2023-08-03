// 유저에게 정수를 입력 받아 추출하기
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int a = sc.nextInt();
		
		System.out.println("입력된 값은 " + a + " 입니다.");
		
		sc.close();
	}
}
