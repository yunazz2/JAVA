package Day07.Ex01_Shape;

public class Rectangle extends Shape {

	
	double width, height;
	
	// 기본 생성자
	public Rectangle() {
		this(0, 0);
	}
	
	// 매개 변수 생성자 => 자동 완성 (제너레이트 어쩌고 저쩌고 유징 필드)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	double area() {
		// 사각형 넓이 = 가로 X 세로
		return width * height;
	}

	@Override
	double round() {
		// 직사각형 둘레 = (가로 + 세로) * 2
		return (width + height) * 2;
	}

	
	// getter, setter
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	
	// toString()
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
