package Day11.Ex02_Util;

import java.util.Calendar;

public class CalendarEx {

	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; 		// Month는 0~11로 나온다. 그래서 +1 필요
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 	// 일~토(1~7)
		int hour = cal.get(Calendar.HOUR);				// 12시 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);	// 24시 표시
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(msg + " : " + year + "/" + month + "/" + day + "/ ");
		
		
		// 일요일(1) ~ 토요일(7)
		String Day = "";
		switch (dayOfWeek) {
		case Calendar.SUNDAY:		Day = "일요일"; break;
		case Calendar.MONDAY:		Day = "월요일"; break;
		case Calendar.TUESDAY:		Day = "화요일"; break;
		case Calendar.WEDNESDAY:	Day = "수요일"; break;
		case Calendar.THURSDAY:		Day = "목요일"; break;
		case Calendar.FRIDAY:		Day = "금요일"; break;
		case Calendar.SATURDAY:		Day = "토요일"; break;
		}
		System.out.print(Day);
		System.out.print("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM) {
			System.out.print("오전 ");
		}
		if(ampm == Calendar.PM) {
			System.out.print("오후 ");
		}
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
	
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar test = Calendar.getInstance();
		// 월(MONTH) : 0~11 (+1 필요)
		test.set(2024, Calendar.JANUARY, 24);
		
		// 오늘 ~ 종강일 D-day
		// getTimeMillis() : 날짜를 ms(밀리초) 단위까지 숫자로 반환
		// 1970년 1월 1일 0시 0분 0초 0ms 부터 카운트 한 숫자를 반환
		// 0.001초 : 1ms
		// 60초 : 1분
		// 60분 : 1시간
		// 24시 : 1일
		long nowT = now.getTimeInMillis() / (1000 * 60 * 60 * 24);
		long testT = test.getTimeInMillis()/ (1000 * 60 * 60 * 24);
		
		System.out.println(nowT);
		System.out.println(testT);
		System.out.println("1970년 1월 1일 ~ 오늘 날짜까지 일 수 : " + nowT);
		System.out.println("1790년 1월 1일 ~ 종강 날짜까지 일 수 : " + testT);
		System.out.println("D-Day : " + (testT-nowT) + "일");
		
		
		if(now.before(test)) {
			System.out.println("종강 전입니다.");
		}
		else if(now.after(test)) {
			System.out.println("수업이 종료된 강의입니다.");
		}
	}
}