// 유저에게 입력받은 x, y, z 세 정수에 대한 합계와 평균 구하기
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		System.out.print("z값 입력 : ");
		int z = sc.nextInt();
		
		int sum = (x + y + z);
		int avg = sum / 3;
		
		System.out.println("합은 : " + sum + " 입니다.");
		System.out.println("평균은 : " + avg + " 입니다.");
		
			
		sc.close();
		
	}

}
