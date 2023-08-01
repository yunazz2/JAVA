package Day02;

import java.util.Scanner;

public class Ex08_ElseIf {

	public static void main(String[] args) {
		// 유저에게 성적을 입력받아 학점을 출력하시오.
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 60점 이상이면 D
		// 60점 미만이면 F

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		String result = "";
		
		if( score >= 90 )
			result = "A";
		else if( score >= 80 )
			result = "B";
		else if( score >= 70 )
			result = "C";
		else if( score >= 60 )
			result = "D";
		else
			result = "F";
		
		System.out.println("당신의 학점은 " + result + "입니다.");
				
		sc.close();
	}
}


// 결과

//점수를 입력하세요. : 89
//당신의 학점은 B입니다.
