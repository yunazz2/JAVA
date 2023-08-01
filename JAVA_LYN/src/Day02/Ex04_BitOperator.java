// 비트 연산은 사실 쓸 일이 많지 않다

package Day02;

public class Ex04_BitOperator {
	public static void main(String[] args) {
		
		// 비트 AND연산
		int result = 20 & 16;
		System.out.println(result);
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		
		
		// 비트 OR연산
		int result2 = 20 | 16;
		System.out.println(result2);
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		
		
		// 비트 XOR연산
		int result3 = 20 ^ 16;
		System.out.println(result3);
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		
		
		// 비트 NOT연산
		// ~0001 0100	(=> 십진수로 20)
		// ----------
		//  1110 1011	(=> 십진수로 235)
		int result4 = ~20;
		System.out.println(result4);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		
		
		
		// int는 4byte == 32bit
		// 0000 0000 0000 0000 0000 0000 0001 0100	(=> 십진수로 20)
		// 1111 1111 1111 1111 1111 1111 1110 1011	(=> 십진수로 -21)
		
		// 최상위 비트 (MSB)
		// 부호(+/-)가 있는 수의 경우는 최상위 비트를 부호비트로 사용한다.
		// 0 -> 양수
		// 1 -> 음수
		
		// 1의 보수 연산 : 비트를 전부 뒤집는 것(ex. 0 -> 1, 1 -> 0 변환)
		
		// 2의 보수 연산 : 1의 보수 연산에 +1 해주는 것
		// 0000 0000 0000 0000 0000 0000 0000 0100	(=> 십진수로 2)
		// 1111 1111 1111 1111 1111 1111 1111 1011	=> 1의 보수 연산
		//										+1
		// 1111 1111 1111 1111 1111 1111 1111 1110	=> -2
		
		
		// 시프트 연산
		// - 산술 시프트 ( <<, >> ) : 부호 비트를 유지하면서, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
		// - 논리 시프트 ( <<<, >>> ) : 부호 비트를 포함하여, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
		
		// 0000 0010 -> 2 : 2^1
		// 0000 0100 -> 4 : 2^2
		// 0000 1000 -> 8 : 2^3
		
		System.out.println("<< 연산하면 2배씩 증가");
		System.out.println(2 << 1);	// 왼쪽으로 비트를 1칸 이동
		System.out.println(2 << 3);	// 왼쪽으로 비트를 2칸 이동
		System.out.println(2 << 4);	// 왼쪽으로 비트를 3칸 이동
		System.out.println();
		
		System.out.println(">> 연산하면 1/2배씩 감소");
		System.out.println(16 >> 1);	// 오른쪽으로 비트를 1칸 이동
		System.out.println(16 >> 3);	// 오른쪽으로 비트를 2칸 이동
		System.out.println(16 >> 4);	// 오른쪽으로 비트를 3칸 이동
		System.out.println();

		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1);
		System.out.println(-2 << 3);
		System.out.println(-2 << 4);
		System.out.println();
		
		System.out.println(2 >> 1);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		
		
	
	}
}


// 결과

//16
//10100
//10000
//--------------------
//10000
//
//20
//10100
//10000
//--------------------
//10100
//
//4
//10100
//10000
//--------------------
//100