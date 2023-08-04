// try구문에
package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
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
		
	}
	

}
