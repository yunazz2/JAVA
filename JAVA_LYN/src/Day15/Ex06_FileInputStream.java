/**
 * [바이트 스트림 클래스]
 */
package Day15;

import java.io.FileInputStream;

public class Ex06_FileInputStream {

	public static void main(String[] args) {
		
		byte[] data = new byte[100];		// byte 배열 생성
		
		try {
			FileInputStream fin = new FileInputStream("./src/Day15/Test.out");	// * txt파일이 아닌 바이트 확장자임
			
			int i = 0, b;
			while((b = fin.read()) != -1) {
				data[i] = (byte) b;			// 읽어 온 바이트 b를 바이트 배열에 형 변환하여 대입
				i++;
			}
			
			for (byte a : data) {
				System.out.print((char) a);
			}
			System.out.println();
			
			fin.close();
			
		} catch (Exception e) {
			System.out.println("입출력 시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
