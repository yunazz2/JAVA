// 궁금한 점) 결과가 두 줄 나오는데... 왜 두 줄로 나오지..? => for문, foreach문 이렇게 두 개 썼으니까 바보야...................
package Day03;

public class Ex04_Foreach {

	public static void main(String[] args) {
		String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print( week[i] + " ");
		}
		System.out.println();
		
		// foreach : ctrl + space
		// foreach문 : 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		// for( 요소타입 요소명 : 배열 ) { }
		for(String day : week) {
			System.out.print(day + " "); // day : week[i]
		}
		System.out.println();
	}
}


// 결과

//월요일 화요일 수요일 목요일 금요일 토요일 일요일 
//월요일 화요일 수요일 목요일 금요일 토요일 일요일 
