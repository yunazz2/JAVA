// 오버로딩 이해해보기..
package practice.just______;

public class Overloading {

	public static void main(String[] args) {
		OverloadingMethods om = new OverloadingMethods();

		om.print();
		System.out.println(om.print(3));
		om.print("Hello!");
		System.out.println(om.print(4, 5));
	}
}

class OverloadingMethods {
	public void print() {
		System.out.println("오버로딩1");
	}

	String print(Integer a) {
		System.out.println("오버로딩2");
		return a.toString();
	}

	void print(String a) {
		System.out.println("오버로딩3");
		System.out.println(a);
	}

	String print(Integer a, Integer b) {
		System.out.println("오버로딩4");
		return a.toString() + b.toString();
	}

}

// 결과
//오버로딩1
//오버로딩2
//3
//오버로딩3
//Hello!
//오버로딩4
//45

