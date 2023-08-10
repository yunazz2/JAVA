package Day12.Ex02_Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) throws ParseException {
		/*
		 *  yyyy : 4자리 연도 			/ yy : 2자리 연도
		 *  MM	 : 2자리 월  			/ M  : 1자리 월
		 *  dd   : 2자리 일  			/ d  : 1자리 일
		 *  D	 : 올해의 몇 번째 일
		 *  w	 : 올해의 몇 주차
		 *  W	 : 이번 달의 몇 주차
		 *  E	 : 요일
		 *  a	 : 오전/오후
		 *  HH	 : 시(24시) 			/ hh : 시(12시)
		 *  mm	 : 분
		 *  ss	 : 초
		 */
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(now));
		
		
		String day = "2023/08/09";
		// 지정한 날짜형식으로 문자열 날짜를 분석하여 Date 객체 생성
		Date date = new SimpleDateFormat("yyyy/MM/dd").parse(day); // Date --> "2023/08/09"
		sdf = new SimpleDateFormat("yyyy/M/d");
		System.out.println(sdf.format(date));	// Date --> "2023/8/9"
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("올해 첫 날부터 D번째 날");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("이번 달 첫 날부터 d번째 날");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("올해의 w주차 입니다.");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("이번 달의 W주차 입니다.");
		System.out.println(sdf.format(date));
		
	}
}

// 결과
//23. 8. 9. 오전 11:51
//2023/8/9
//2023년 08월 09일
//2023년 08월 09일 오전 00:00:00
//올해 첫 날부터 221번째 날
//이번 달 첫 날부터 9번째 날
//올해의 32주차 입니다.
//이번 달의 2주차 입니다.

