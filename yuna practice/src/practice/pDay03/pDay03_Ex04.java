// foreach문으로 요일 출력하기
package practice.pDay03;

public class pDay03_Ex04 {

	public static void main(String[] args) {
		
		String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// 그냥 for문으로 week라는 배열 안의 요소들을 공백을 두고 출력할 때
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		} //월요일 화요일 수요일 목요일 금요일 토요일 일요일
		
		System.out.println();
		
		for (String day : week) {
			System.out.print(day + " ");
		} //월요일 화요일 수요일 목요일 금요일 토요일 일요일
	}
}
