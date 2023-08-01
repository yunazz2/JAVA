package Day02;

import java.util.Scanner;

public class Ex06_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해보세요. : ");
		int num = sc.nextInt();
		
		// 유저에게 입력받은 값이 홀수인지 짝수인지 판단하시오.
		// 홀수, 짝수 조건?
		// if( 조건 ) {	}
		if( num % 2 == 1 ) {
			System.out.println("홀수 입니다.");
		}
		if( num % 2 == 0 ) {
			System.out.println("짝수 입니다.");
		}
		sc.close();
	}
}
