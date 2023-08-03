/**
 * 정수 1부터 100까지 의 수를 출력하면서, 해당 수 가 3 또는 6 또는 9에 해당하는 경우
 * 해당 정수 대신에 3, 6, 9가 포함되는 개수만큼 “*” 를 출력하는 프로그램을 작성하시오.
 */
package _03;

public class _03 {
	public static void main(String[] args) {
		
		int ten = 0;
		int one = 0;
		

		for (int i = 1; i <= 100; i++) {

			one = i % 10;
			ten = i / 10;
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			// one369 = i/10==3 or i/10==6 or i/10==9 (i를 10으로 나눴을 때 몫이 3, 6, 9인 것들 ex. 30, 60, 90)
			boolean one369 = one == 3 || one == 6 || one == 9;
			// ten369 = i%10==3 or i%10==6 or i%10==9 (i를 10으로 나눴을 때 나머지가 3, 6, 9인 것들 ex. 13, 26, 39)
			
			if(ten369 && one369) {
				System.out.println(i + " : " + "**");
			}
			else if(ten369) {
				System.out.println(i + " : " + "*");
			}
			else if(one369) {
				System.out.println(i + " : " + "*");
			}
			else {
				System.out.println(i + " : " + i);
			}
		}
	}
}
