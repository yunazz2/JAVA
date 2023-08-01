package Day01;

import java.util.Scanner;

public class Ex03_InputOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// x, y, z 값을 유저에게 입력받아서 합계, 평균 내기
		int sum = x + y + z;
		int avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg 평균 변수가 정수형(int)라서 소수 부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 정수를 사용해야한다.
		
		sc.close();
	}
}
