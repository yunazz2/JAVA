package practice.pDay01;

import java.util.Scanner;

public class pDay01_Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전원 : ");
		
		boolean onoff = sc.nextBoolean();
		
		
		if(onoff) {
			System.out.println("전원 ON");
		}
		else {
			System.out.println("전원 OFF");
		}
		
		
		sc.close();
		
	}
}
