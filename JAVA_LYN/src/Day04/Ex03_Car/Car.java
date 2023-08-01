package Day04.Ex03_Car;

public class Car {

	// 모델명, 속도
	String model;
	private int speed;
	
	
	// 생성자
	public Car() {
		
	}


	public Car(String model) {
		this.model = model;
	}


	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}


	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 지정하는 메소드
	// 게터/세터 이름 : getName(), setName()
	// - get/set 뒤에 변수명 첫 글자를 대문자로해서 메소드에 정의 => 카멜 형태로.(관례)
	// 자동완성 가능 : alt + shift + S -> R
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		// 아래는 캡슐화 -> 차의 최저 속도 및 최고 속도를 제한 한 것. => 이렇게 하고 CarEx 클래스에서 실행해보면 스피드를 -100으로 지정해도 0으로 출력되고, 스피드를 500으로 지정했어도 최고 속도인 300으로 나올 것이다.
		if(speed < 0)
			speed = 0;
		
		if(speed >= 300)
			speed = 300;
		
		this.speed = speed;
		
	}
	
	
		
}
