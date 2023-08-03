// 유저에게 밑변과 높이를 입력 받아 삼각형의 넓이 구하기
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변의 길이 : ");
		
		// 입력 받은 밑변의 길이를 변수 a에 저장
		double a = sc.nextDouble();
		
		System.out.print("높이 : ");
		// 입력 받은 높이를 변수 b에 저장
		double b = sc.nextDouble();
		
		// 넓이 = 밑변 X 높이 / 2
		double area = a * b / 2;
		
		System.out.println("넓이 : " + area);
		
		
		sc.close();
	}

}
