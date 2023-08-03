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

import java.util.Scanner;

public class _04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(N);
		
		sc.close();
	}
}
