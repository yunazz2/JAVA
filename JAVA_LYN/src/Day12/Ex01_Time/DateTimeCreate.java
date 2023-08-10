package Day12.Ex01_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/*
 * java.time 패키지에 있는 LocalDate, LocatTime 클래스
 */

public class DateTimeCreate {

	public static void main(String[] args) {
		System.out.println("[LocalDate]");		
		// LocalDate : 날짜를 다루는 클래스
		LocalDate nowDate = LocalDate.now();			// 현재 날짜 정보를 갖는 객체를 생성
		System.out.println("현재 날짜 : " + nowDate);
		
		LocalDate endDate = LocalDate.of(2024, 1, 24);	// 날짜 정보를 지정하여 객체 생성
		System.out.println("종료 날짜 : " + endDate);
		
		System.out.println();
		
		// LocalTime : 시간을 다루는 클래스
		System.out.println("[LocalTime]");
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		LocalTime endTime = LocalTime.of(18, 20, 00);
		System.out.println("종료 시간 : " + endTime);
		
		System.out.println();
		
		// LocalDateTime : 날짜/시간을 다루는 클래스
		System.out.println("[LocalDateTime]");
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 1, 24, 18, 20, 00);
		System.out.println("종료 시간 : " + endTime);
		
		// 협정 세계시와 타임존(TimeZone)
		// UTF : 협정 세계시 - 국제 표준시
		// 서울 : Asia/Seoul
		// 뉴욕 : America/New_York
		// 일본 : Japan
		// 로마 : Europe/Rome
		
		System.out.println();
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 표준시 : " + seoulDateTime);
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 표준시 : " + newYorkDateTime);
		
		ZonedDateTime japanDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println("일본 표준시 : " + japanDateTime);
		
		ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("로마 표준시 : " + romeDateTime);
		
		System.out.println();
		// 윤년 isLeapYear() 메소드로 확인 가능하다.
		// 2월 29일
		LocalDate ld = LocalDate.now();
		// LocalDate.isLeapYear() : 윤년이면 true, 아니면 false를 반환하는 메소드
		
		if(ld.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월 29일까지");
		}
		else {
			System.out.println("올해는 평년 : 2월 28일까지");
		}
		
		System.out.println();
		
		// 사용 가능한 타임존 아이디
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String ZoneId : timeZoneId) {
			System.out.println(ZoneId);
		}
	}
}