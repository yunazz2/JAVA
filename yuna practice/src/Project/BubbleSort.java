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

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5, 3, 1, 10, 7};
		int a = 0; // 더 큰 수를 저장할 변수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				}
			}
				
		}
			System.out.println();

	}
}