// 구구단 전체 출력하기
package practice.pDay02;

public class pDay02_Ex19 {

	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.print("몇 단? : " + i);
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + i * j);
				System.out.println();
			}
			System.out.println();
		}
	}
}
