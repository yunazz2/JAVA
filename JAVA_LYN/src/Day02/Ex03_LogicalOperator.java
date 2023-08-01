package Day02;

public class Ex03_LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		
		// AND (&&) => A AND B : A와 B 둘 다 true일 때, 결과가 true
		// 			   F     F => F
		// 			   F     T => F
		// 			   T     F => F
		// 			   T     T => T
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println();
		
		// OR(||) => A OR B : A와 B 둘 중 하나라도 true일 때, 결과가 true
		//			 F    F => F
		//			 T    F => T
		//			 F    T => T
		//			 T    T => T
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 < 20) || (5 > 2));
		System.out.println();
		// => 위에 코드들중 노랗게 데드코드라고 나오는 이유는, 어차피 앞에서 벌써 true로 나왔기 때문에 뒤에는 더 볼 필요 없어서.
		// => 그게 쇼트 서킷
		
		
		// XOR(^) => A XOR B : A와 B가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		
		// NOT(!) => !A : A true 이면 false, false 이면 true로 변환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		
		// 쇼트 서킷 : 논리 연산의 결과를 미리 알아서 남은 논리식을 굳이 확인하지 않는 것
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		System.out.println();
		
		
		// 비트 연산(연산 기호를 하나만 써도 된다.) => 비트연산자의 경우는 쇼트 서킷이 적용되지 않는다.
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4);
		
	}
}


// 결과

//true
//false
//
//true
//true
//true
//true
//
//false
//true
//false
//
//false
//true
//
//false
//3
//true
//3
//
//false
//4
//true
//4
