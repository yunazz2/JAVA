package Day11.Ex02_Util;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// StringTokenizer
		// 구분 문자를 기준으로 문자열을 분리하는 클래스
		// - 구분 문자		 : (탭) / . 등등
		// - 토큰(token)  : 구분 문자로 분리된 문자열
		
		String java = "클래스,생성자,상속,오버로딩,오버라이딩,추상클래스,인터페이스";
		StringTokenizer st = new StringTokenizer(java, ",");
		// => 구분자를 여러 개 쓰기도 가능
		// String java = "클래스/생성자,상속.오버로딩-오버라이딩,추상클래스/인터페이스";
		// StringTokenizer st = new StringTokenizer(java, "/,.-");
		
		// countTokens() : 분리한 토큰의 개수
		System.out.println("토큰의 수 : " + st.countTokens());
		
		// hasMoreTokens() : 토큰이 남아있는지 확인 (true/false)
		while(st.hasMoreElements()) {
			// nextToken() : 다음 토큰을 반환
			System.out.print(st.nextToken() + " ");
		}
		System.out.println();
	}
}
