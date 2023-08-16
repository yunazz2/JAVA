package Day16.Ex02_Stream;

import java.util.Scanner;

public class LottoriaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임 ? : ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			int lotto[] = new int[6];
			
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45 + 1);
				lotto[j] = rand;
				
				// 중복 제거
				for (int k = 0; k < j; k++) {
					if(rand == lotto[k]) {
						j--;
						break;
					}
				}
			}
			
			// 해당 게임의 랜덤 수들을 정렬
			for (int j = 0; j < lotto.length-1; j++) {
				for (int k = 0; k < lotto.length; k++) {
					if(lotto[j] > lotto[k]) {
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
					}
				}
			}
			
			// 출력
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
