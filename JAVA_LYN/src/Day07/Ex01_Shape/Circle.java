package Day07.Ex01_Shape;

public class Circle extends Shape {

	
	double radius;
	
	public Circle() {
		this(0);
	}
	
	// 기본 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	double area() {
		// 원의 넓이 = 원주율 * 반지름^2
		return Math.PI * radius * radius ;
	}


	@Override
	double round() {
		// 원의 둘레 = 2 * 원주율 * 반지름
		return 2 * Math.PI * radius;
	}

		
	// getter, setter
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
