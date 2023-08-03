// 원의 넓이
package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex13 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		
		double rad = sc.nextDouble();
		
		double area = PI * rad * rad;
		
		System.out.println("원의 넓이 : " + area);
		
		sc.close();
	}
}
