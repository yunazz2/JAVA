// lotto 당첨 번호 생성기
/**
정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오.
즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번
반복하시오.
*/
package _06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		int arr[] = new int[6];
		
		System.out.print("몇 게임? : ");
		N = sc.nextInt();
		
		Random random = new Random();
		
		int num[][] = new int[N][6]; // 2차원 배열 생성 => [게임 수][뽑을 수 개수]
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				num[i][j] = (int) (Math.random() * 45 + 1);
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			for (int j = 0; j < 6; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
