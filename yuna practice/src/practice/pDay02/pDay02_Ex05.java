// 삼항 연산자
package practice.pDay02;

public class pDay02_Ex05 {

	public static void main(String[] args) {
		
		int a = 5, b = 14;
		
		// 조건 연산자 (삼항 연산자)
		// 자료형 변수 = (조건) ? (참일 때 문장) : (거짓일 때 문장)
		
		int result = (a < b) ? a-b : b-a;
		
		System.out.println(result);
		
		
	}
}
