package Day01;

public class Ex09_Long {

	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32개 : 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits) : 2^64개
		
		long ln1 = 1000;
		long ln2 = 2100000000;
		
		// long 타입 리터럴 : 숫자L
		long ln3 = 2200000000L;		
		// int에는 22억 이상을 담을 수 없다. => 그래서 long에 담아야 한다.
		
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		
		
	}
}
