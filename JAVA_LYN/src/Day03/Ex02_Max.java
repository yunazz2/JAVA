package Day03;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력 받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으세요.
		// N개의 정수 중 최댓값을 구하여 출력하세요.
		
		// ex
		// 입력
		// => 5
		// => 90 60 70 100 55
		// 출력
		// => 최댓값 : 100
		
		// 순서도
		// 1. 정수 하나를 입력받는다.
		// 2. 입력 받은 정수를 변수 N에 대입한다.
		// 3. N번 반복하여 N개의 정수를 입력받는다.
		// 4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		// 5. 배열 arr를 반복하여, max(최댓값 변수) i번째 요소를 비교한다.
		// 6. 두 요소 중 더 큰 요소를 변수 max에 대입한다.
		// 7. 반복이 끝나고, 변수 max를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		// 1. 정수 하나를 입력받는다.
		// 2. 입력 받은 정수를 변수 N에 대입한다.
		int N = sc. nextInt(); 
		int arr[] = new int[N];
		
		// 3. N번 반복하여 N개의 정수를 입력받는다.
		// 4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 5. 배열 arr를 반복하여, max(최댓값 변수) i번째 요소를 비교한다.
		// !!!! 주의 !!!! 
		// 아래와 같이 max 변수에 0을 넣어놓으면, 유저가 음수를 입력했을 때 당연히 0이 제일 크니까 최댓값이 제대로 안 나옴!
		// 그래서 integer중 음수의 제일 작은 값인 메소드를 사용한다.
		// !!!! int max = 0;!!!!
		int max = Integer.MIN_VALUE; // int 타입에서 나타낼 수 있는 최솟값 : -21억xxxx
		for (int i = 0; i < arr.length; i++) {
			// 6. 두 요소 중 더 큰 요소를 변수 max에 대입한다.
			if( max < arr[i] )
				max = arr[i];
		}
		// 7. 반복이 끝나고, 변수 max를 출력한다.
		System.out.println("최댓값 : " + max);
		
		sc.close();
	}
}
