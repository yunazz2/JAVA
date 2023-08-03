// Shape이라는 애가 가질 수 있는 좌표 값 클래스
package Day07.Ex01_Shape;

public class Point {

	int x, y;
	
	// 기본 생성자
	public Point() {
		this(0, 0);
	}

	
	// 매개 변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	// toString() alt + shift + s -> Generate toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
