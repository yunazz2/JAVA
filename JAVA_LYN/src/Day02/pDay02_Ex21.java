// 유저가 STOP이라고 입력하면 반복문 종료
package Day02;

import java.util.Scanner;

public class pDay02_Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력 : ");
			String user = sc.next();
			
			
			if (user.equals("STOP"))
				break;
			
			System.out.println(">> " + user);
		}	
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
	}
}