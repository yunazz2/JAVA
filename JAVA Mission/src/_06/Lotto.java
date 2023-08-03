// 랜덤 로또 당첨 번호 추출기 만들기
// 1) 몇 게임 할 것인가, 2) 오름차순으로 정렬을 어떻게 할 것인가..... => 해결 안됨..ㅠ
package _06;

import java.util.Scanner;

/*
정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오.
즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번
반복하시오.
*/

public class Lotto {

	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxx 사이의 임의 수를 반환
//		double random = Math.random(); // 0부터 1보다 작은 소수를 random 변수에 넣음 ex)0.4xxxxx
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? : ");
		int N = sc.nextInt();
		
		// 1~45 사이의 랜덤한 정수
		// Math.random()					: 0.0xxxx ~ 0.9xxxx
		// Math.random() * 10				: 0.xxxxx ~ 9.xxxxx
		// (int) (Math.random() * 10 + 1)	: 0.xxxxx ~ 9.xxxxx => 우리가 필요한건 1~10이니까 +1하고 소수점을 지우기위해 int로 변환
		
		// Math.random() * 45				: 0.0xxxx ~ 44.xxxx
		// Math.random() * 45 + 1			: 1.0xxxx ~ 45.xxxx
		// (int) (Math.random() * 45 + 1)	: 1 ~ 45
		
		// 공식
		// (int) (Math.random() * 10 + 1)	: 1 ~ 10
		// (int) (Math.random() * 45 + 1)	: 1 ~ 45
		
		// (int) (Math.random() * [개수] + [시작숫자])
//		int 로또번호 = (int) (random * 10); // ln13에서 소수를 넣은 random 변수에 10을 곱함 ex)4.xxxxx
//		
//		System.out.println("랜덤 소수 : " + random);
//		System.out.println("로또 번호 : " + 로또번호);
		
		
//		int result = (int) (Math.random() * 10 + 1 );		
//		System.out.println("1 ~ 45중 랜덤 번호 1개 추출 : " + result); // => 1~45까지의 수 중 랜덤 번호 1개 추출
		
		int num[][] = new int[N][6];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				num[i][j]= (int)((Math.random()*45)+1);
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(i+1 + "게임 : ");
			
			
			
			for (int j = 0; j < 6; j++) {
							
				
				System.out.print(num[i][j] + " ");
								
			}
						
			System.out.println();
			
		}
				
		System.out.println();
		// 여기까지하면 6자리의 랜덤한 숫자가 나온다. 이제 이걸 1) 몇 게임 할 것인가, 2) 오름차순으로 정렬을 어떻게 할 것인가.....
		
sc.close();
			}
		
	}

