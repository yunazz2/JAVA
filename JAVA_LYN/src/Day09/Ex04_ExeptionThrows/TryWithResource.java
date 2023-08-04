// try구문에
package Day09.Ex04_ExeptionThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
	
	public static void main(String[] args) {
		
		// try(자동으로 자원해제 할 객체 생성) { }
		// : finally 구문에서 close()하지 않아도, 자동으로 자원 해제를 해준다.
		// * AutoCloable 인터페이스를 구현한 클래스이여야 자동으로 자원 해제 가능
		try (FileInputStream fis = new FileInputStream("test.txt")){
			 //=>  test.txt 파일을 입력받는 객체
			
			int read = 0;
			
			while((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // => 예외 발생 원인을 단계적으로 추적하여 출력하는 메소드
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) { // IOException = InputOutputException
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		// 위에 try구문에 ()로 자동 자원 해제 객체를 생성해서 아래처럼 따로 안 써도 됨
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
	

}
