// while문을 사용하여 1~20 까지의 정수 중 홀수의 합계, 짝수의 합계를 각각 구하여 출력하기
package practice.pDay02;

public class pDay02_Ex15 {

	public static void main(String[] args) {
		
		int a = 1;
		int even = 0;
		int odd = 0;
		
		while (a <= 20) {
			if (a % 2 == 0) {
				even += a++;				
			}
			else {
				odd += a++;
			}
			
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		
	}
}
