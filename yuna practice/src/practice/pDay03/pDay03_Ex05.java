// 2차원 배열 출력하기
package practice.pDay03;

public class pDay03_Ex05 {

	public static void main(String[] args) {
		
		int arr[][] = {{1, 2, 3}, {4, 5, 6}};

		
		// [1] [2]
		// [3] [4]
		
		// for문
		// for( 1초기식 ; 2조건식 ; 4증감식 )
		//	{ 3실행문; }
		// 실행 순서 : 1 -> 반복(2 -> 3 -> 4)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
