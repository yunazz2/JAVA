package Day09.Ex03_AutoClose;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_ExceptionThrows {

	static Scanner sc = new Scanner(System.in);
	// => static은 프로그램 시작할 때 제일 처음에 메모리에 고정을 해서 프로그램이 끝날 때까지 실행된다.
	
	public static void main(String[] args) {
		try {
			// input() 메소드에서 예외를 떠넘겨서 호출한 곳에서 예외 처리를 해야한다.
			input();		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요.");
		}
	}
	
	// 예외 전가(예외 던지기, 예외 떠넘기기) - throws
	// : 예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것
	public static void input() throws InputMismatchException {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		System.out.println(input);
	}
}
