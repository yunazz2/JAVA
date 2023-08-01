// 2차원 배열로 값을 입력받고 출력하기
package Day05.Review;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_Matrix {

	public static void main(String[] args) {
		// 양수 M과 N을 입력 받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력 받고 그대로 출력하시오.
		
		// 입력 예씨
		// M : 2
		// N : 3
		// => 1 2 3
		//    4 5 6
		
		// 출력 예시
		// => 1 2 3
		//    4 5 6		
		
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M][N];
		
		// 2차원 배열은 이중 반복문으로 접근한다.
		// 바깥 반복문			- 반복 변수 i => 행 접근
		// 안쪽 반복문			- 반복 변수 j => 열 접근
		// arr.lengh		=> 행의 크기
		// arr[i].length	=> 열의 크기
		
		// 입력 부분
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력 부분
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		// 위와 같이 X헹, Y열의 2차원 배열을 생성하고,
		// 순서대로 값을 입력받아 그대로 출력해보세요.
		// 단, 출력 시 foreach문을 사용
		
		System.out.print("X : ");
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int arr2[][] = new int[X][Y];
		
		// 입력 부분
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 출력 부분 -> foreach문 사용
		// for( 요소타입 요소명 : 배열 ) { }
		for (int[] row : arr2) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
