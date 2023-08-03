//[문제] 3,6,9 게임
//- 1~100 사이의 정수를 반복하여 출력하면서, 해당 숫자가 3 또는 6 또는 9 인 경우
//    해당 숫자 대신 그 개수만큼 "*" 을 출력하는 프로그램을 작성하시오.
//  ex)  3   -> *
//       36  -> **
//       
//[조건]
//- 주어진 코드의 변수를 사용하여 코드를 완성하시오.
//- 변수의 초기값을 변경해도 됩니다.

package Project;

public class ThreeSixNine {

	
	// hint 1) 일의 자릿수와 십의 자릿수를 각각 1, 10에 넣기
	// hint 2) 13을 10으로 나눴을 때 몫이 십의 자리가 되고, 나머지가 일의 자리가 된다.
	// hint 3) a and b => **
	//		   a or b => *
	
	// 나는 조건문 안에 직접 조건을 길게 풀어서 썼었는데, 애초에 그 조건을 아래처럼(ex. ln28, ln29) 변수에 넣어서 작성하면 훨씬 간결함.
	int ten = 0;
	int one = 0;
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = one == 3 || one == 6 || one == 9;
			boolean one369 = ten == 3 || ten == 6 || ten == 9;
			
			if((ten369) && (one369)) {
				System.out.println("count : " + i + " => **");
			}
			else if(ten369) {
				System.out.println("count : " + i + " => *");
			}
			else if(one369) {
				System.out.println("count : " + i + " => *");
			}
			else {
				System.out.println("count : " + i + " => 해당 없음");
			}
			
		}
	}
}
