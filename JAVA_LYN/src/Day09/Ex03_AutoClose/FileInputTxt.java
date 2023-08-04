package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {
	
	public static void main(String[] args) {
		
		// 스트림 : 실제 입력이나 출력이 표현된 데이터 흐름
		
		// 입력 받을 수 있는 데이터 : 키보드로부터 입력한 키, 파일 등
		// (키보드)or(파일) --> [스트림] --> [프로그램]
		
		// 입력 스트림 클래스 : InputStream
		// 파일 스트림 클래스 : FileInputStream
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test.txt"); // test.txt 파일을 입력할 수 있도록 연결
			
			int read = 0;
			
			// fis.read() : .txt 파일의 데이터를 한 글자씩 읽어오는 메소드
			// - 더 이상 읽어올 데이터가 없으면 -1을 반환
			// 가져올 글자가 없을 때까지 반복한다.
			while((read = fis.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			// FileNotFoundException : 파일이 없을 때 발생하는 예외
			e.printStackTrace(); // 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace(); // 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
			System.err.println("입출력 관련 예외 발생");
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
