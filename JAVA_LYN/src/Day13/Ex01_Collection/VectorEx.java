package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	
	/**
	 * List 출력 메소드
	 * @param list
	 */
	
	// list<?>로 쓴 이유는 벡터의 요소를 String으로 받을 수 있게하고, 벡터의 요소를 Integer로도 받게하기 위해.
	public static void printList(List<?> list) {
		
		if(list == null || list.isEmpty()) {
			System.out.println("요소가 없습니다.");
			return;
		}
		
		Iterator<?> it = list.iterator();
		while(it.hasNext()) {
			Object item = it.next();
			System.out.print(item);
			
			if(it.hasNext()) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// 컬렉션 객체 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		
		// 벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		
		// 벡터 요소 추가
		vector.add("아메리카노");
		vector.add("청포도에이드");
		vector.add("인크레드불");
		vector.add("초코우유");
		
		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size());		// 요소의 개수
		System.out.println("용량 : " + vector.capacity());	// 배열의 칸 개수
		System.out.println();
		
		// 검색
		// 반복 방법1
		System.out.println(">> 반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);			
		}
		System.out.println();
		
		// 반복 방법2
		System.out.println(">> 반복 2");
		for (String item : vector) {
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법3
		// Iterator를 이용한 반복
		// iterate : 반복하다, iterator : 반복자
		// 해당 리스트 컬렉션으로부터 Iterator 객체를 가져와서 반복할 수 있음
		
		// Iterator 메소드
		// hasNext() 		  : 다음 요소의 존재 여부
		// next() 			  : 다음 요소를 반환
		// 컬렉션객체.iterator() : 해당 컬렉션에 대한 iterator 객체를 반환
		
		System.out.println(">> 반복 3");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			
			if(it.hasNext()) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println(">> 삭제");
		// 삭제
		// 삭제할 때 index가 앞으로 한 칸씩 당겨진다.
									// 	  0			1		   2		   3
									// 아메리카노	청포도에이드	인크레드불		초코우유
		vector.remove(0);			// 청포도에이드 인크레드불		 초코우유
		vector.remove(1);			// 청포도에이드 초코우유
		vector.remove("청포도에이드");	// 초코우유
		vector.remove("초코우유");		// empty(요소 없음)
		
		printList(vector);
		System.out.println();
		
		
		//컬렉션.isEmpty() : 요소가 하나도 없으면 true, 비어있지 않으면 false
		// 벡터가 비어있으면 true, 아니면 false
		if(vector.isEmpty()) {
			System.out.println("메뉴가 없습니다.");
		}
		else {
			printList(vector);
		}
		
		Scanner sc = new Scanner(System.in);
		List<String> newMenuList = new Vector<String>();
		System.out.println("메뉴 추가하기 (종료 : 0)");
		
		do {
			System.out.print("추가 메뉴 : ");
			String menu = sc.nextLine();
			if(menu.equals("0")) break;
				newMenuList.add(menu);
		}
		while(true);
		
		System.out.println("##### [vector] #####");
		printList(vector);
		System.out.println("##### [newMenuList] #####");
		printList(newMenuList);
		
		vector.addAll(newMenuList);		// vector <- newMenuList의 요소 모두 추가
		System.out.println("##### [vector] #####");
		printList(vector);
		
		
		
		sc.close();
	}	
}
