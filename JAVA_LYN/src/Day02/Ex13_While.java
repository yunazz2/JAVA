package Day02;

public class Ex13_While {

	public static void main(String[] args) {
		// 1~10까지 공백을 두고 출력하세요.
		int a = 1;
		
		// while( 조건 ) { 반복 실행문 }
		
//		while( a <= 10 ) {
//			System.out.print(a + " ");
//			a = a + 1;
//		}
		
		// 위와 아래 모두 가능 함
		while( a <= 10 ) {
			System.out.print(a++ + " ");
		}
	}
}
