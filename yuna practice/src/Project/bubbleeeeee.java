// 인터넷에서 찾은 버블 정렬 코드

package Project;

import java.util.Scanner;

public class bubbleeeeee {
	public static void main(String[] args) {
//		Bubble sort 실습 : 5개의 정수를 입력 후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오.
//		1) 패키지명, 클래스명, 메소드명을 요구사항에 맞게 제작
//		2) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함.(정수 5개 입력받는 배열사용)
//		3) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함.
//		4) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함.
//		5) 마지막에 첫 번째 수와 마지막 수를 합한 값을 출력할 수 있어야 함.
		
//		입력받을 Scanner 선언
		Scanner sc = new Scanner(System.in);
		
//		int형 배열 arr을 선언 및 초기화
		int [] arr = new int[5];
		
//		정수 5개 입력받는 반복문
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
//		반복문으로 2개씩 비교(첫 번째 자료와 두 번째 자료, 두 번째 자료와 세 번째 자료 ..)하여 더 작은 수가 앞으로 올 수 있도록 정렬
		for(int i = 0; i < arr.length-1; i++) { // 입력받은 배열 반복 0 ~ 4까지
			// -i를 하는 이유 -> 제일 큰 수가 맨 마지막으로 정렬이 됨 (맨 마지막은 비교 안해도 됨)
			for(int j = 0; j < arr.length-1-i; j++) { // 앞 숫자와 뒤 숫자 서로 비교할 반복문
				// ex) j = 0일 때, arr[0] > arr[0+1]로 앞자리가 숫자가 더 크다면
				if(arr[j] > arr[j+1]) {
					// 값을 옮겨주기 위해 tmp 변수 선언하여 큰 숫자인 arr[0]에 있는 값을 담아준다.
					int tmp = arr[j]; 
					// 그리고 비어있는 앞자리에 숫자가 작은 뒷자리 숫자를 arr[0]에 넣어준다.
					arr[j] = arr[j+1]; 
					// 임시로 tmp에 담아뒀던 큰 숫자를 arr[0+1]자리에 담아주면서 위치를 바꿔준다.
					arr[j+1] = tmp; 
				}
			}
		}
		
		System.out.print("정렬된 결과 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 작은수 ~ 큰수 정렬된 순서
		}
		System.out.println();
		
		System.out.println("정렬 후 첫 번째 수와 마지막 수의 합 : " + (arr[0] + arr[arr.length-1]));
		sc.close();
	}
	
}
