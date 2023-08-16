package Day16.Ex01_Lambda;

interface SmartCalc {
	int cal(int x, int y);
}

public class LambdaToParameter {

	public static void main(String[] args) {
		// 최댓값
		SmartCalc sc1 = (x, y) -> {return (x > y)? x : y;};
		
		// x~y까지 합계
		SmartCalc sc2 = (x, y) -> {
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum += i;
			}
			return sum;
		};
		
		smartCalc(sc1, 10, 20);
		smartCalc(sc2, 1, 10);
	}
	
	public static void smartCalc(SmartCalc sm, int a, int b) {
		int result = sm.cal(a, b);
		System.out.println("result : " + result);
	}
}
