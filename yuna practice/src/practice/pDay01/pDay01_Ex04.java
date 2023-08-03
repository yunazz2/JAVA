// 유저에게 입력받은 x, y, z 세 정수에 대한 합계와 평균을 구하되 평균을 실수로 나타내기
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x의 값 : ");
		int x = sc.nextInt();
		
		System.out.print("y의 값 : ");
		int y = sc.nextInt();
		
		System.out.print("z의 값 : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		double avg = sum / 3;
		
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + avg);
		
				
		sc.close();
	}
}
