package Day02;

import java.util.Scanner;

public class Ex11_Grade {

	public static void main(String[] args) {
		// 학점을 입력받아 점수대를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하세요. : ");
		String grade = sc.next();
		//String grade = sc.next().toUpperCase(); => 유저에게 소문자로 입력 받아도 강제로 대문자로 바꿔 줌
		
		switch (grade) {
			case "A": System.out.println("90~100점 입니다."); break;
			case "B": System.out.println("80~90점 입니다."); break;
			case "C": System.out.println("70~80점 입니다."); break;
			case "D": System.out.println("60~70점 입니다."); break;
			case "F": System.out.println("60점 미만입니다."); break;
			default: System.out.println("A~F 사이의 문자를 입력해주세요.");	break;
		}
		sc.close();
	}
}
