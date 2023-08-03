// 유저에게 이름, 나이, 주소를 공백을 두고 입력 받아 순서대로 출력하기
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex14 {

	public static void main(String[] args) {
		System.out.println("이름, 나이, 키 , 주소를 공백을 두고 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		String add = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("주소 : " + add);
		
				
		sc.close();
	}
}
