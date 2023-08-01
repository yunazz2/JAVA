// 중첩 조건문
package Day02;

import java.util.Scanner;

public class Ex09_Neted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 유저에게 학년, 점수를 입력 받아 아래 합격 기준에 따라 합격 불합격 여부를 나타내시오.
		// 정보처리기사 자격증 합격 기준
		// 응시 자격 : 4학년, 60점이상 => 합격
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 중첩 if문은 사실 권장하지 않는다. if안에 계속 중첩시키면 가독성이 떨어지기 때문에.
		if(year == 4) {
			
			if(score >= 60) {
				System.out.println("합격 입니다!");
			}
			else {
				System.out.println("불합격 입니다..");
			}
		}
		else {
			System.out.println("응시 자격 요건에 해당되지 않습니다.");
		}
		
		
		// 중첩시키지않고 아래처럼 조건을 줄 수 있다.
		// 조건1) 합격 입니다! => 4학년이면서 점수가 60점 이상
		if(year == 4 && score < 60) {
			System.out.println("합격 입니다!");
		}
		
		// 조건2) 불합격 입니다.. => 4학년이면서 점수가 60점 미만
		if(year == 4 && score < 60) {
			System.out.println("불합격 입니다..");
		}
		
	
		// 조건3) 응시 자격 없음
		if(year !=4) {
			System.out.println("응시 자격 요건에 해당되지 않습니다.");
		}
		
		
		sc.close();
	}
}
