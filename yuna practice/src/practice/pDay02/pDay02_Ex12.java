// 입력 받은 정수를 5로 나눈 나머지
// 2보다 작으면 "*" 출력
// 그렇지 않으면 "**" 출력
// switch문을 사용하여 작성하세요.
// ? % 5 : 0 1 2 3 4
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int a = sc.nextInt();
		
		
		switch (a % 5) {
		
		case 0 : System.out.println("*");
			break;
		case 1 : System.out.println("*");
			break;
		case 2 : System.out.println("**");
			break;
		case 3 : System.out.println("**");
			break;
		case 4 : System.out.println("**");
			break;
		case 5 : System.out.println("**");
			break;
		default : break;
		}
		
		sc.close();
	}
}
