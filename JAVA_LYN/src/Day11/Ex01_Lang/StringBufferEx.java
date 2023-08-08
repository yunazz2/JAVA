package Day11.Ex01_Lang;

public class StringBufferEx {
	
	public static void main(String[] args) {
		// StringBuffer
		// 문자열을 조작하는 클래스
		// -  문자열을 추가/수정/삭제 하는 메소드를 제공
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb);
		
		// append("추가 문자열")							: 문자열 맨 뒤에 새 문자열을 추가
		sb.append(" is Java ");
		System.out.println(sb);
		
		// insert(index, "추가 문자열")						: 지정한 index 위치에 문자열을 추가
		sb.insert(7, " real");
		System.out.println(sb);
		
		// replace(시작 index, 끝 index+1, "대체 문자열")		: 시작 index~끝 index까지 문자열을 새 문자열로 대체
		sb.replace(8, 12, "good");
		System.out.println(sb);
		
		// delete(시작 index, 끝 index+1)					: 시작 index~끝 index까지 문자열을 삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		// setLength(길이)								: 문자열의 길이를 지정
		sb.setLength(4);
		System.out.println(sb);
		
	}
}
