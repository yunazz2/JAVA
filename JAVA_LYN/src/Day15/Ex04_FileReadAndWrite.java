/**
 * [문자 스트림 클래스]
 */
package Day15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {

	public static void main(String[] args) {
		
		// 콘솔 창에 직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		// => 문자열을 입력하고 마지막에 ctrl + z 단축키 입력(EOF)
		// EOF(End Of File) : 파일의 끝이다 라는것을 알려주는 키워드
		InputStreamReader is = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fw = new FileWriter("./src/Day15/Test3.txt");
			while((data = is.read()) != -1) {		// 읽고
				fw.write(data);						// 쓰고
			}
			is.close();
			fw.close();
			
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
		
	}
}
