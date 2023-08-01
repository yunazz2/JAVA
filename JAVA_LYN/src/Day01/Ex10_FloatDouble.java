package Day01;

public class Ex10_FloatDouble {
	
	public static void main(String[] args) {
		// 실수 타입 변수 선언
		double var1 = 3.14D; // double 타입은 리터럴 D 생략 가능
		
		float var2 = 3.14F; // float 타입 리터럴 : 실수F
		
		// 실수형 정밀도
		double var3 = 0.123456789123456789;
		float var4 = 0.1234567891263459F;
		
		// 원주율 (파이)
		double PI = Math.PI;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("원주율 PI : " + PI);
	}
	
}


//결과
//var1 : 3.14
//var2 : 3.14
//var3 : 0.12345678912345678
//var4 : 0.12345679
//원주율 PI : 3.141592653589793
