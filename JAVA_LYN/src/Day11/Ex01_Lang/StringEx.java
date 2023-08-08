package Day11.Ex01_Lang;

public class StringEx {

	public static void main(String[] args) {
		String str1 = " TheJoEun Academy ";
		String str2 = " theJoEun Academy ";
		
		System.out.println(str1.charAt(2));					// index에 있는 문자 추출
		System.out.println(str1.concat(str2));				// str1 + str2 문자열 연결
		System.out.println(str1.contains("Academy"));		// 문자열 포함 여부 확인(true / false)
		System.out.println(str1.equals(str2));				// 문자열 일치 여부 확인(true / false)
		System.out.println(str1.equalsIgnoreCase(str2));	// 대소문자 구분없이 문자열 일치 여부 확인(true / false)
		System.out.println(str1.indexOf("A")); 				// 해당 문자의 첫 index 반환, 없으면 -1
		System.out.println(str1.lastIndexOf("e"));	 		// 해당 문자의 마지막 index 반환, 없으면 -1
		System.out.println(str1.trim());					// 문자열 양끝 공백 제거
		System.out.println(str1.length());					// 문자열의 길이 (글자 수) [공백 포함]
		System.out.println(str1.substring(10));				// index 앞의 문자열을 자르고, 뒤의 문자열을 반환
		System.out.println(str1.substring(10,17));			// index - (index-1)까지 반환
		
		System.out.println();
		System.out.println(str1.replace(" ", "*")); 		// replace("기존 문자", "대체 문자")
		System.out.println(str1.replaceAll(" ", "*"));  	// replace와 같음
		System.out.println(str1.toUpperCase());				// 모두 대문자로 변경
		System.out.println(str1.toLowerCase());				// 모두 소문자로 변경
		
		// split("구분자") : (구분자)를 기준으로 문자열을 잘라서 배열로 반환
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + " : \t " + sp[i]);			
		}
		
		String cal = "10+20";
		String[] num = cal.split("\\+");					// 정규 표현식의 + 기호가 아닌 산술연산자 +로 구분하려면, 앞에 \\(백슬래시) 두 개를 붙여주어야 한다.
		System.out.println("피연산자1 : " + num[0]);
		System.out.println("피연산자2 : " + num[1]);
	}
}
