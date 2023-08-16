/* 3조 버블 정렬
 버블 정렬이란? 버블 정렬이란 인접한 두 원소를 비교하며, 큰 수를 계속하여 뒤로 보내 정렬하는 방식을 사용(오름 차순으로 정렬하는 경우)하는 정렬 방식
 어떤 대상을 '오름차순'으로 정렬할 때 버블 정렬은 원소를 처음부터 탐색하면서, 큰 수를 계속하여 뒤로 밀어내는 방식을 사용

 5 3 1 10 7로 시작했을 때,
 
 ex)
 5 3 1 10 7
 3 5 1 10 7
 3 1 5 10 7
 3 1 5 10 7
 3 1 5 7 10
 */

package Project;

import java.util.Iterator;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; 						// 배열의 길이가 5인 arr[]를 생성한다.
		
		for (int i = 0; i < arr.length; i++) { 			// 배열의 길이만큼(5) 정수 입력을 반복하여 입력 받은 수를 배열에 순서대로 저장
			System.out.print(i+1 + "번 째 정수 : ");
			arr[i] = sc.nextInt();
		}
		
		// 버블 정렬? 앞에서부터 순서대로 비교하며 큰 수를 뒤로 밀어내는 정렬
		int temp = 0;									// 앞에 있는 수가 더 클 시, 뒤로 밀어내기 위해 빈 변수 생성
		for (int i = 0; i < arr.length-1; i++) {		// 0~4까지 반복을 위해 -1
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {					// 앞의 수가 더 크다면
					temp = arr[j];						// 임시 생성한 빈 변수에 저장
					arr[j] = arr[j+1];					// 뒤의 수를 앞으로 옮겨 넣고
					arr[j+1] = temp;					// 다시 뒤에 빈 변수에 있던 수를 넣는다. 이렇게 계속 밀어 냄
				}
			}
		}
		
		
		// 출력
		System.out.print("버블 정렬 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}