package Day13.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class UserList {

	public static void main(String[] args) {

		LinkedList<User> userList = new LinkedList<User>();
		
		User u1 = new User("id1", "홍조은", 20);
		User u2 = new User("id2", "박조은", 30);
		User u3 = new User("id3", "유조은", 10);
		User u4 = new User("id4", "김조은", 30);
		User u5 = new User("id5", "장조은", 20);
		User u6 = new User("id6", "김부평", 30);
		User u7 = new User("id7", "정조은", 30);
		User u8 = new User("id8", "권조은", 10);
		User u9 = new User("id9", "고조은", 10);
		User u10 = new User("id10", "송조은", 20);
	
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);
		
		// Collections.sort(리스트, Comparator 구현 객체)
		// - 오버라이딩 한 compare 메소드의 기준에 따라서 정렬한다.
		Collections.sort(userList, new User());
		
		for (User user : userList) {
			System.out.println("ID : " + user.id + "\t" + "/ name : " + user.name + "/ age : " + user.age);
		}
	}
	
	
}
