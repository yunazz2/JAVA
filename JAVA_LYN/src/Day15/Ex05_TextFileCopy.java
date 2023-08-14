/**
 * [문자 스트림 클래스]
 */
package Day15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_TextFileCopy {

	public static void main(String[] args) {
		// Test.txt 파일을 Test4.txt 파일로 복사
		FileReader fr = null;	// 파일을 읽기위해 파일 리더 객체 생성
		FileWriter fw = null;	// 파일을 쓰기위해 파일 쓰기 객체 생성
		
		int data = 0;
		
		try {
			fr = new FileReader("./src/Day15/Test.txt");	// 읽어 올 파일
			fw = new FileWriter("./src/Day15/Test4.txt");	// 읽어 온 파일을 복사하여 다시 저장 할 파일
			
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test4.txt");
			
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
