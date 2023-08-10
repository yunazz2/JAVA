package Day13.Ex01_Collection;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		
		System.out.println("empty : " + stack.isEmpty());
		
		// push(요소)		: 요소를 TOP 위에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1 포함 여부 : " + stack.contains(1));
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		
		// peek()		: TOP의 데이터를 반환
		System.out.println("TOP : " + stack.peek());
		System.out.println("sizw : " + stack.size());
		
		// pop()		: TOP의 요소를 삭제
		stack.pop();
		stack.remove(1);			// index로 삭제
		stack.remove((Integer) 3);	// 객체를 지정하여 삭제
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		stack.clear();				// 전체 요소 삭제
		System.out.println("empty : " + stack.isEmpty());
	}

}

// 결과
//empty : true
//empty : false
//1 포함 여부 : true
//item : 1
//item : 2
//item : 3
//item : 4
//TOP : 4
//sizw : 4
//item : 1
//empty : true
