package Day01;

// 외부 클래스를 포함시키기
// import 패키지명.클래스명;
import java.util.Scanner;

public class Ex02_Scanner {

	// main : ctrl + space
	public static void main(String[] args) {
		// 객체 생성 - new
		// 클래스타입 객체명 = new 클래스명();
		// 표준 입력 객체 - Scanner
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		// 3ln인 import가 원래 없었는데 12ln중 Scanner 끝에 커서를 두고 ctrl + space를 하면 자동으로 scanner 패키지를 가져와준다.
		// 에러? => 빨간색 밑줄로 표시되며, 프로그램 실행 불가능
		// 경고? => 노란색 밑줄로 표시되며(14ln의 sc), 경고가 발생해도 프로그램은 실행 가능
		
		System.out.print("a : ");
		int a = sc.nextInt(); //nextInt() : 정수 하나를 입력받는 메소드 => 유저가 입력한 정수를 sc.nextInt();에 받아서 a라는 변수에 저장
		
		System.out.println("a : " + a);
		// "문자열" : 문자열은 큰 따옴표로 표현한다.
		// + : 문자열 연결 연산자
		// 정수 하나를 입력 받았으나 해당 정수 +를 사용하여 문자열로 변환하여서 문자열 + 문자열로 나타나게 했다. 
		
		// close() : Scanner 객체를 메모리에서 해제하는 메소드
		sc.close();
		// 여기까지하면 14ln의 sc에 노란 밑줄이 사라짐.
		// Scanner 객제가 닫힌 후에는 입력을 할 수 없다.
		// close 되었기 때문에 지금 이 라인 뒤에 Scanner sc 객체를 다시 사용할 수 없다는 뜻
		
	}
}
