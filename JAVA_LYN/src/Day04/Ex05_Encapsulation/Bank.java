package Day04.Ex05_Encapsulation;

public class Bank {

	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(0, "새마을금고", "9003-2438-16335", "이유나");
		
		// ec.deposit = 100000; => 그냥 이렇게 쓰면 Encapsulation 클래스에서 캡슐화를 해놔서 에러가 남. => 아래처럼 setter로 제어해야 함.
		ec.setDeposit(100000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
}
