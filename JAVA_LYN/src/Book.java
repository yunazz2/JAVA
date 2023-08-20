
public class Book {

	String title;
	int price;
	
	// 기본 생성자
	public Book() {
	}

	
	// 생성자
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println(title + "의 가격은 " + price + "원 입니다.");
	}
	
}
