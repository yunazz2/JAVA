// 다차원 배열(비정방 행렬)
package Day03;

import java.util.Scanner;

public class Ex06_Arrays2 {

	public static void main(String[] args) {
		// 정방 행렬 2행 3열로 배열 생성
		// [][][]
		// [][][]
		
		// 비정방 행렬로 배열 생성
		// [][]
		// [][][][]
		// [][][]
		
		int arr[][] = new int[3][];
		// 첫 번째 차원의 배열 요소에 접근해서 각각 배열을 생성한다.
		// [] -> [][]
		// [] -> [][][][]
		// [] -> [][][]
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
