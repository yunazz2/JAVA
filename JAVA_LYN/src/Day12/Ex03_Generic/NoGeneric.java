// 제네릭 기법을 안 씀
package Day12.Ex03_Generic;

// 상품을 만든다고 했을 때, 상품을 정의 할 클래스 만들기

// 나는 옷을 팔겠다!
class Cloth { }

class Product1 {
	private Cloth cloth = new Cloth();

	// getter, setter
	public Cloth getCloth() {
		return cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
}

// 나는 컴퓨터를 팔겠다!!
class Computer { }

class Product2 {
	private Computer computer = new Computer();

	// getter, setter
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}

public class NoGeneric {
	
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth(new Cloth());
		System.out.println(product1.getCloth());
		
		Product2 product2 = new Product2();
		product2.setComputer(new Computer());
		System.out.println(product2.getComputer());
		
		/**
		 * 클래스를 정의할 때, 타입을 이미 결정 함.
		 * product1에 cloth만 사용할 수 있게 세팅을 해놨고,
		 * product2에 computer만 사용할 수 있게 세팅을 해놔서
		 * 아래처럼 사용은 불가
		 */
		
//		product1.setCloth(new Computer()); // 불가능
//		product2.setComputer(new Cloth()); // 불가능
		
		
			
	}
}
