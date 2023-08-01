package Day01;

public class Ex06_Character {

	public static void main(String[] args) {
		
		// 리터럴(Literal)이란? : 소스코드에 표기하는 데이터 (숫자인지 문자인지 문자열인지 의미를 부여)
		char c1 = 'A'; // 문자 리터럴 : 'A' (작은 따옴표)
		char c2 = 65; // 십진수 : 아스키코드표에 매핑된 문자이고 65는 A이다.
		char c3 = '\u0041'; // 앞에 \(백슬래시)를 붙여 유니코드로 지정했으며, 해당 유니코드는 A이다.
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;
		
		// 코드를 아래처럼 작성하고 run하면 에러가 나는 이유
		// char b =   c2   +   1; => c2가 char이기 때문에
		//			(char) + (int)
		//			 2byte + 4byte => char가 더 작은 박스라 int를 구겨 넣어야 함.
		char b = (char) (c2 + 1); // int인 1을 char로 강제 형변환 시켜 에러 방지
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + uniCode);
		System.out.println("b : " + b);
		
	
	}

}

// 만약 문제가 나온다면 유저에게 문자 ex.A 를 입력받아 3칸 뒤의 문자를 출력하게 하는 문제가 나올 수 있음
// => 그럼 답은 D가 출력되어야 함.