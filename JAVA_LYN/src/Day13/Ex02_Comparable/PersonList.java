// Person 클래스에서 만든대로 숫자가 아닌! 객체끼리 비교하여 나이가 적은순부터 많은 순으로 오름 차순 정렬 출력
package Day13.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class PersonList {

	public static void main(String[] args) {
		
		Person p1 = new Person("이유나", 28);
		Person p2 = new Person("김유나", 20);
		Person p3 = new Person("황유나", 24);
		Person p4 = new Person("강유나", 15);
		Person p5 = new Person("최유나", 30);
		
		LinkedList<Person> personList = new LinkedList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		// Person 객체에 구현된 compareTo() 메소드의 비교기준으로 정렬
		Collections.sort(personList);
		
		for (Person person : personList) {
			System.out.println(person.name + " : " + person.age);
		}
		
	}
}
