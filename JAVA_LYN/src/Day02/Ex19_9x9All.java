// 구구단을 1단부터 9단까지 모두 출력하세요.
package Day02;

public class Ex19_9x9All {

	public static void main(String[] args) {
		// (단)X(1~9)
		// 단에 대한 반복 : 1~9
		// 각 단에 곱 : 1~9
	
		
		// A X B
		// i : 단(A)
		for (int i = 1; i <= 9; i++) {
//			System.out.print(i + "*" + 1 + "=" + i*1);
			
			//j : 곱(B)
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + i*j);
				System.out.print("\t"); // 탭 만큼 공백
			}
			System.out.println();
		}
	}
}
