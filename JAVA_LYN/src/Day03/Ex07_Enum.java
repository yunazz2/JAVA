// 열거 타입
package Day03;

// Ex07. Enum 파일처럼 Rainbow 파일을 따로 안 만들어도 되고 아래처럼 현재 페이지에 enum을 만들어도 된다.
enum Test { A, B, C, D, E, F };

public class Ex07_Enum {

	public static void main(String[] args) {
		// ENUM(열거 타입) : 요소들을 명명한 값으로 집합을 이루는 자료형
		// => 열거 타입은 enum 파일로도 정의할 수 있고, 클래스 파일 내에서 정의할 수도 있다.
		// [특징]
		// 1. enum을 비교할 때는 값 뿐만 아니라 타입도 비교한다.
		// 2. enum의 상수값이 재정의 되어도 다시 컴파일 할 필요가 없다.
		
		// values() : 열거체의 모든 요소를 배열로 반환
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		
		System.out.println();
		
		// value0f : 전달된 문자열과 일치하는 열거체 상수를 반환
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.print("G : " + G);
		
		System.out.println();
		
		// ordinal() : 해당 열거체 상수가 정의된 순서 index를 반환
		// green의 순서를 반환
		int index = G.ordinal();
		System.out.println("GREEN 의 index : " + index);
	}
}

// 결과
//
//RED ORANGE YELLOW GREEN BLUE INDIGO VIOLET 
//G : GREEN
//GREEN 의 index : 3
