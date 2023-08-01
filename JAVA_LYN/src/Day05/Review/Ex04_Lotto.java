package Day05.Review;

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		// 공식 : (int) (Math.random() & [개수] + [시작 숫자])
		int random = (int) (Math.random() * 45 + 1);
		System.out.println("random : " + random);
		
		// 1~20 사이의 랜덤 수 출력해보기
		int random2 = (int) (Math.random() * 20 + 1);
		System.out.println("1~20 random : " + random2);
		
		
		// -20~20 사이의 랜덤 수 출력해보기
		int random3 = (int) (Math.random() * 41 -20);
		System.out.println("-20~20 random : " + random3);
		
		System.out.println("----------------------------");
		
		int lotto[] = new int[6];
		// 1~45사이의 랜덤 수 6개를 중복 제거하고 오름차순으로 정렬
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto[i] = num;
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (num == lotto[j])
					i--;
			}
		}
		
		// 오름차순 정렬
		// 1. i번째 요소를 선택, 나머지 요소들과 비교
		// 2. (선택 요소) < (비교 요소) → 자리 교환
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				// 선택 요소 : lotto[i]
				// 비교 요소 : lotto[j]
				if (lotto [i] > lotto [j]) {
					// 두 요소를 교환
					int temp = lotto[i];
					
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}	
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
