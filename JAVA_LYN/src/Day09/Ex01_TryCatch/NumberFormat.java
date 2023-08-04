package Day09.Ex01_TryCatch;

public class NumberFormat {
	
	public static void main(String[] args) {
		
		String strNum = "10";
		int num = 10;
		
		System.out.println("10 + 20 : " + (strNum + 20));
		System.out.println("10 + 20 : " + (num + 20));
		
		
		String numberString = "10";
		String numberAndString = "a10";
		
		// Integer.parseInt("문자열 숫자")
		// : 문자열 숫자를 int 타입의 숫자로 변환하는 메소드
		int num1 = Integer.parseInt(numberString); 		// 변환 가능
		
		int num2 = 0;
		
		// 예외 메시지 : java.lang.NumberFormatException: For input string: "a10"
		try {
			num2 = Integer.parseInt(numberAndString); 	// 변환 불가
			
		} catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열을 숫자 타입으로 변환할 수 없습니다.");
		}
		
		System.out.println("num1 + 10 : " + (num1+10));
		System.out.println("num2 : " + num2);
		
	}

}
