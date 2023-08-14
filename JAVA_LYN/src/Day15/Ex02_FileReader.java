/**
 * [문자 스트림 클래스]
 */
package Day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {

	public static void main(String[] args) {
		
		//FileReader - 문자 스트림 클래스
		// new FileReader("파일 경로");
		FileReader fr = null;
		
		try {
			fr = new FileReader("./src/Day15/Test.txt");	// 문자열 파일 경로 지정
			int data = 0;
			
			// read() : 한 문자씩 읽어와서 int 타입으로 반환
			// 			더 이상 읽어올 문자가 없으면 -1 반환
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			System.out.println("인코딩 타입 : " + fr.getEncoding());
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.err.println("문자 입력시 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
