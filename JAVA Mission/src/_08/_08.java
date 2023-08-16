/** 완료 지그재그
 * 정수 N을 입력 받아, N행 N열의 2차원 배열을 선언하시오. 그리고 배열요소의 1부터 1씩 증가하는 값을 순서대로 저장하면서
 * 행이 증가할 때마다 배열요소에 접근하는 방향을 반대로 하여 값을 저장하고 출력하시오.
 * 
 * [입력]
 * => 3
 * 
 * [출력]
 * 1 2 3
 * 6 5 4
 * 7 8 9
 */
package _08;

import java.util.Scanner;

public class _08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int N = sc.nextInt();
		int n = 1;
		int arr[][] = new int[N][N]; // => 유저가 N에 3을 입력했다면 3X3 배열을 생성한다는 뜻.
		
		
		for (int i = 0; i < N; i++) {
			if(i % 2 == 0) {
//				System.out.print("홀수 행 : ");
				for (int j = 0; j < arr.length; j++) {
					int rrr = arr[i][j] = n++;
					System.out.print(rrr + " ");
				}
//				System.out.println("여기까지 n : " + n);
				System.out.println();
			}
			else {
//				System.out.print("짝수 행 : ");
				n = n + N - 1;
				for (int j = 0; j < arr.length; j++) {
					int rrr2 = arr[i][j] = n--;
					System.out.print(rrr2 + " ");
				}
				n = n + N + 1;
//				System.out.println("여기까지 n : " + n);
				System.out.println();
			}
		}
		sc.close();
	}
}
