// 다차원 배열(비정방 행렬)
package practice.pDay03;

import java.util.Iterator;
import java.util.Scanner;

public class pDay03_Ex06 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];

		// arr 배열의 각 행에 대한 열의 개수
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[1];
		
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받는 부분
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력하는 부분
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
