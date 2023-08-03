/*
 * 책 제목, 저자명을 갖는 Book 클래스를 정의하고,
 * Book 클래스 타입의 [객체 배열]을 생성하여
 * 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하세요.
 */

package practice.pDay04;

import java.util.Scanner;

class Book {
	String title, author;

	
	public Book() {
		this("제목 없음", "작자 미상");
	}

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}


}

public class pDay04_Ex04 {

	public static void main(String[] args) {
		
		Book[] bookarray = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		// 입력받는 부분
		for (int i = 0; i < bookarray.length; i++) {
			System.out.print("책 제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			bookarray[i] = new Book(title, author);
		}
		System.out.println();
		
		// 출력하는 부분
		for (Book book : bookarray) {
			System.out.println(book);	
		}
		
		sc.close();		
	}
	
}
