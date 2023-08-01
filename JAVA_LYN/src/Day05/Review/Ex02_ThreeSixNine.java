// 1~100까지의 정수중 3 6 9를 포함하면 해당 개수만큼 * 출력하기
package Day05.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1~100까지 반복하면서,
		// 해당 수가 3 or 6 or 9 일 때,
		// 369가 되는 개수만큼 "*"을 출력하는 프로그램을 작성하시오.
		// ex) 3 --> "*"
		//	  36 --> "**"
		//	  40 --> 40
		
		
		for (int i = 1; i <= 100; i++) {
			
			int ten = i / 10;
			int one = i % 10;
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			boolean one369 = (one == 3 || one == 6 || one == 9);
			
			// 십의 자리, 일의 자리 둘 다 3 6 9를 포함 --> "**"
			if (ten369 && one369) {
				System.out.println("count : " + i + " => **");
			}
			
			// 십의 자리, 일의 자리 둘 중 하나라도 3 6 9를 포함 --> "*"
			else if (ten369 || one369) {
				System.out.println("count : " + i + " => *");
			}
			else {
				System.out.println("count : " + i);
			}
		}
	}
}
