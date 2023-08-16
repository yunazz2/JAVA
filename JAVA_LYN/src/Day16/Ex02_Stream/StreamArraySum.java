package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySum {
	
	// 배열의 합계를 출력할 때 보통 메소드를 이렇게 썼었다.
	public static int method1(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	// 그런데 stream을 이용해서 위 내용을 이렇게 간단하게 작성할 수 있다.
	public static int method2(int[] arr) {
		return Arrays.stream(arr).sum();
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int result1 = method1(arr);
		int result2 = method2(arr);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
	}
}
