package Day03;

public class Ex08_String {

	public static void main(String[] args) {
		// String은 참조 자료형
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a == c); // 서울의 Hello와 서울의 Hello를 비교해서 true
		System.out.println(a == d); // 서울의 Hello와 인천의 Hello를 비교해서 false!!!
		System.out.println(a.equals(d)); // 지역 상관없이 문자열 자체만 비교해서 true
		
		System.out.println(e == f); //false
		System.out.println(e.equals(f)); //true
		
		// ==		: 해당 변수의 레퍼런스(참조 정보)를 비교
		// equals()	: 해당 변수의 문자열 자체를 비교
		
	}
}

// 결과

//true
//false
//true
//false
//true
