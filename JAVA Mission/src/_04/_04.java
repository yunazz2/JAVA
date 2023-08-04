/*
 * 정수 하나를 입력 받아, 정수형 변수 N에 초기화시키고, 예시 <출력>과 같이 “*” 기호를 출력하는 프로그램을 작성하시오. 
 * 
 * 입력
 * => 5
 * 
 * 출력
         *
        ***
       *****
      *******
     *********
 * 
 */
package _04;

import java.util.Iterator;
import java.util.Scanner;

public class _04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		
		int N = sc.nextInt();
		
//		System.out.println(N);
		
		int arr[] = new int[N];
		int a = 1;
		
		for (int i = 1; i <= N; i++) {
			System.out.println("i(" + i + ")" + " : *");
			System.out.println();
			for (int j = 1; j <= arr.length-1; j++) {
				System.out.println("*");
			}
			System.out.println("---------------------");
		}
		
		sc.close();
	}
}