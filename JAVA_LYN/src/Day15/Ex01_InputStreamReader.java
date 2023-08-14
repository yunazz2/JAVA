/**
 * [문자 스트림 클래스]
 */
package Day15;

import java.io.InputStreamReader;

public class Ex01_InputStreamReader {

	public static void main(String[] args) {
		// 문자 스트림 클래스
		// System.in : 키보드로부터 입력을 받는 인자
		InputStreamReader is = new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			
			try {
				ch = (char) is.read();	// 입력 스트림으로부터 한 글자씩 읽어 옴.

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// read() 메소드로 더 이상 읽어올 문자가 없으면 -1을 반환 (ctrl + z 입력)
			if(ch == -1) {
				break;
			}
			
			System.out.println(ch);
		}
	}
}
