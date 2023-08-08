package Day10.Ex04_Wrapper;

public class ValueCompare {

	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		// byte 범위 안에서는 같은 레퍼런스로 쓰인다.
		System.out.println(System.identityHashCode(intObj1));
		System.out.println(System.identityHashCode(intObj2));
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과 : " + (intObj1 == intObj2));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue()));
		
		System.out.println();
		
		// equals() : wrapper 객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
		
		System.out.println("----------------------------------------");
		
		
		/**
		 * ==, != 기호로 wrapper 객체를 비교하면, 아래의 범위에서는 내부의 값을 ==, != 기호로 바로 비교 가능
		 * Boolean		: true, false
		 * int			: byte의 범위에서 언박싱 안해도 바로 비교 가능 (-128~127)
		 * char			: \u0000 ~ \u007f
		 */

		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 : " + (intObj3 == intObj4));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()));
		
		System.out.println();
		
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
		
	}
}
