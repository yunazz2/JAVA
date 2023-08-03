// Switch구문을 사용하여 유저에게 입력받은 학점으로 맞는 점수대 출력하기
package practice.pDay02;

import java.util.Scanner;

public class pDay02_Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		
		String grade = sc.next().toUpperCase();
		
		switch (grade) {
		case "A": System.out.println("90~100점 입니다.");
			break;
		case "B": System.out.println("80~90점 입니다.");
			break;
		case "C": System.out.println("70~80점 입니다.");
			break;
		case "D": System.out.println("60점 미만 입니다.");
			break;
		default : System.out.println("올바른 학점을 입력하세요.");
			break;
		}
		sc.close();
	}
}

