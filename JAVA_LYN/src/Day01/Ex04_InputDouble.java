package Day01;

import java.util.Scanner;

public class Ex04_InputDouble {
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
		double avg = (double)sum / 3;
		// sum이 int라서 (int) / 3(int)라 결과가 정수만 나옴
		// 만약 (double) / (int) 라면 결과가 실수로 나옴
		// 서로 다른 자료형을 연산시, 결과는 큰 자료형으로 반환된다.(double>int)
		// (큰 자료형) + (작은 자료형) = (큰 자료형) => 강제 자료 형 변환
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg 평균 변수가 정수형(int)라서 소수 부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 정수를 사용해야한다.
		
		sc.close();
	}
}