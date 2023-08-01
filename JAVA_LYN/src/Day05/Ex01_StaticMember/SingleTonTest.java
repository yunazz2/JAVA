// static을 응용해서 singleton 패턴 작성하기
// static을 활용하면 메모리 공간에 고정을 시킨다.
package Day05.Ex01_StaticMember;

public class SingleTonTest {
	
	public static void main(String[] args) {
		
		SingleTon st01 = SingleTon.getInstance();
		SingleTon st02 = SingleTon.getInstance();
	
		// 인스턴스가 메모리 공간 하나만 할당되어 있는지 확인하기
		System.out.println(st01 == st02);
		
	}

}

// 결과
//true