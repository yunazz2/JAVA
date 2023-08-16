/** 완료
학생 5명의 JAVA 프로그래밍 성적을 입력 받아, 1차원 배열에 저장하고 성적을 기준으로 오름차순, 내림차순으로 각각 출력하
시오.
(단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬 방식을 이용하시오. 성적은 정수 0이상 100이하로 주어집니다.)
 */
package _07;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		

		for (int i = 0; i < N; i++) {
			System.out.print("JAVA 프로그래밍 성적 : ");
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {		// 0~4
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp2 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp2;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
