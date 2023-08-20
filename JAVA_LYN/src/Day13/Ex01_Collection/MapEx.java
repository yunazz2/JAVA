// Map은 key와 value를 동시에 가짐 : Map<K, V>
package Day13.Ex01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * Map
   : 키(key), 값(value)를 쌍으로 구성한 요소를 다루는 컬렉션
   * key는 중복되지 않는다.
   
   요소 추가
   - put(key, value) : 키와 값을 추가
   					 - 중복된 키가 추가되면 마지막에 추가된 값이 저장된다.
   
   요소 검색
   - get(key)				: 키에 해당하는 값 반환
   - contains(key)			: 키 존재 여부
   - containsValue(value)	: 값 존재 여부
   - isEmpty				: 비어있는지 여부
   - size()					: 요소의 개수
   - keySet()				: 모든 키를 Set 객체로 반환
   - values()				: 모든 값을 Collection 객체로 반환
   
   요소 삭제
   - remove(key)			: 키에 해당하는 값 삭제
   - clear()				: 모든 요소 삭제
 */


public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 요소 추가
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 70);
		map.put("정국", 95);
		map.put("뷔", 60);
		map.put("제이홉", 50);
		map.put("지민", 80);
		
		map.put("RM",99);	// 중복된 키를 입력하면, 마지막에 추가한 값으로 지정된다.
		
		System.out.println("총 개수 : " + map.size());
		System.out.println();
		
		System.out.println("지민의 코딩성적 : " + map.get("지민"));
		System.out.println("RM의 코딩성적 : " + map.get("RM")); // 처음에 RM의 코딩 성적을 90으로 주었는데 20ln에서 키(코딩 성적)를 중복으로 입력해서 99로 바뀜
		
		System.out.println();
		
		// keySet() : 모든 키를 가져온다.
		Set<String> ketSet = map.keySet();
		
		for (String key : ketSet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 개수 : " + map.size());
		
		System.out.println();
		
		// Interator를 이용한 반복
		// map.entrySet()		: iterator() 메소드를 갖는 Set 객체 반환
		// entrySet.iterator	: Map 컬렉션을 순차검색할 수 있는 iterator 객체를 가져옴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();		// 키
			Integer value = entry.getValue();	// 값
			
			System.out.println(key + " : " + value);
		}
		
		map.clear();		// 모든 요소 삭제
		
		System.out.println();
		System.out.println("총 개수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());	
		
	}
}

// 결과
//총 개수 : 7
//
//지민의 코딩성적 : 80
//RM의 코딩성적 : 99
//
//슈가 : 70
//정국 : 95
//진 : 100
//뷔 : 60
//지민 : 80
//제이홉 : 50
//RM : 99
//
//총 개수 : 6
//
//슈가 : 70
//정국 : 95
//진 : 100
//뷔 : 60
//제이홉 : 50
//RM : 99
//
//총 개수 : 0
//empty 여부 : true

