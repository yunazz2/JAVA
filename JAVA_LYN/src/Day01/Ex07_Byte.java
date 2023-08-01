package Day01;

public class Ex07_Byte {

	public static void main(String[] args) {		
		// byte는 1byte 범위의 데이터를 표현
		// 8bits (0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면 -128~127 범위로 표현 가능
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		// byte var5 = 128; => 코드 실행시 에러 발생
		// => Type mismatch -> 타입이 불일치, 데이터 범위를 벗어남(오버플로우) 양수 byte는 0~127까지임.
		byte var5 = (byte) 128;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	
	
	
	}
}
