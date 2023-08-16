// 다양한 형식으로 람다식을 만들어보자
package Day16.Ex01_Lambda;


@FunctionalInterface
interface FuncInterface1 {void mothod();} // 반환 타입이 없고, 매개 변수도 없는 경우

@FunctionalInterface
interface FuncInterface2 {void method(String a, String b);} // 반환 타입이 없고, 매개 변수가 String인 경우

@FunctionalInterface
interface FuncInterface3 {String method();} // 반환 타입이 있고, 매개 변수가 없는 경우

@FunctionalInterface
interface FuncInterface4 {String method(String a, String b);} // 반환 타입


public class LabdaFormat {
	
	public static void main(String[] args) {
		// FuncInterface1 - 반환 타입, 매개 변수가 없는 람다식
		FuncInterface1 fi1 = () -> System.out.println("자바람다식1");	// 한 문장이면 중괄호 생략 가능
		fi1.mothod();
		
		
		// FuncInterface2 - 매개 변수 있는 람다식
		FuncInterface2 fi2 = (a, b) -> {String result = a + b; System.out.println(result);};
		fi2.method("자바", "람다식2");
		
		
		// FuncInterface3 - 반환 타입이 있는 람다식
		FuncInterface3 fi3 = () -> {String a = "자바"; String b = "람다식3"; return a + b;};
		String result3 = fi3.method();
		System.out.println(result3);
		
		// FuncInterface4 - 반환 타입, 매개 변수가 있는 람다식
		FuncInterface4 fi4 = (a, b) -> a + b; // return 문만 있다면 return, {} 생략 가능
		String result4 = fi4.method("자바", "람다식4");
		System.out.println(result4);
	}
}
