// 첫째 줄에 입력할 개수 N을 입력 받고,
// 둘째 줄에 N개의 정수를 공백을 두고 입력받으세요.
// N개의 정수 중 최댓값을 구하여 출력하세요.

// ex
// 입력 : 
// => 5
// => 90 60 70 100 55
// 출력
// => 최댓값 : 100
		
package practice.pDay03;

import java.util.Scanner;

public class pDay03_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]);
				max = arr[i];
		}
		
		System.out.println("최댓값 : " + max);
		
		sc.close();
		
	}
}
