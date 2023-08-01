package Day02;

public class Ex15_OddEven {

	public static void main(String[] args) {
		// 1~20 까지의 정수 중 홀수의 합계, 짝수의 합계를 각각 구하여 출력하세요.
		
		
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while( a <= 20 ) {
			if( a % 2 == 1 ) {
				sum1 = sum1 + a;
				a = a + 1; // 고인물은 14ln + 15ln 내용 합친 sum1 += a++; 로 씀..
			}
			if( a % 2 == 0 ) {
				sum2 = sum2 + a;
				a = a + 1;
			}
		}
			
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}
}
