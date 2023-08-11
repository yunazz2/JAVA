// ArrayList와 LinkedList의 각 특징에 대한 속도 차이 비교해보기
package Day13.Ex01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 순차적으로 요소를 추가
 * ArrayList와 LinkedList의 속도 비교
 * => 결론 : ArrayList가 더 빠르다.
 */

public class ArrayListLinkedList2 {

	public static void main(String[] args) {
		
		// 데이터 삽입/삭제는 LinkedList가 ArrayList보다 빠르다
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		// 밀리초		: 1/1000초	(0.00)
		// 마이크로초	: 10^-6초	(0.000001초)
		// 나노초		: 10^-9초	(0.000000001초)
		
		startTime = System.nanoTime();		// 시스템의 시간을 ns 단위로 출력
		// ArrayList에 데이터 삽입
		for (int i = 0; i < 100000; i++) {
			arrayList.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간 : " + arrayListTime + "ns");
		
		
		startTime = System.nanoTime();		// 시스템의 시간을 ns 단위로 출력
		// ArrayList에 데이터 삽입
		for (int i = 0; i < 100000; i++) {
			linkedList.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long linkedListTime = (endTime - startTime);
		System.out.println("LinkedList 데이터 삽입 시간 : " + linkedListTime + "ns");
		
		System.out.println("--------------------------------------");

		if(arrayListTime > linkedListTime) {
			System.out.println("LinkedList가 데이터 삽입 속도가 더 빠릅니다.");
		}
		else {
			System.out.println("ArrayList가 데이터 삽입 속도가 더 빠릅니다.");
		}
	}
}
