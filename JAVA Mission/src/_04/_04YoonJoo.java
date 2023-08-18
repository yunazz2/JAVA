package _04;

import java.util.Scanner;
/*
 *정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고, 예시 <출력>과 같이 “*” 기호를 출력하는 프로그램을 작성하시오.
  * 1\. n을 입력받기.
  * 2\. 첫번째엔 1, 두번째엔 +2, 3번째엔 두번째에서 +2 해서 별을 그리기... n번째까지
  * 3\. 출력하기
 */
public class _04YoonJoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//String star = "*";
		
		for (int i = 0; i < N; i++) {
			for (int j = N; j > i+1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}