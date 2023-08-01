package Day02;

import java.util.Scanner;

public class Ex10_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 선택하세요. : ");
		int channel = sc.nextInt();
		
		// switch 구문 단축키 : ctrl + space
		switch (channel) {
		case 11:
				System.out.println("MBC - 나 혼자 산다");
				break;
				
		case 15:
				System.out.println("JTBC - 킹 더 랜드");
				break;
				
		case 27:
				System.out.println("Mnet");
				break;
				
		case 1:
				System.out.println("넷플릭스 - 하트 시그널");
				break;
		
		case 2:
				System.out.println("디즈니 플러스 - ");
				break;
		
		case 3:
				System.out.println("쿠팡 플레이 - SNL");
				break;
		
		default:
				System.out.println("유효한 채널 번호를 입력하세요.");
			break;
		}
		
		sc.close();
	}
}
