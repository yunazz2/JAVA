/**
 * 다음의 <조건> 에 따라 화폐매수를 구하는 프로그램을 작성하시오.
 * <조건>
(1) 화폐는 고액권을 우선으로 지급, 나머지 금액은 그 다음 단위의 화폐 순서로 지급한다.
(2) 화폐 단위는 50000원, 10000원 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원의 10가지 종류가 있다.
(3) 입력데이터는 성명, 간식비 지급액이며, 성명의 입력이 "QUIT" 이면 입력의 끝으로 간주한다.
(4) 출력은 성명, 간식비 지급액, 개인별 각 화폐 매수, 마지막에 전체 화폐 매수를 출력한다.

[입력]
솔라 623,843원
문별 728,394원
휘인 432,942원
화사 942,783원

[출력]
성명			  출장비 오만원 만원 오천원  천원 오백원 백원 오십원 십원 오원  일원
솔라 			623843  12   2   0    3    1   3    0   4   0   3
문별 			728394  14   2   1    3    0   3    1   4   0   4
휘인 			432942   8   3   0    2    1   4    0   4   0   2
화사 			942783  18   4   0    2    1   2    1   3   0   3
전체 화폐매수 :			52  13   1   10    3   12   2   15  0   12
 */
package _10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class _10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("최대 성명 수를 입력하세요: ");
        int maxSize = scanner.nextInt();
        
        String[] names = new String[maxSize];
        int[] travelExpenses = new int[maxSize];
        
        int currentIndex = 0;
        while (currentIndex < maxSize) {
            System.out.print("성명을 입력하세요 (QUIT으로 종료): ");
            String name = scanner.next();
            
            if (name.equals("QUIT")) {
                break; // 입력 종료
            }
            
            System.out.print("출장비 지급액을 입력하세요: ");
            int expense = scanner.nextInt();
            
            names[currentIndex] = name;
            travelExpenses[currentIndex] = expense;
            currentIndex++;
        }
        
        System.out.println("입력된 내용:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("성명: " + names[i] + ", 출장비 지급액: " + travelExpenses[i]);
        }
        
        scanner.close();
    }
}