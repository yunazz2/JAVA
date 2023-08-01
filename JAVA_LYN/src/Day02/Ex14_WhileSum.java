package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		// 1~100까지의 합계를 구하시오.
		
		int a = 1;
		int sum = 0; // 합계
		while( a <= 100 ) {
			sum = sum + a;
			a = a + 1;
			
		// 고인물 답
//		while( a <= 100 ) {
//			sum += a++;
//		}
			
		}
						
		System.out.println("1부터 100까지의 합 : " + sum);
	}
}
