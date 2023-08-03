// 만들어둔 Trianle, Rectangle, Circle 클래스를 구현하는 클래스

/**
 * 아래의 <조건>에 따라 ShapeMaker 클래스를 작성하시오.

- main() 메소드를 정의 하시오.
- 1. 삼각형, 2. 사각형, 3. 원형 으로 각 도형의 종류를 선택하시오.
- 선택된 도형에 따라 필요한 변수를 입력 받아 객체를 생성하시오.
- 여러 개의 도형 객체를 입력 받아, 리스트에 추가하시오.
- “그만"을 입력하면, 리스트에 존재하는 도형들의 둘레와 넓이를 출력하시오.
- 마지막으로, 도형들의 둘레 총합과 넓이 총합을 출력하시오.
 */

package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape shape = null;
				
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		// 입력 받은 도형 정보 배열
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while (true) {
			
			if(index == 3) {
				break;
			}
			
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			
			if(input.equals("그만")) {
				break;
			}
			
			switch (input) {
			// 삼각형
			case "1":
				System.out.print("가로>>");
				width = sc.nextDouble();
				
				System.out.print("세로>>");
				height = sc.nextDouble();
				
				shape = new Triangle(width, height);
				shapeList[index++] = shape;				
				break;
			case "2":
				System.out.print("가로>>");
				width = sc.nextDouble();
				
				System.out.print("세로>>");
				height = sc.nextDouble();
				
				shape = new Rectangle(width, height);
				shapeList[index++] = shape;				
				break;
			
			case "3":
				System.out.print("반지름>>");
				radius = sc.nextDouble();
				
				shape = new Circle(radius);
				shapeList[index++] = shape;
				break;
			}
		} // while 끝
		
		for (Shape s : shapeList) {
			if(s == null) {
				continue;				
			}
			
			// instanceof 명령어 : 인스턴스를 비교하는 연산
			if(s instanceof Triangle)
				System.out.println("[삼각형]");
			if(s instanceof Rectangle)
				System.out.println("[사각형]");
			if(s instanceof Circle)
				System.out.println("[원형]");
			
			// 출력
			double area = s.area();
			double round = s.round();
			
			areaSum = areaSum + area;
			roundSum = roundSum + round;
			
			System.out.print("넓이 : " + area + "\t");
			System.out.print("둘레 : " + round + "\t");
			System.out.println();
			
		}
		System.out.println("넓이의 총 합 : " + areaSum);
		System.out.println("둘레의 총 합 : " + roundSum);
		
		sc.close();
	}

}
