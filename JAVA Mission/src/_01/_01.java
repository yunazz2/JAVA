/**
 * 학생의 영어, 수학, 자바 성적을 각각 정수형 변수 eng, math, java 로 선언하고,
 * 순서대로 점수를 입력 받아 성적의 총 합계와 평균을 계산하여 출력하는 프로그램을 작성하시오.
 */
package _01;

import java.util.Scanner;

public class _01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어, 수학, 자바 성적을 공백을 두고 입력하세요 : ");
		
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println();
		
		sc.close();
		
		sum = eng + math + java;
		avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
