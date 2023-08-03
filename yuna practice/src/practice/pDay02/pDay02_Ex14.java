// while문을 사용하여 1~100까지의 합 구하기
package practice.pDay02;

public class pDay02_Ex14 {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum = sum + a;
			a = a + 1;
			
//			sum += a++; // ln11~ln12를 이 한 줄로 나타낼 수 있다.
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}
}
