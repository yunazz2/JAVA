package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// offer()			: 요소 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		for (Integer item : queue) {
			System.out.println("item : " + item);
		}
		
		// poll()			: head에서 데이터를 삭제하고 삭제된 값을 반환
		queue.poll();						// 값 1 삭제
		int remove1 = queue.poll();			// 값 2 삭제
		System.out.println("삭제2 : " + remove1); // 값 2 삭제한 내용 반환
		
		
		// peek()			: head에 있는 값을 반환
		System.out.println("Last item : " + queue.peek());
	}
}
