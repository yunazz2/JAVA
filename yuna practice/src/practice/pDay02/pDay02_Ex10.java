// Switch : 보통 if문으로 조건을 걸기엔 너무 많은 범위를 포함할 때나 if문을 중첩적으로 사용하지 않고 간단한 조건식을 만들 때 사용
// if문은 조건식이 참 또는 거짓일 경우 판단하는데, switch는 if와 다르게 값을 가지고 판단한다.
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 입력해주세요. : ");
		int channel = sc.nextInt();
		
		switch(channel) {
		
		case 3:
			System.out.println("tvN");
			break;
		
		case 5:
			System.out.println("SBS");
			break;
		
		case 7:
			System.out.println("KBS");
			break;
			
		case 11:
			System.out.println("MBC");
			break;
		
		default:
			System.out.println("유효한 채널 번호를 입력하세요.");
			break;
		}
		
		sc.close();
	}
}
