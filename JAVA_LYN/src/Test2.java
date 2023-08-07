// 재귀 함수 이해하기
public class Test2 {
	
	public static void method(int N) {
		System.out.println(N);
		// 종료 조건
		if(N == 0) {
			return;
		}
		
		method(N-1);
	}

	public static void main(String[] args) {
		method(5);
	}

}