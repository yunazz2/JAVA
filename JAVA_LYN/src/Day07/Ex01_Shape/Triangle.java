package Day07.Ex01_Shape;

// Shape 클래스를 상속 받음
public class Triangle extends Shape {

	double width, height;
	
	// 생성자
	public Triangle() {
		this(0, 0);
	}
	
	// 자동 완성 (제너레이트 어쩌고 저쩌고 유징 필드)
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	@Override
	double area() {
		// (가로) X (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) * 3
		return width * 3;
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
	
	
}
