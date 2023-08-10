package Day12.Ex04_WildCard;

import Day03.Class.Pikachu;
import Day03.Class.Raichu;

public class BoxEx {

	public static void main(String[] args) {
		// 제네릭
		// 모든 클래스 타입을 다룰 수 있도록, 클래스와 메소드를 작성하는 기법
		// - 타입 매개변수 : 모든 클래스 타입으로 일반화 한 변수
		// - 객체를 생성할 때, 타입을 결정한다.
		
		// Box box = new Box(); 그 동안은 box 객체를 생성할 때 이렇게 했었다.
		Box<String> box1 = new Box<String>();
		
		box1.setT("쿠팡 택배");
		String boxName = box1.getT();
		System.out.println(boxName);
		
		// * 참조 자료형인 int나 double등은 다룰 수 없다. => 기본형만 다룰 수 있음!(ex. Integer, String)
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(100);
		int value = box2.getT();
		System.out.println(value);
		
		// 내가 박스에다가 피카츄를 담고 싶어! 하면 피카츄 클래스도 담을 수 있다.
		Box<Pikachu> box3 = new Box<Pikachu>();
		box3.setT(new Pikachu());
		Pikachu pikachu = box3.getT();
		System.out.println(pikachu);
		
		// 제네릭 기법의 타입으로는 "클래스"만 사용할 수 있다.
		// 기본형 타입은 지정할 수 없다.
		// Box<int> box = new Box<int>(); => 에러
		
		
		// 다용도 박스를 만들고싶어!
		// - 제네릭 와일드 카드
		// : 알 수 없는 타입을 대체하여 사용하는 기호로, 주로 타입 제한을 주기 위해 사용한다.
		
		// 타입 제한을 주는 방법
		// 1) > super T 	: 해당 클래스부터 상위 클래스를 허용하도록 제한
		// 2) > extends T 	: 해당 클래스부터 하위 클래스를 허용하도록 제한
		
		Box<?> wildcardBox1 = box1;
		Box<? extends Number> wildcardBox2 = box2;
		Box<? super Raichu> wildcardBox3 = box3; // 이건 피카츄도 담을 수 있고 라이츄도 담을 수 있다
		
	}
}
