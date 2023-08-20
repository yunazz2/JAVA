/**
자바프로그래밍_1_자바
학생 5명의 JAVA 프로그래밍 성적을 입력 받아, 1차원 배열에 저장하고 성적을 기준으로 오름차순, 내림차순으로 각각 출력하시오
(단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬 방식을 이용하시오. 성적은 정수 0이상 100이하로 주어집니다.)

<조건> JAVA API에서 제공되는 메소드는 이용하지 않는다.
(입력)
90 35 75 100 65

(출력)
35 65 75 90 100
100 90 75 65 35
 */
package Ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 성적을 입력할까요? : ");
		int N = sc.nextInt(); // 5명 입력 받을 변수
		
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {	// 0~4
			System.out.print(i+1 + "번 째 학생의 JAVA 성적 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		
		int temp;
		for (int i = 0; i < arr.length; i++) { 			// 0 1 2 3 4
			for (int j = 0; j < arr.length-1; j++) {	// 0 1 2 3 => 맨 마지막 숫자는 비교할 필요 없으니까
				if(arr[j] > arr[j+1]) { 				// 앞의 수가 뒤의 수 보다 더 크다면
					temp = arr[j];						// 그 큰 수를 임시 변수에 저장하고
					arr[j] = arr[j+1];					// 뒤에 있던 작은 수를 앞으로 옮기고
					arr[j+1] = temp;					// 다시 그 뒤에 임시 변수에 저장해 둔 큰 수를 옮긴다.
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int temp2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					temp2 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp2;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();
	}

}
