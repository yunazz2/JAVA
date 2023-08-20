// HashSet : 중복되지 않는 요소를 다루는 컬렉션
package Day13.Ex01_Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
   : 순서가 없고, 중복요소를 허용하지 않는 컬렉션
   
   요소 추가
   - add()			: 중복이 아니면 요소를 추가(true)
   					  중복이면, 추가를 안 함(false)
   
   요소 검색
   - contains()		: 해당 요소가 존재하면 true
   - isEmpty()		: 요소가 하나도 없으면 true
   - size()			: 요소의 개수를 반환
   
   요소 삭제
   - remove()		: 해당 요소를 삭제
   					* index가 없으므로, 객체로만 삭제할 수 있다.
   
 */

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		
		// 1, 2, 3, 4, 5
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3345));
		System.out.println(set.add(4));
		System.out.println(set.add(5));
		
		for (Integer item : set) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		// 이미 존재하는 3, 5를 추가
		System.out.println(set.add(3));
		System.out.println(set.add(5));
		// => 이미 있는 값들이기 때문에 false를 반환 함.
		
		for (Integer item : set) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		set.remove(3345);
		set.remove(5);
		System.out.println("size : " + set.size());
		
		for (Integer item : set) {
			System.out.println("item : " + item);
		}
	}
}
