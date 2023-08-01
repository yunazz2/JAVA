// 인자 전달
package Day04.Ex06_PassingArgument;

public class CallByValue {

	// sum 메소드 ///////////////////////////////////////////
	public static int sum(int a, int b) {
		a = 100;
		b = 200;
		System.out.println("**** sum 메소드 ****");
		System.out.println("(a,b) : " + a + ", " + b);
		int sum = a + b;
		return sum;
	}
	///////////////////////////////////////////////////////
	
	// main 메소드 //////////////////////////////////////////
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("**** main 메소드 ****");
		System.out.println("(a,b) : " + a + ", " + b);
		System.out.println();
		
		// sum 메소드 호출
		int sum = sum(a, b);
		System.out.println("sum : " + sum);
		System.out.println();
		
		System.out.println("**** sum 메소드 호출 후****");
		System.out.println("(a,b) : " + a + ", " + b);
		System.out.println();
	}
}
